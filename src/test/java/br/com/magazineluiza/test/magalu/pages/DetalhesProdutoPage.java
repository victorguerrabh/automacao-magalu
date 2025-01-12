package br.com.magazineluiza.test.magalu.pages;

import org.openqa.selenium.By;

public class DetalhesProdutoPage extends BasePage {

    private final By headerItem = By.cssSelector("h1.header-product__title");
    private final By adicionarAoCarrinhoButton = By.cssSelector("div.wrapper-product__informations button.button__buy i.icon-cart + span.button__text");

    public DetalhesProdutoPage() {
        super();
    }

    public String getDadosProduto() {
        return getText(headerItem);
    }

    public String clicarEmAdicionarAoCarrinho() {
        String produto = getDadosProduto();
        click(adicionarAoCarrinhoButton);
        return produto;
    }
}