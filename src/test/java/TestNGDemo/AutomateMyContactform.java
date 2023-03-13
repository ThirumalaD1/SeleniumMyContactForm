package TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(ListenersDemo.MyTestNGListeners.class)
public class AutomateMyContactform extends Baseclass{
	@Test
	public void ValidLogin() {
		driver.manage().window().maximize();
		driver.get("https://www.mycontactform.com/");
		System.out.println(driver.getTitle());
		WebElement Username = driver.findElement(By.xpath("//*[@id=\"user\"]"));
		Username.sendKeys("Prabhu123");
		WebElement Password = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		Password.sendKeys("12345");
		WebElement Login = driver.findElement(By.cssSelector("#right_col_top > form > div > input"));
		Login.click();
		System.out.println(driver.getTitle());
		WebElement NewFormWizard = driver.findElement(By.xpath("//*[@id=\"user_bar\"]/ul/li[2]/a"));
		NewFormWizard.click();
		WebElement StartWizard = driver.findElement(By.cssSelector("#center_col > form > div > input"));
		StartWizard.click();
		WebElement NameForm = driver.findElement(By.xpath("//*[@id=\"formname\"]"));
		NameForm.sendKeys("PMK");
		WebElement Next = driver.findElement(By.xpath("//*[@id=\"Submit\"]"));
		Next.click();
		WebElement Next1 = driver.findElement(By.xpath("//*[@id=\"Submit\"]"));
		Next1.click();
		WebElement Next2 = driver.findElement(By.xpath("//*[@id=\"Submit\"]"));
		Next2.click();
		WebElement Next3 = driver.findElement(By.cssSelector("#Submit"));
		Next3.click();
		WebElement SubjectEmailName = driver.findElement(By.className("long_txt"));
		SubjectEmailName.sendKeys("Tima");
		WebElement Next4 = driver.findElement(By.cssSelector("#Submit"));
		Next4.click();
		WebElement Next5 = driver.findElement(By.cssSelector("#Submit"));
		Next5.click();
		WebElement AutoSub = driver.findElement(By.xpath("//*[@id=\"autosub\"]"));
		AutoSub.sendKeys("Tima1");
		WebElement AutoResponse = driver.findElement(By.xpath("//*[@id=\"autotext\"]"));
		AutoResponse.sendKeys("Hello");
		WebElement Next6 = driver.findElement(By.xpath("//*[@id=\"Submit\"]"));
		Next6.click();
		WebElement Next7 = driver.findElement(By.xpath("//*[@id=\"Submit\"]"));
		Next7.click();
		WebElement HowManyQue = driver.findElement(By.xpath("//*[@id=\"numquestions\"]"));
		HowManyQue.sendKeys("1");
		WebElement Next8 = driver.findElement(By.xpath("//*[@id=\"Submit\"]"));
		Next8.click();
		WebElement Next9 = driver.findElement(By.xpath("//*[@id='Submit']"));
		Next9.click();
		WebElement Test1 = driver.findElement(By.xpath("//*[@id='question[]']"));
		Test1.sendKeys("Test the field A");
		WebElement Next10 = driver.findElement(By.xpath("//*[@id='Submit']"));
		Next10.click();
		WebElement Next11 = driver.findElement(By.xpath("//*[@id='Submit']"));
		Next11.click();
		WebElement Next12 = driver.findElement(By.xpath("//*[@id='Submit']"));
		Next12.click();
		WebElement Next13 = driver.findElement(By.xpath("//*[@id='Submit']"));
		Next13.click();
		WebElement Next14 = driver.findElement(By.xpath("//*[@id='Submit']"));
		Next14.click();
		WebElement Next15 = driver.findElement(By.xpath("//*[@id='Submit']"));
		Next15.click();
		WebElement Next16 = driver.findElement(By.xpath("//*[@id='Submit']"));
		Next16.click();
		WebElement Next17 = driver.findElement(By.xpath("//*[@id='Submit']"));
		Next17.click();
		WebElement Next18 = driver.findElement(By.xpath("//*[@id='Submit']"));
		Next18.click();
		WebElement Next19 = driver.findElement(By.xpath("//*[@id='Submit']"));
		Next19.click();
		WebElement Next20 = driver.findElement(By.xpath("//*[@id='Submit']"));
		Next20.click();
		WebElement Next21 = driver.findElement(By.xpath("//*[@id='Submit']"));
		Next21.click();
		WebElement Next22 = driver.findElement(By.xpath("//*[@id='Submit']"));
		Next22.click();
		WebElement Next23 = driver.findElement(By.xpath("//*[@id='Submit']"));
		Next23.click();
		WebElement Next24 = driver.findElement(By.xpath("//*[@id='Submit']"));
		Next24.click();
		
		
		
		
		
	}
	@Test
	public void InValidLogin() {
		driver.manage().window().maximize();
		driver.get("https://www.mycontactform.com/");
		System.out.println(driver.getTitle());
		WebElement Username = driver.findElement(By.xpath("//*[@id=\"user\"]"));
		Username.sendKeys("Prabhu123");
		WebElement Password = driver.findElement(By.xpath("//*[@id=\"pas\"]"));
		Password.sendKeys("1234");
		WebElement Login = driver.findElement(By.cssSelector("#right_col_top > form > div > input"));
		Login.click();
		System.out.println(driver.getTitle());
		
		
		
		
	}

}
