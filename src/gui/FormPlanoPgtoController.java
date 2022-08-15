package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class FormPlanoPgtoController implements Initializable{

	@FXML
	private Button btnFormPlanoPgtoNovo;
	
	@FXML
	public void onBtnFormPlanoPgtoNovoAction() {
		System.out.println("Novo");
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
}
