package gui;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;

import db.DbIntegrityException;
import gui.listeners.DataChangeListener;
import gui.util.Alerts;
import gui.util.Utils;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.entities.Departamento;
import model.services.DepartamentoService;

public class DepartamentoViewController implements Initializable, DataChangeListener {

	Utils window = new Utils();

	private DepartamentoService service;

	@FXML
	private Button btnDeptoViewBuscar;
	@FXML
	private Button btnDeptoViewNovo;
	@FXML
	private TextField txtDeptoViewBuscar;
	@FXML
	private TableView<Departamento> tbvDeptoView;
	@FXML
	private TableColumn<Departamento, Integer> tbcDeptoViewCodigo;
	@FXML
	private TableColumn<Departamento, String> tbcDeptoViewNome;
	@FXML
	private TableColumn<Departamento, Departamento> tbcDeptoViewEdit;
	@FXML
	private TableColumn<Departamento, Departamento> tbcDeptoViewRemove;

	private ObservableList<Departamento> obsList;

	@FXML
	public void onbtnDeptoViewBuscarAction() {
		if (service == null) {
			throw new IllegalStateException("service estava vazio");
		}
		List<Departamento> list = service.findAll();
		List<Departamento> sList = new ArrayList<>();
		for (Departamento d : list) {
			if (txtDeptoViewBuscar.getText().equals(d.getNome()) || (d.getNome().contains(txtDeptoViewBuscar.getText()) && txtDeptoViewBuscar.getText() != null)) {
				sList.add(d);
			}
			if (txtDeptoViewBuscar.getText() == null || txtDeptoViewBuscar.getText().trim() == ""){
				updateTableView();
			}
				ObservableList<Departamento> obsOne = FXCollections.observableArrayList(sList);
				tbvDeptoView.setItems(obsOne);
				System.out.println(obsOne);
		}
	}

	@FXML
	public void onbtnDeptoViewNovoAction(ActionEvent event) {
		Stage parentStage = Utils.currentStage(event);
		window.newWindow("/gui/FormDepartamento.fxml", "Cadastrar Departamento", parentStage,
				(FormDepartamentoController controller) -> {
					controller.setDepartamento(new Departamento());
					controller.setDepartamentoService(new DepartamentoService());
					controller.subsDataChangeListener(this);
					controller.updateForm();
				});
	}

	public void setDepartamentoService(DepartamentoService service) {
		this.service = service;
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		initializeNodes();
	}

	public void initializeNodes() {
		tbcDeptoViewCodigo.setCellValueFactory(new PropertyValueFactory<>("codigo"));
		tbcDeptoViewNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
		System.out.println("Dados carregados");
	}

	public void updateTableView() {
		if (service == null) {
			throw new IllegalStateException("service estava vazio");
		}
		List<Departamento> list = service.findAll();
		obsList = FXCollections.observableArrayList(list);
		tbvDeptoView.setItems(obsList);
		System.out.println(obsList);
	}
	
	public void initButtons() {
		initButtonEdit(this);
		initButtonDelete(this);
	}

	private void initButtonEdit(DataChangeListener e) {
		tbcDeptoViewEdit.setCellValueFactory(param -> new ReadOnlyObjectWrapper<>(param.getValue()));
		tbcDeptoViewEdit.setCellFactory(param -> new TableCell<Departamento, Departamento>() {
			private final Button button = new Button("...");

			@Override
			protected void updateItem(Departamento obj, boolean empty) {
				super.updateItem(obj, empty);

				if (obj == null || tbvDeptoView.getSelectionModel().getSelectedItem() == null) {
					setGraphic(null);
					return;
				}
				if (obj.getCodigo() == tbvDeptoView.getSelectionModel().getSelectedItem().getCodigo()){
					setGraphic(button);
					
					button.setOnAction(event ->
					window.newWindow("/gui/FormDepartamento.fxml", "Cadastrar Departamento",
						Utils.currentStage(event), (FormDepartamentoController controller) -> {
							controller.setDepartamento(obj);
							controller.setDepartamentoService(new DepartamentoService());
							controller.subsDataChangeListener(e);
							controller.updateForm();
						}));
					return;
				}
			}
		});
	}
	
	private void initButtonDelete(DataChangeListener e) {
		tbcDeptoViewRemove.setCellValueFactory(param -> new ReadOnlyObjectWrapper<>(param.getValue()));
		tbcDeptoViewRemove.setCellFactory(param -> new TableCell<Departamento, Departamento>() {
			private final Button button = new Button("X");

			@Override
			protected void updateItem(Departamento obj, boolean empty) {
				super.updateItem(obj, empty);

				if (obj == null || tbvDeptoView.getSelectionModel().getSelectedItem() == null) {
					setGraphic(null);
					return;
				}
				if (obj.getCodigo() == tbvDeptoView.getSelectionModel().getSelectedItem().getCodigo()){
					setGraphic(button);
					
					button.setOnAction(event -> removeEntity(obj));
					return;
				}
			}
		});
	}
	
	private void removeEntity(Departamento obj) {
		Optional<ButtonType> result = Alerts.showConfirmation("Confirmation", "Are you sure to delete?");

		if (result.get() == ButtonType.OK) {
			if (service == null) {
				throw new IllegalStateException("Service was null");
			}
			try {
				service.remove(obj);
				updateTableView();
			}
			catch (DbIntegrityException e) {
				Alerts.showAlert("Error removing object", null, e.getMessage(), AlertType.ERROR);
			}
		}
	}

	@Override
	public void onDataChanged() {
		updateTableView();
		// Create alert on successful db inserts.
	}
}
