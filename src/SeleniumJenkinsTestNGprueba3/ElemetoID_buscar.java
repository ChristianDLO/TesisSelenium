package SeleniumJenkinsTestNGprueba3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElemetoID_buscar {
	
	  @Test
	  public void botonBuscarID(){

		  String exePath  = "C:\\Users\\chrixdlo\\workspace\\TesisSelenium\\chromedriver\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver",exePath);
			WebDriver driver = new ChromeDriver(); 
			 driver.navigate().to("http://localhost:81/controlescolarphp/consultAlumno1.php"); 
			WebElement search = driver.findElement(By.name("buscar"));
		    search.sendKeys("121h8016");
		    search.submit();
		    
		    //Esperamos 10 segundos o a que devuelva el resultado de la búsqueda
		    (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
		            public Boolean apply(WebDriver d) {
		                return d.findElement(By.className("buscar")).getText().startsWith("121h8016");
		            }
		        });
		    
		    Assert.assertEquals(driver.findElement(By.className("buscar")).getText(), "Búsqueda de \"121h8016\"");
		    
		    driver.quit();
		  }


}
