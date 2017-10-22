package SeleniumJenkinsTestNGprueba1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Titulo {
	@Test
	 public void getTitleAutentiaTest() throws Exception	{
		String exePath  = "C:\\Users\\chrixdlo\\workspace\\TesisSelenium\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",exePath);
		WebDriver driver = new ChromeDriver();  
	        driver.get("http://localhost:81/controlescolarphp/login1.php");
	        Assert.assertEquals("baseSoftw", driver.getTitle());
	        System.out.println("verificar titulo de la pagina");
	          
	        driver.quit();
	        
	        Thread.sleep(400);
	      }
	 
	    }


