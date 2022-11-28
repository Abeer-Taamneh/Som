import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazon {
	public WebDriver driver;
	@BeforeTest
	public void Login() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
	
	}
   @Test
   public void Amazon_lab() {
	   driver.findElement(By.className("a-size-small a-color-base truncate-2line")).click();
	   
   }
}
