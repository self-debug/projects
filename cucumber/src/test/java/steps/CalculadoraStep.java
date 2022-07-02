package steps;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class CalculadoraStep {
	
	WebDriver driver = new ChromeDriver();
	
	public int numero1,numero2,resultadoSistema;
	
	
	@Dado("^que tenho o número (\\d+)$")
	public void queTenhoONúmero(int num1) throws Throwable {
		numero1 = num1;
	}

	@Quando("^eu adiciono (\\d+)$")
	public void euAdiciono(int num2) throws Throwable {
	    numero2 = num2;
	    resultadoSistema = numero1+numero2;
	}

	@Entao("^o resultado é igual a (\\d+)$")
	public void oResultadoÉIgualA(int resul) throws Throwable {
		Assert.assertEquals("ERRO AO VALIDAR====>>>>", resul, resultadoSistema);

	}
	
}
