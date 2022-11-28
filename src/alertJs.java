import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alertJs {
     public WebDriver driver;
     @BeforeTest
     public void login() throws InterruptedException {
   	  WebDriverManager.chromedriver().setup();
   	  driver=new ChromeDriver();
   	  driver.get("https://www.facebook.com");
   	 Thread.sleep(3000);
   	  driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Sarafakhore@yahoo.com");
   	  Thread.sleep(3000);
    	 driver.findElement(By.id("pass")).sendKeys("abeer9982040183sdd");
    	 Thread.sleep(3000);
    	 driver.findElement(By.name("login")).click();
    	 
     }
     @Test
 public void face() {
  driver.findElement(By.xpath("//*[@id=\"header_block\"]/span/div/div[1]/div[2]/span")).getText();
String myName=  driver.findElement(By.xpath("//*[@id=\"header_block\"]/span/div/div[1]/div[2]/span")).getText();			 
  		 
    			 
    			 
    			 
    			 
    			 
    			 
    			 
    			 

     }
     
     
     
     
     
     
     
     
}
