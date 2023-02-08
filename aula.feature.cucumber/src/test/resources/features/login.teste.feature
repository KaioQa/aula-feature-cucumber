#Author: kaiosilva455@gmail.com


Feature: Realizar o login do usuario
  Como usuario quero realizar o login para validar o acesso


  Scenario: login com sucesso
    Given que acesse o site "https://www.saucedemo.com"
    When preencho o campo usuario
    And preencho o campo usuario ""
    And preencho o campo senha ""
    And clico no botao de login
    Then o login
    
