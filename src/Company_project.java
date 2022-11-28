import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Company_project {
public WebDriver driver;
     @BeforeTest
     public void Login() {
    	 WebDriverManager.chromedriver().setup();
 		driver=new ChromeDriver();
	
}
     @Test
     public void Test_procces() {}












}
