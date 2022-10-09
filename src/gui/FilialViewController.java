package gui;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import model.entities.Filial;
import model.services.FilialServices;

public class FilialViewController implements Initializable{
	
	
	@FXML
	private ComboBox<Filial> cbFilial;
	@FXML
	private Button btnNova;
	@FXML
	private Button btnEditar;
	@FXML
	private Button btnSalvar;
	@FXML
	private TextField codFilial;
	@FXML
	private TextField cnpj;
	@FXML
	private TextField razaoSocial;
	@FXML
	private TextField fantasia;
	@FXML
	private TextField representante;
	@FXML
	private TextField cep;
	@FXML
	private TextField uf;
	@FXML
	private TextField cidade;
	@FXML
	private TextField bairro;
	@FXML
	private TextField rua;
	@FXML
	private TextField numero;
	@FXML
	private TextField complemento;
	@FXML
	private TextField telefone1;
	@FXML
	private TextField telefone2;
	@FXML
	private TextField email;
	
	//private Filial entity;
	private FilialServices service;
	private ObservableList<Filial> obList;
	
	/*public void setFilial(Filial entity) {
		this.entity = entity;
	}*/
	
	@FXML
	private void onBtnNovaAction() {
		System.out.println("onBtnNovaAction");
	}
	
	@FXML
	private void onBtnEditarAction() {
		System.out.println("onBtnEditarAction");
	}
	
	@FXML
	private void onBtnSalvarAction() {
		System.out.println("onBtnSalvarAction");
	}
	
	public void setFilialService(FilialServices service) {
		this.service = service;
	}

		
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		//setFormData();
		//loadComboBoxFilial();
	}
	
	/*public void setFormData() {
		if (entity == null) {
			throw new IllegalStateException("Entity was null");
		}
		codFilial.setText(String.valueOf(entity.getCodFilial()));
		cnpj.setText(entity.getCnpj());
		razaoSocial.setText(entity.getRazaoSocial());
		fantasia.setText(entity.getFantasia());
		representante.setText(entity.getRepresentante());
		cep.setText(entity.getCep());
		uf.setText(entity.getUf());
		cidade.setText(entity.getCidade());
		bairro.setText(entity.getBairro());
		rua.setText(entity.getRua());
		numero.setText(entity.getNumero());
		complemento.setText(entity.getComplemento());
		telefone1.setText(entity.getTelefone1());
		telefone2.setText(entity.getTelefone2());
		email.setText(entity.getEmail());
	}*/
	
	public void loadComboBoxFilial() {
		/*Callback<ListView<Filial>, ListCell<Filial>> factory = lv -> new ListCell<Filial>() {
			@Override
			protected void updateItem(Filial item, boolean empty) {
				super.updateItem(item, empty);
				setText(empty ? "" : item.getFantasia());
			}
		};
		cbFilial.setCellFactory(factory);
		cbFilial.setButtonCell(factory.call(null));*/
		List<Filial> list = service.findAll();
		System.out.println(list);
		obList = FXCollections.observableArrayList(list);
		cbFilial.setItems(obList);
	}
}
