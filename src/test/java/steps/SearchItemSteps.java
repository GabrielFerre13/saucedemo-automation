package steps;

import Interactions.BuyInteractions;
import Pages.LoginPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

import static steps.Hooks.driver;

public class BuscaItemSteps {
    LoginPage loginPage;
    BuyInteractions interactions;

    public BuscaItemSteps(){
        loginPage = new LoginPage(driver);
        interactions = new BuyInteractions(loginPage);
    }

    @Dado("que o usuario acessar o site {string}")
    public void que_o_usuario_acessar_o_site(String url) {
        System.out.println("ABRINDO");
        driver.get(url);
    }

    @Quando("ele faz login com usuario {string} e senha {string}")
    public void ele_faz_login_com_usuario_e_senha(String user, String password) {
        System.out.println("FAZENDO LOGIN...");
        loginPage.fazerLogin(user,password);
        System.out.println("LOGADO");

    }

    @E("ele adiciona o produto ao carrinho e inicia checkout")
    public void eleAdicionaOProdutoAoCarrinhoEIniciaCheckout() throws InterruptedException  {
        interactions.escolhaItem();
        interactions.realizaCompra();
    }

    @Entao("ele ira concluir a compra")
    public void ele_ira_concluir_a_compra() {
        System.out.println("FINALIZADO");

    }


}
