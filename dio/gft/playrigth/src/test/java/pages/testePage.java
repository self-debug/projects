package pages;

import core.DriverManager;

public class testePage extends DriverManager {

    //Elementos da página
    String inputPesquisa = "//input[@title=\"Pesquisar\"]";
    String resultados = "//div[13]";
    String logo = "//div[@class=\"logo\"]";


    //Função para navegar até a página.
    public void irParaPagina(String url){
        takeScreenshot();
        web().navigate(url);
    }

    //Função para pesquisar na página.
    public void pesquisar(String pesquisa){
        web().isVisible(inputPesquisa);
        takeScreenshot();
        web().fill(inputPesquisa, pesquisa);
        takeScreenshot();
        web().press(inputPesquisa, "Enter");
        takeScreenshot();

    }

    public boolean checkPage(){
        web().isVisible(logo);
        takeScreenshot();
        return web().isVisible(logo);

    }


    public void visualizarTresPesquisas() {
        web().hover(resultados);
        takeScreenshot();
        web().click(resultados);
    }
}
