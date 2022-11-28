import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sima {
	public WebDriver driver;

	@DataProvider(name = "data-provider")
	public Object[][] dpMethod() {
		return new Object[][] { { "1010007912" }, { "987654" } };
	}

	@BeforeTest
	public void Login() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://c01k8s01t-pe-sim.uksouth.cloudapp.azure.com:30063/member/authorization/signup");
		driver.manage().window().maximize();

	}

	@Test(dataProvider = "data-provider")
	public void register_New(String val) throws InterruptedException {


		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(
				"/html/body/app-root/app-authorization/main/section/div/div/app-signup/app-onboarding-inquiry-form/section/form/div[1]/label[2]"))
				.click();
		driver.findElement(By.xpath(
				"/html/body/app-root/app-authorization/main/section/div/div/app-signup/app-onboarding-inquiry-form/section/form/div[2]/label[2]"))
				.click();
		Select company_industry_type = new Select(driver.findElement(By.id("companyBusinessNature")));
		company_industry_type.selectByIndex(3);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[type='button']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"commercialRegistrationNo\"]")).sendKeys(val);

//	   driver.findElement(By.xpath("//*[@id=\"commercialRegistrationNo\"]")).sendKeys(val);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"companyName\"]")).sendKeys("techminds consulting company");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Abeer");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Taamneh");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"firstNameAr\"]")).sendKeys("عبير");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"lastNameAr\"]")).sendKeys("طعامنه");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"designation\"]")).sendKeys("quality Assuranse");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"designationAr\"]")).sendKeys("  صيانه البرنامج");
		Thread.sleep(2000);

		String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String character = "1234";
		String pwd = RandomStringUtils.random(9, upper + character);
		driver.findElement(By.xpath("//*[@id=\"companyEmail\"]")).sendKeys("saramohmad1@gmail.com");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("582 6335 64");

		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("QQqq11!!");
		driver.findElement(By.xpath("//*[@id=\"confirmPassword\"]")).sendKeys("QQqq11!!");
		driver.findElement(By.xpath("//button[text() = 'Sign Up']")).click();

	}

//	@Test
//	public void Membersh_Digital_On_boarding() throws InterruptedException {

//	   driver.findElement(By.xpath("//*[@id=\"companyName\"]")).sendKeys("AbeerTaamneh");
//	   Thread.sleep(2000);
//	   driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("lonaTaamneh");
//	   Thread.sleep(2000);
//	   
//	   driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Taamneh");
//	   Thread.sleep(2000);
//	   driver.findElement(By.xpath("//*[@id=\"firstNameAr\"]")).sendKeys("عبيررر طعامنه");
//	   Thread.sleep(2000);
//	   driver.findElement(By.xpath("//*[@id=\"lastNameAr\"]")).sendKeys("طعامنه");
//	   Thread.sleep(2000);
//	   driver.findElement(By.xpath("//*[@id=\"designation\"]")).sendKeys("thank you vary match");
//	   Thread.sleep(2000);
//	   driver.findElement(By.xpath("//*[@id=\"designationAr\"]")).sendKeys("غلرراترراتشسؤلاالتلالانتلاسيلارلا");
//	   Thread.sleep(2000);
//	   driver.findElement(By.xpath("//*[@id=\"companyEmail\"]")).sendKeys("abeertaamneh783@gmail.com");
//	   Thread.sleep(2000);
//	   driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("8754765");
//		 
//	   driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abeer12345");
//	   driver.findElement(By.xpath("//*[@id=\"confirmPassword\"]")).sendKeys("abeer12345");
//	   driver.findElement(By.xpath("/html/body/app-root/app-authorization/main/section/div/div/app-signup/app-onboarding-form/section/form/button")).click();
//	   
//	   
//	   
//	   

	}
//  @Test
//public void aaa(){
//	
//	
////}
//}
