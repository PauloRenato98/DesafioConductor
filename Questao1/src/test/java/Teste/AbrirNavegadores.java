package Teste;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class AbrirNavegadores {

	public static void main(String[] args) {

		// setar o driver  do navegador
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");

		// instânciando o webdriver
		WebDriver driver = new ChromeDriver();

		// abre o google no navegador
		driver.get("https://www.google.com.br/");

		// Procura pelo elemento By.name"q" que é referente ao campo de busca e digita "conductor"
		driver.findElement(By.name("q")).sendKeys("conductor");
		// aperta enter
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		// clica no link onde tem a string "Conductor"
		driver.findElement(By.xpath("//span[contains(.,\'Conductor')]")).click();

		// captura a url de qual site está e faz a verificação pra saber se está na
		// página certa
		String URL = driver.getCurrentUrl();
		if (URL.equals("https://www.conductor.com.br/")) {
			System.out.println("pagina igual");
		} else {
			System.out.println("pagina diferente");
		}

	}
}
