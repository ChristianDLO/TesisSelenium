package SeleniumJenkinsTestNGprueba1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class Prueba_deElementocss {

	@Test
	 public void verificaCss() {
		String exePath  = "C:\\Users\\chrixdlo\\workspace\\TesisSelenium\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",exePath);
		WebDriver driver = new ChromeDriver();  
	        driver.get("localhost:81/controlescolarphp/consultAlumno1.php");
	         driver.findElement(By.id("botton")).sendKeys("3");
	         driver.findElement(By.cssSelector("#botton")).click();
	         System.out.println("verifica elemento css");
	
	driver.quit();

}
}
