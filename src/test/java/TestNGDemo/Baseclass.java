package TestNGDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	WebDriver driver;
	@BeforeTest
	public void OpenBrowser() {
		WebDriverManager.edgedriver().setup();
		EdgeOptions Ed = new EdgeOptions();
		
		 driver = new EdgeDriver();
		
	}
	//@AfterTest
	//public void CloseBrowser()
	//{
	//driver.quit();	
	//}

}
