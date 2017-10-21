package SeleniumJenkinsTestNGprueba1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;
public class AccesoUser {
	@Test
	 public void ingresaUser() {
		//  RUTA DEL CHROME DRIVER PARA GOOGLE 
String exePath  = "C:\\Users\\chrixdlo\\workspace\\TesisSelenium\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",exePath);
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost:81/controlescolarphp/login1.php");
		System.out.println("ingresar con  el nuevo login registrado");
		driver.findElement(By.name("loginProfe")).click();
	    driver.findElement(By.name("textfield")).clear();
	    driver.findElement(By.name("textfield")).sendKeys("121h8076");
	    driver.findElement(By.name("textfield2")).clear();
	    driver.findElement(By.name("textfield2")).sendKeys("juanito21");
	    driver.findElement(By.name("Submit")).click();
	    driver.quit();
	    
	}
	

}
