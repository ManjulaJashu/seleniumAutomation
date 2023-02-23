import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Main {

	@Test
	public void test1()
	{
	  WebDriverManager.chromedriver().setup();
	   WebDriver driver=new ChromeDriver();
	    driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	driver.findElement(By.id("user-name")).sendKeys("user-name");
	driver.findElement(By.id("password")).sendKeys("password");
	driver.findElement(By.id("login-button")).sendKeys("login-button");
	}
	
}
