package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class CadastroProdutoController implements Initializable{

	@FXML
	private Button btnFormProdutoSalvar;
	@FXML
	private Button btnFormProdutoCancelar;
	
	@FXML
	public void onbtnFormProdutoSalvarAction() {
		System.out.println("Salvar");
	}
	
	@FXML
	public void onbtnFormProdutoCancelarAction() {
		System.out.println("Cancelar");
	}
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
}
