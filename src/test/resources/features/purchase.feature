# language: pt
Funcionalidade: Login no SauceDemo

  Cenário:
    Dado que o usuario acessar o site "https://www.saucedemo.com/"
    Quando ele faz login com usuario "standard_user" e senha "secret_sauce"
    E ele adiciona o produto ao carrinho e inicia checkout
    Entao ele ira concluir a compra
