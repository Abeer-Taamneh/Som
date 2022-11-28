import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Experenes {
	public WebDriver driver;
	public int decrement=3;
	public int items_in_inventory=5;
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
  public void Dell_Lap_tob() {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    
	  for(int i=0;i<decrement;i++) {
	  driver.findElement(By.xpath("//*[@id=\"newtab-Featured\"]/div/div[1]/div/div/div/div[3]/div/div[3]/div[1]/div/div/form[1]/div[1]/button")).click();
	  driver.findElement(By.xpath("//*[@id=\"addToCartLayer\"]/a[2]")).click();
	  }
	  String item_number_one=driver.findElement(By.xpath("//*[@id=\"addToCartLayer\"]/div[2]/div[2]/div")).getText();
	 
	  String[] Deleted_jod=item_number_one.split("JOD");
	  String No_Farag=Deleted_jod[0].trim();
	  String reble_New=No_Farag.replace(",", ".");
	 Double Roro=Double.parseDouble(reble_New);
	 
	double Expected=decrement*Roro;
	
	  driver.findElement(By.xpath("//*[@id=\"addToCartLayer\"]/a[1]")).click();
	 String All_item= driver.findElement(By.xpath("/html/body/main/div[3]/div[1]/div[2]/div[4]/div/div[2]/div/div[1]/div[2]")).getText();
	String [] Del2_OrD=All_item.split("JOD");
	String NoTreem=Del2_OrD[0].trim();
	String reblce_Zero=NoTreem.replace(",", ".");
	String Abeer=reblce_Zero.replace(".000", "");
	Double Abeer_Doab=Double.parseDouble(Abeer);
	
	double Acuall=Abeer_Doab;
	
	Assert.assertEquals(Acuall, Expected);
	
	
	
	
	
  }
} 
