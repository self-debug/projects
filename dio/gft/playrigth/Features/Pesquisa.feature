Feature: Pesquisar

  @smoke
  Scenario: Realizar uma pesquisa
    Given que eu acesse a pagina "http://google.com/"
    When realizar uma consulta por "Minecraft"
    Then visualizar 0 pesquisas relacionadas ao assunto
