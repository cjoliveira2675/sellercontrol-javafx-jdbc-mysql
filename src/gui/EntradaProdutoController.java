package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class EntradaProdutoController implements Initializable{

	@FXML
	private Button btnFormEntradaProdutoSalvar;
	@FXML
	private Button btnFormEntradaProdutoCancelar;
	
	@FXML
	public void onbtnFormEntradaProdutoSalvarAction() {
		System.out.println("Salvar");
	}
	
	@FXML
	public void onbtnFormEntradaProdutoCancelarAction() {
		System.out.println("Cancelar");
	}
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
}
