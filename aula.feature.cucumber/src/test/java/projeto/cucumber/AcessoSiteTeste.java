package projeto.cucumber;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AcessoSiteTeste {
	 WebDriver driver;
	 String title;
	 
	@Given("que acesso o endereco {string}")
	public void que_acesso_o_endereco(String site) {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get(site);;
		driver.manage().window().maximize();
		
	}

	@When("que capturo o title da pagina")
	public void que_capturo_o_title_da_pagina() {
	    title = driver.getTitle();
	}

	@Then("valido se o title esta correto")
	public void valido_se_o_title_esta_correto() {
	    assertEquals("Swag Labs", title);
	    driver.quit();
	}


}
