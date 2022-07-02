package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.Entao;
import pages.ConfirmacaoPage;
import pages.UsuarioPage;
import support.Generator;
import support.Screenshot;

public class AutomacaoWebStep {
	
	WebDriver driver = new ChromeDriver();
	
	@Dado("^que estou no site \"([^\"]*)\"$")
	public void queEstouNoSite(String site) throws Throwable {
	    driver.get(site);
	}
	
	@Dado("^que tenho \"([^\"]*)\", \"([^\"]*)\" e \"([^\"]*)\" validos$")
	public void queTenhoEValidos(String nome, String ultimoNome, String email) throws Throwable {
	    new UsuarioPage(driver).preencherTodosOsCampos(nome, ultimoNome, email);
	}

	@Quando("^faco o cadastro$")
	public void facoOCadastro() throws Throwable {
	    new UsuarioPage(driver).clicarConfirmaCadastro();
	}

	@Entao(value = "") void euVejoAMensagem(String msg) throws Throwable {
	    String mensagemSistema;
	    mensagemSistema = new ConfirmacaoPage(driver).retornaMensagem();
	    Assert.assertEquals("Erro ==>>> NÃO VEIO A MENSAGEM DESEJADA", msg, mensagemSistema);
	}
	
	@After 
	public void aScreenshots(){
		String EvidênciaDeTeste = System.getProperty("user.dir")+"\\target\\relatorios\\evidencias\\" + Generator.dataHoraParaArquivo() +".png";
		Screenshot.tirar(driver, EvidênciaDeTeste );
	}
	
	@After
	public void bfechaBrowser() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}
