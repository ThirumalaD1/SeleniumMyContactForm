package browsertesting;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeBrowserJunit {

	@Test
	public  void loginTest() {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mycontactform.com/");

	}

}
