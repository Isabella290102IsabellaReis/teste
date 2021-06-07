#Author: isabella.c.miguel@gmail.com

@tag
Feature: Amazon
  @tag1
  Scenario: Realizar compra na Amazon
    
Given que acesse o site "https://www.amazon.com.br/"
When pesquisar por "Notebook" 
Then valido produto no carrinho 