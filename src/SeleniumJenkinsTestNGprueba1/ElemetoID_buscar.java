package SeleniumJenkinsTestNGprueba1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class ElemetoID_buscar {
	
	  @Test
	  public void botonBuscarID()	{

		  String exePath  = "C:\\Users\\chrixdlo\\workspace\\TesisSelenium\\chromedriver\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver",exePath);
			WebDriver driver = new ChromeDriver(); 
			 driver.navigate().to("http://localhost:81/controlescolarphp/consultAlumno1.php"); 
			WebElement search = driver.findElement(By.name("buscar"));
		    search.sendKeys("121h8016");
		    search.submit();
		    
		    driver.quit();
			System.out.println("buscar elemento");
		
		  }


}
