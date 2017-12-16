package SeleniumJenkinsTestNGprueba1;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Prueba_deElementos {

	@Test
	 public void buttonTes()	{ 
		String exePath  = "C:\\Users\\chrixdlo\\workspace\\TesisSelenium\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",exePath);
		WebDriver driver = new ChromeDriver();  
	        driver.get("localhost:81/controlescolarphp/consultAlumno1.php");
	         driver.findElement(By.id("botton")).sendKeys("10");
	         driver.findElement(By.cssSelector("#botton")).click();
	        	        
	         driver.quit();
	      
	       
}
	
}

	
