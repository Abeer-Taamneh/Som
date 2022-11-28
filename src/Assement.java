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

public class Assement {
	public WebDriver driver;
	@BeforeTest
	public void login () {
		WebDriverManager.chromiumdriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	}
   @Test()
   public void high_to_low() {
	   driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select")).click();
	   driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option[4]")).click();
	   List<WebElement>abeer =driver.findElements(By.className("inventory_item_price"));
	   List<Double> newDabl= new ArrayList<>();
	   for(int i =0; i<abeer.size();i++) {
		   String prise=abeer.get(i).getText();
		  String edit =prise.replace("$", " ");
		  double vall =Double.parseDouble(edit.trim());
		  newDabl.add(vall);
	   }
	   for( int k=0 ;k<newDabl.size()-1;k++) {
		   System.out.println(k);
			boolean abeer12= newDabl.get(0)>newDabl.get(newDabl.size()-1);
		
	         Assert.assertEquals(abeer12, true);	
		}
	   
   }
}
