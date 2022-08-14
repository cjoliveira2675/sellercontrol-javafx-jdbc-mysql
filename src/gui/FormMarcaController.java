package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class FormMarcaController implements Initializable{

	@FXML
	private Button btnFormMarcaBuscar;
	@FXML
	private Button btnFormMarcaNovo;
	
	@FXML
	public void onbtnFormMarcaBuscarAction() {
		System.out.println("Buscar");
	}
	
	@FXML
	public void onbtnFormMarcaNovoAction() {
		System.out.println("Cadastrar");
	}
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
}
