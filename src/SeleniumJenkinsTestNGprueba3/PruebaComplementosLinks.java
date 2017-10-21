package SeleniumJenkinsTestNGprueba3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;


public class PruebaComplementosLinks {

	 @Test
	 public static void main(String[] args) {
	  String exePath  = "C:\\Users\\chrixdlo\\workspace\\TesisSelenium\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",exePath);
		WebDriver driver = new ChromeDriver(); 
				
      driver.navigate().to("http://localhost:81/controlescolarphp/consultAlumno1.php");  
	  
      java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
      System.out.println("Numero de links"+ links.size());
      for (int i = 1; i<=links.size(); i=i+1) {
          System.out.println("Nombre del Link# " + i  + links.get(i).getText());
          
         
  }
      driver.quit();
}
	 
}
