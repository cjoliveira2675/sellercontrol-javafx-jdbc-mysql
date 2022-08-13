package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class CadastroClienteController implements Initializable{

	@FXML
	private Button btnFormClienteSalvar;
	@FXML
	private Button btnFormClienteCancelar;
	
	@FXML
	public void onbtnFormClienteSalvarAction() {
		System.out.println("Salvar");
	}
	
	@FXML
	public void onbtnFormClienteCancelarAction() {
		System.out.println("Cancelar");
	}
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
}
