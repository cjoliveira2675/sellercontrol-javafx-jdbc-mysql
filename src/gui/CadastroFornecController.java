package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class CadastroFornecController implements Initializable{

	@FXML
	private Button btnFormFornecSalvar;
	@FXML
	private Button btnFormFornecCancelar;
	
	@FXML
	public void onbtnFormFornecSalvarAction() {
		System.out.println("Salvar");
	}
	
	@FXML
	public void onbtnFormFornecCancelarAction() {
		System.out.println("Cancelar");
	}
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
}
