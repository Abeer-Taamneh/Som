import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sima_Register {
	public WebDriver driver;
	@BeforeTest
	public void Login() throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://c01k8s01t-pe-sim.uksouth.cloudapp.azure.com:30063/member/home");
		driver.manage().window().maximize();
		  JavascriptExecutor js = (JavascriptExecutor)driver;	
          js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");			

		Thread.sleep(2000);
	}
		
		
				
   @Test
   public void register_New() throws InterruptedException {
	   driver.findElement(By.xpath("/html/body/app-root/app-non-authorized/main/app-header/header/nav[1]/ul/li[4]/button")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("eertaamneh73@gmail.com");
	   driver.findElement(By.xpath("/html/body/app-root/app-authorization/main/section/div/div/app-login-page/app-login/section/form/div[2]/input")).sendKeys("QQqq11!!");
	   driver.findElement(By.xpath("/html/body/app-root/app-authorization/main/section/div/div/app-login-page/app-login/section/form/div[3]/div/div[1]/button")).click();
    Thread.sleep(2000);
	   driver.findElement(By.xpath("//div//button[text()=\" Download Template \"]")).click();
		
	   driver.findElement(By.xpath("//button[normalize-space()='Complete my application']")).click();
	   
   }
}
