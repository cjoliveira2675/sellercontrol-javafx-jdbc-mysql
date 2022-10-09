package gui;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import db.DbException;
import gui.listeners.DataChangeListener;
import gui.util.Utils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import model.entities.Departamento;
import model.services.DepartamentoService;

public class FormDepartamentoController implements Initializable{

	Utils window = new Utils();
	
	private Departamento depto;
	private DepartamentoService service;
	private List<DataChangeListener> dataChangeListeners = new ArrayList<>();
	
	@FXML
	private TextField txtFormDeptoCodigo;
	@FXML
	private TextField txtFormDeptoNome;
	@FXML
	private Button btnFormDeptoSalvar;
	@FXML
	private Button btnFormDeptoCancelar;
	
	public void setDepartamento(Departamento depto) {
		this.depto = depto;
	}
	
	public void setDepartamentoService(DepartamentoService service) {
		this.service = service;
	}
	
	public void subsDataChangeListener(DataChangeListener listener) {
		dataChangeListeners.add(listener);
	}
	
	@FXML
	public void onbtnFormDeptoSalvarAction(ActionEvent event) {
		try {
			depto = getFormData();
			service.saveOrUpdate(depto);
			notifyDataChangeListener();
			Utils.currentStage(event).close();
		} catch (DbException e) {
			e.printStackTrace();
		}
	}
	
	private void notifyDataChangeListener() {
		for (DataChangeListener listener : dataChangeListeners) {
			listener.onDataChanged();
		}
	}

	@FXML
	public void onbtnFormDeptoCancelarAction(ActionEvent event) {
		Utils.currentStage(event).close();
	}
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
	}
	
	private Departamento getFormData() {
		Departamento obj = new Departamento();
		obj.setCodigo(Utils.tryParseToInt(txtFormDeptoCodigo.getText()));
		obj.setNome(txtFormDeptoNome.getText());
		
		return obj;
	}
	
	public void updateForm() {
		if (depto == null) {
			throw new IllegalStateException("Depto está nulo");
		}
		txtFormDeptoCodigo.setText(String.valueOf(depto.getCodigo()));
		txtFormDeptoNome.setText(depto.getNome());
		System.out.println("Obj criado: "+txtFormDeptoCodigo.getText()+", "+txtFormDeptoNome.getText());
	}
}
