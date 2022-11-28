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

public class Testingg {
	public WebDriver driver;
	
	@BeforeTest
	public void login() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		
	}
	@Test()
	public void  abeer() {
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select")).click();
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option[3]")).click();
      List<WebElement> ThePriceList=driver.findElements(By.className("inventory_item_price"));
      List <Double> newEditing= new ArrayList<>();
		for( int i=0; i<ThePriceList.size() ;i++) {
		String price=ThePriceList.get(i).getText();
			
			String Editer=price.replace("$", "");
			double val =Double.parseDouble(Editer.trim());
			newEditing.add(val);
		}
      
	for( int k=0 ;k<newEditing.size()-1;k++) {
		boolean abeer= newEditing.get(0)<newEditing.get(newEditing.size()-1);
	
		Assert.assertEquals(abeer, true);
	}

      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
	}
}
