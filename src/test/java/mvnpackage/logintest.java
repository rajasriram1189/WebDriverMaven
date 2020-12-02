package mvnpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class logintest {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}


	@Test
	public void dologin() throws InterruptedException{
		driver.get("http://gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("abc.gmail.com");
		
		
	}
	
	@AfterSuite
	public void teardown() {
		driver.quit();
	}
}
