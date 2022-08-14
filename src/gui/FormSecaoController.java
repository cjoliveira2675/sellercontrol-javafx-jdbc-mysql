package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class FormSecaoController implements Initializable{

	@FXML
	private Button btnFormSecaoBuscar;
	@FXML
	private Button btnFormSecaoNovo;
	
	@FXML
	public void onbtnFormSecaoBuscarAction() {
		System.out.println("Buscar");
	}
	
	@FXML
	public void onbtnFormSecaoNovoAction() {
		System.out.println("Cadastrar");
	}
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
}
