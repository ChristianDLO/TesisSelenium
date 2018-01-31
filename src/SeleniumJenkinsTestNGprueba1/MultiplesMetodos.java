package SeleniumJenkinsTestNGprueba1;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class MultiplesMetodos {
	private static ChromeDriver driver;
 	WebElement element;
  @BeforeClass
  public void AbrirChrome() {
	  String exePath  = "C:\\Users\\chrixdlo\\workspace\\TesisSelenium\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",exePath);
		driver = new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }
  @Test
  public void valid_User() {
	  
	  System.out.println("Comenzando test " + new Object(){}.getClass().getEnclosingMethod().getName());
	     driver.get("http://localhost:81/controlescolarphp/login1.php");	
	     driver.findElement(By.xpath("//img[@name='loginProfe']")).click();
	     driver.findElement(By.name("textfield")).sendKeys("121h8016");
	     driver.findElement(By.name("textfield2")).sendKeys("1234");
	     driver.findElement(By.name("Submit")).click();
	     try{
			 element = driver.findElement (By.xpath("//div[@id='templatemo_menu']/ul/li[2]/a"));
		 }catch (Exception e){
			}
	     AssertJUnit.assertNotNull(element);
	     System.out.println("Finalizando test " + new Object(){}.getClass().getEnclosingMethod().getName());
	  
  }
  
  @AfterClass
  public void CerrarChrome() {
	  driver.quit();
  }

}
