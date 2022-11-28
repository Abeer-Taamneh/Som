import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewJava {
          public WebDriver driver;
          @BeforeTest
          public void login() {
        	  WebDriverManager.chromedriver().setup();
        	  driver= new ChromeDriver();
        	  driver.get("https://www.saucedemo.com/");
        	  driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
        	  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
        	  driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
          }
          @Test
          public void register() {
    driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select")).click();
    driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option[3]")).click();
      List<WebElement> abeer=driver.findElements(By.className("inventory_item_price"));
      List<Double> abdalraheem =new ArrayList<>();
        	  for(int i=0; i<abeer.size();i++) {
        		  
        	String a= abeer.get(i).getText();
        		  String edit=a.replace("$", " ");
        		  double con =Double.parseDouble(edit.trim());
        		  abdalraheem.add(con);
        	  }
        	  for(int k=0; k<abdalraheem.size()-1; k++) {
        		  boolean z =abdalraheem.get(0)<abdalraheem.get(abdalraheem.size()-1);
        		  Assert.assertEquals(z, true);
        		  
        	  }
        	  
        	  
        	  
        	  
        	  
        	  
        	  
        	  
        	  
        	  
        	  
        	  
          }
}
