package Steps.global;

import java.io.IOException;

import Elementos.global.Elementos;
import Metodos.global.Pages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

	Pages page = new Pages();
	Elementos elementos = new Elementos();

	@Given("que acesse o site {string}")
	public void que_acesse_o_site(String site) throws IOException {
	    page.executarNavegador(site,"CHROME" ,"abrir Navegador" );
	   
	}

	@When("pesquisar por {string}")
	public void pesquisar_por(String aparelho) throws IOException, InterruptedException {
page.escrever(elementos.getCampoPesquisa(), aparelho, "pesquisando produto");
page.btnEnter(elementos.getCampoPesquisa(), "acessar");
page.clicar(elementos.getNotebook(), "selecionando produto");
page.clicar(elementos.getBtnCarrinho(), "colocar produto no carrinho");
page.pauser(5000, "pausa");
page.clicar(elementos.getBtnGarantia(), "sem garantia");
	}

	@Then("valido produto no carrinho")
	public void valido_produto_no_carrinho() throws IOException, InterruptedException {
	   
	String Evidencia = "global";
	page.pauser(5000, "pausa");	
	page.validarTexto(elementos.getFraseAdicionarCarrinho(), "Adicionado ao carrinho", "validando texto");
		page.screnShoot ( "./Evidencia/"  +  Evidencia  +  " .png " );
		
		
	}
}
