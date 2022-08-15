package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class FormPoliticaComController implements Initializable{

	@FXML
	private Button btnFormPoliticaComGravar;
	@FXML
	private Button btnFormPoliticaComCancelar;
	
	@FXML
	public void onBtnFormPoliticaComGravarAction() {
		System.out.println("Gravar");
	}
	
	@FXML
	public void onBtnFormPoliticaComCancelarAction() {
		System.out.println("Cancelar");
	}
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
}
