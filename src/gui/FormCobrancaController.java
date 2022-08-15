package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class FormCobrancaController implements Initializable{

	@FXML
	private Button btnFormCobrancaNova;
	
	@FXML
	public void onBtnFormCobrancaNovaAction() {
		System.out.println("Nova");
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
}
