package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeBrowserTestNG {

	@Test
	public  void loginTest() {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mycontactform.com/");

	}

}
