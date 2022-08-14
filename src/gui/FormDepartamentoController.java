package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class FormDepartamentoController implements Initializable{

	@FXML
	private Button btnFormDeptoBuscar;
	@FXML
	private Button btnFormDeptoNovo;
	
	@FXML
	public void onbtnFormDeptoBuscarAction() {
		System.out.println("Buscar");
	}
	
	@FXML
	public void onbtnFormDeptoNovoAction() {
		System.out.println("Cadastrar");
	}
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
}
