package Elementos.global;

import org.openqa.selenium.By;

public class Elementos {

	private By campoPesquisa = By.id("twotabsearchtextbox");
	private By notebook = By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[1]/div/span[3]/div[2]/div[2]/div/span/div/div/div/div/div[2]/h2/a/span");
	private By btnCarrinho = By.id("add-to-cart-button");
	private By btnGarantia = By.cssSelector("#attachSiNoCoverage > span > input");
	private By Btnfecharpedido = By.cssSelector("#hlb-ptc-btn-native-bottom");
	private By fraseAdicionarCarrinho = By.cssSelector("#huc-v2-order-row-confirm-text > h1");
	
	
	
	public By getFraseAdicionarCarrinho() {
		return fraseAdicionarCarrinho;
	}

	

	public By getBtnfecharpedido() {
		return Btnfecharpedido;
	}
	
	public By getCampoPesquisa() {
		return campoPesquisa;
	}
	public By getNotebook() {
		return notebook;
	}
	public By getBtnCarrinho() {
		return btnCarrinho;
	}
	public By getBtnGarantia() {
		return btnGarantia;
	}
	























}
 
