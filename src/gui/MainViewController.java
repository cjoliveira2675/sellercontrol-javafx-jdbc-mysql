package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable{

	@FXML
	private MenuItem menuItemEmpresa;
	@FXML
	private MenuItem menuItemPrefGeral;
	@FXML
	private MenuItem menuItemTrocarUser;
	@FXML
	private MenuItem menuItemSair;
	@FXML
	private MenuItem menuItemUsuarios;
	@FXML
	private MenuItem menuItemPrefUsers;
	@FXML
	private MenuItem menuItemAbout;
	@FXML
	private Button btnClientes;
	@FXML
	private Button btnVendas;
	@FXML
	private Button btnFornecedores;
	@FXML
	private Button btnProdutos;
	@FXML
	private Button btnPoliticasCom;
	@FXML
	private Button btnRelatorios;
	
	@FXML
	public void onMenuItemEmpresaAction() {
		System.out.println("Dados cadastrais da empresa");
	}
	
	@FXML
	public void onMenuItemPrefGeralAction() {
		System.out.println("Preferências gerais");
	}
	
	@FXML
	public void onMenuItemTrocarUserAction() {
		System.out.println("Fazer login com outro usuário");
	}
	
	@FXML
	public void onMenuItemSairAction() {
		System.out.println("Fechar sistema");
	}
	
	@FXML
	public void onMenuItemUsuariosAction() {
		System.out.println("Painel de usuários");
	}
	
	@FXML
	public void onMenuItemPrefUsersAction() {
		System.out.println("Preferências do usuário atual");
	}
	
	@FXML
	public void onMenuItemAboutAction() {
		System.out.println("Sobre o Seller Control");
	}
	
	@FXML
	public void onBtnClientesAction() {
		System.out.println("Janela de clientes");
	}
	
	@FXML
	public void onBtnVendasAction() {
		System.out.println("Janela de vendas");
	}
	
	@FXML
	public void onBtnFornecedoresAction() {
		System.out.println("Janela de fornecedores");
	}
	
	@FXML
	public void onBtnProdutosAction() {
		System.out.println("Janela de produtos");
	}
	
	@FXML
	public void onBtnPoliticasComAction() {
		System.out.println("Janela de politicas comerciais");
	}
	
	@FXML
	public void onBtnRelatoriosAction() {
		System.out.println("Janela de relatorios");
	}
	
	@Override
	public void initialize(URL uri, ResourceBundle rb) {
		
	}

}
