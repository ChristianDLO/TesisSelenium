package SeleniumJenkinsTestNGprueba1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class PruebaFormulario{
	
	@Test 
	public void PruebaFormularioUser () throws InterruptedException {
			
    	String exePath  = "C:\\Users\\chrixdlo\\workspace\\TesisSelenium\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",exePath);
		WebDriver driver = new ChromeDriver();  
	long time_start, time_end;
	 
	String web = "http://localhost:81/controlescolarphp/login1.php";
	System.out.println("Entrando a: " + web);
			 
	time_start = System.currentTimeMillis();
	driver.get(web);
			 
	System.out.println("Carga de: " + web + "finalizada");

	driver.manage().window().maximize();
		 
	driver.findElement(By.name("loginProfe")).click();

	 System.out.println("Botón profesor pulsado");
		
	 WebElement element;
	 element = driver.findElement(By.name("textfield"));
	 element.sendKeys("121h8016");
	 System.out.println("Matricula introducido");
	 	 Thread.sleep(1000);

	  WebElement element2;
	  element2 = driver.findElement(By.name("textfield2"));
   	  element2.sendKeys("1234");
	  System.out.println("Contraseña introducida");
	  Thread.sleep(1000);
	
	 driver.findElement(By.name("Submit")).click();
	System.out.println("Login completado en: " + web);
			 
	 time_end = System.currentTimeMillis();
	 double  time_total= time_end - time_start;
	 System.out.println("El tiempo tomado en milisegundos: "+ (time_total) +" ms");
	 System.out.println("El tiempo tomado en segundos: "+ (time_total/1000) +" s");
	 Thread.sleep(1000);
	 driver.quit();
	}

}

