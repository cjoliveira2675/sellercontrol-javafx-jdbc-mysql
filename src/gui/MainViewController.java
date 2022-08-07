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
	private Button btnVendasPedidoVender;
	@FXML
	private Button btnVendasPedidoPesquisar;
	@FXML
	private Button btnVendasPedidoImprimir;
	@FXML
	private Button btnVendasPoliticasComNova;
	@FXML
	private Button btnVendasPoliticasComFiltrar;
	@FXML
	private Button btnVendasPoliticasComCobrancas;
	@FXML
	private Button btnVendasPoliticasComPlanosPgto;
	@FXML
	private Button btnCaixaContasReceberBaixar;
	@FXML
	private Button btnCaixaContasReceberDesdobrar;
	@FXML
	private Button btnCaixaContasReceberAdiar;
	@FXML
	private Button btnCaixaContasPagarBaixar;
	@FXML
	private Button btnCaixaContasPagarDesdobrar;
	@FXML
	private Button btnCaixaContasPagarAdiar;
	@FXML
	private Button btnCaixaFluxoAtualizar;
	@FXML
	private Button btnProdutosProdutoNovo;
	@FXML
	private Button btnProdutosProdutoBuscaDepto;
	@FXML
	private Button btnProdutosProdutoBuscaSecao;
	@FXML
	private Button btnProdutosProdutoBuscaFornec;
	@FXML
	private Button btnProdutosProdutoPesquisar;
	@FXML
	private Button btnProdutosProdutoImprimir;
	@FXML
	private Button btnProdutosEstoqueNovaEntrada;
	@FXML
	private Button btnProdutosEstoqueBuscaDepto;
	@FXML
	private Button btnProdutosEstoqueBuscaSecao;
	@FXML
	private Button btnProdutosEstoqueBuscaFornec;
	@FXML
	private Button btnProdutosEstoquePesquisar;
	@FXML
	private Button btnProdutosEstoqueImprimir;
	@FXML
	private Button btnProdutosTabPrecoBuscaDepto;
	@FXML
	private Button btnProdutosTabPrecoBuscaSecao;
	@FXML
	private Button btnProdutosTabPrecoBuscaFornec;
	@FXML
	private Button btnProdutosTabPrecoPesquisar;
	@FXML
	private Button btnProdutosTabPrecoImprimir;
	@FXML
	private Button btnClientesNovo;
	@FXML
	private Button btnClientesPesquisar;
	@FXML
	private Button btnClientesImprimir;
	@FXML
	private Button btnFornecedoresNovo;
	@FXML
	private Button btnFornecedoresPesquisar;
	@FXML
	private Button btnFornecedoresImprimir;
	
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
	public void onBtnVendasPedidoVenderAction() {
		System.out.println("Janela de confecção de pedido");
	}
	
	@FXML
	public void onBtnVendasPedidoPesquisarAction() {
		System.out.println("Exibe resultado da pesquisa na tabela pedidos");
	}
	
	@FXML
	public void onBtnVendasPedidoImprimirAction() {
		System.out.println("Imprime relatório de pedidos");
	}
	
	@FXML
	public void onBtnVendasPoliticasComNovaAction() {
		System.out.println("Janela de cadastro de políticas comerciais");
	}
	
	@FXML
	public void onBtnVendasPoliticasComFiltrarAction() {
		System.out.println("Exibe resultado da pesquisa na tabela politicas comerciais");
	}
	
	@FXML
	public void onBtnVendasPoliticasComCobrancasAction() {
		System.out.println("Janela de cobranças");
	}
	
	@FXML
	public void onBtnVendasPoliticasComPlanosPgtoAction() {
		System.out.println("Janela de Planos de pagamento");
	}
	
	@FXML
	public void onBtnCaixaContasReceberBaixarAction() {
		System.out.println("Baixar título selecionado");
	}
	
	@FXML
	public void onbtnCaixaContasReceberDesdobrarAction() {
		System.out.println("Desdobrar título selecionado");
	}
	
	@FXML
	public void onBtnCaixaContasReceberAdiarAction() {
		System.out.println("Adiar título selecionado");
	}
	
	@FXML
	public void onBtnCaixaContasPagarBaixarAction() {
		System.out.println("Baixar despesa selecionada");
	}
	
	@FXML
	public void onBtnCaixaContasPagarDesdobrarAction() {
		System.out.println("Desdobrar despesa selecionada");
	}
	
	@FXML
	public void onBtnCaixaContasPagarAdiarAction() {
		System.out.println("Adiar despesa selecionada");
	}
	
	@FXML
	public void onbtnCaixaFluxoAtualizarAction() {
		System.out.println("Atualizar balanço caixa");
	}
	
	@FXML
	public void onBtnProdutosProdutoNovoAction() {
		System.out.println("Janela de cadastro de produto");
	}
	
	@FXML
	public void onBtnBuscaDeptoAction() {
		System.out.println("Janela de pesquisa de departamento");
	}
	
	@FXML
	public void onBtnBuscaSecaoAction() {
		System.out.println("Janela de pesquisa de seção");
	}
	
	@FXML
	public void onBtnBuscaFornecAction() {
		System.out.println("Janela de pesquisa de fornecedor");
	}
	
	@FXML
	public void onBtnProdutosProdutoPesquisarAction() {
		System.out.println("Exibe resultado da pesquisa na tabela produtos");
	}
	
	@FXML
	public void onBtnProdutosProdutoImprimirAction() {
		System.out.println("Imprime resultado da pesquisa da tabela produtos");
	}
	
	@FXML
	public void onBtnProdutosEstoqueNovaEntradaAction() {
		System.out.println("Janela de entrada de produtos");
	}
	
	@FXML
	public void onBtnProdutosEstoquePesquisarAction() {
		System.out.println("Exibe resultado da pesquisa nas tabelas estoque");
	}
	
	@FXML
	public void onBtnProdutosEstoqueImprimirAction() {
		System.out.println("Imprime resultado da pesquisa nas tabelas estoque selecionadas");
	}
	
	@FXML
	public void onBtnProdutosTabPrecoPesquisarAction() {
		System.out.println("Exibe resultado da pesquisa na tabela tab preços");
	}
	
	@FXML
	public void onBtnProdutosTabPrecoImprimirAction() {
		System.out.println("Imprime resultado da pesquisa na tabela tab preços");
	}
	
	@FXML
	public void onBtnClientesNovoAction() {
		System.out.println("Janela de cadastro de clientes");
	}
	
	@FXML
	public void onBtnClientesPesquisarAction() {
		System.out.println("Exibe o resultado da pesquisa de clientes na tabela");
	}
	
	@FXML
	public void onBtnClientesImprimirAction() {
		System.out.println("Imprime o resultado da pesquisa de clientes na tabela");
	}
	
	@FXML
	public void onbtnFornecedoresNovoAction() {
		System.out.println("Janela de cadastro de fornecedor");
	}
	
	@FXML
	public void onBtnFornecedoresPesquisarAction() {
		System.out.println("Exibe o resultado da pesquisa de fornecedor na tabela");
	}
	
	@FXML
	public void onBtnFornecedoresImprimirAction() {
		System.out.println("Imprime o resultado da pesquisa de fornecedor na tabela");
	}
	
	
	
	@Override
	public void initialize(URL uri, ResourceBundle rb) {
		
	}

}
