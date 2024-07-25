package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Baseclass {
	public  static WebDriver driver;
	@BeforeMethod
	public void login() {
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/index.html\");");
	}
	@AfterMethod
	public void TearDown() {
		driver.close();
		
	}
	}

