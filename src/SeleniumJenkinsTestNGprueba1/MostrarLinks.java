package SeleniumJenkinsTestNGprueba1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class MostrarLinks{
	

	public static void main(String[] args)throws InterruptedException  {
		
    	String exePath  = "C:\\Users\\chrixdlo\\workspace\\TesisSelenium\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",exePath);
		WebDriver driver = new ChromeDriver();  
		 driver.get("localhost:81/controlescolarphp/consultAlumno1.php");
		 java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
		 
			System.out.println(links.size());
	 
				for (int i = 1; i<=links.size(); i=i+1)
				System.out.println(links.get(i).getText());
	 Thread.sleep(100);
	 driver.quit();
	}
	
}

