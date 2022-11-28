import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class smartby {
	private static final int Test_we_need_cheeck = 0;
	public WebDriver driver ;
	public int numberoftry =4;
	SoftAssert softassert = new SoftAssert();
	@BeforeTest
	public void Login() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://smartbuy-me.com/smartbuystore/");
		driver.findElement(By.xpath("/html/body/main/header/div[2]/div/div[2]/a")).click();
		driver.manage().window().maximize();
	}
  @Test
  public void Testing_Add_smartby_DELL_G155511 () {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  for(int i =0;i<numberoftry;i++) {
		  driver.findElement(By.xpath("//*[@id=\"newtab-Featured\"]/div/div[1]/div/div/div/div[3]/div/div[3]/div[1]/div/div/form[1]/div[1]/button")).click();
		  driver.findElement(By.xpath("//*[@id=\"addToCartLayer\"]/a[2]")).click();
		
	  }
	  
	  driver.findElement(By.xpath("//*[@id=\"addToCartLayer\"]/a[1]")).click();
	  String cart_all=driver.findElement(By.xpath("/html/body/main/div[3]/div[1]/div[2]/div[4]/div/div[2]/div/div[1]/div[4]")).getText();
	  String[] the_update_all =cart_all.split("JOD");
	  String The_final_All_item_prise=the_update_all[0].trim();
	String updated= The_final_All_item_prise.replace(",","."); 

	String abeer= updated.replace("000",""); 

	String abeer_New= abeer.replace(".",""); 
	 Double final_price_all= Double.parseDouble(abeer_New);
	 System.out.println("=====================================");
	 System.out.println(final_price_all);
	double Yes_Ozbot=1000*numberoftry;
	double Acuall=final_price_all;
    Assert.assertEquals(Acuall, Yes_Ozbot);
  }
  
  @Test
  public void Test_we_need_cheeck () {
	  String the_single_item_price=driver.findElement(By.xpath("//*[@id=\"newtab-Featured\"]/div/div[1]/div/div/div/div[3]/div/div[2]/div[2]/div/div/span[3]")).getText();
	  System.out.println(the_single_item_price);
	  System.out.println("============++++++++++++++");
	  
	  String[] the_update_single_item_prise =the_single_item_price.split("JOD");
	  String The_final_Single_item_prise=the_update_single_item_prise[0].trim();
	String updated=  The_final_Single_item_prise.replace(",","."); 
	  Double final_price= Double.parseDouble(updated);
	 double Expected=final_price*numberoftry;
    
  }


  
  
}
