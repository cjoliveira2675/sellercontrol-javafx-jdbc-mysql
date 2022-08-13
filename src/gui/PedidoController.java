package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class PedidoController implements Initializable{

	@FXML
	private Button btnFormPedidoInserir;
	@FXML
	private Button btnFormPedidoFaturar;
	@FXML
	private Button btnFormPedidoGravar;
	@FXML
	private Button btnFormPedidoImprimir;
	
	@FXML
	public void onBtnFormPedidoInserirAction() {
		System.out.println("Inserir");
	}
	
	@FXML
	public void onBtnFormPedidoFaturarAction() {
		System.out.println("Faturar");
	}
	
	@FXML
	public void onBtnFormPedidoGravarAction() {
		System.out.println("Gravar");
	}
	
	@FXML
	public void onBtnFormPedidoImprimirAction() {
		System.out.println("Imprimir");
	}
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
}
