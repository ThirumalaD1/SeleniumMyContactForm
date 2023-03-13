package TestNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import javax.swing.plaf.synth.SynthStyleFactory;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestMyContactForm2 {
  @Test(dataProvider = "dp" ,timeOut=4000)
  public void validTestcase(Integer n, String s) throws InterruptedException {
	  System.out.println("Test is successful");
	  Thread.sleep(6000);
  }
  @Test
  public void InvalidTestcase(Integer n, String s) {
	  System.out.println("Invalid scenarios");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Launch URL and validate login");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Logout");
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
	 
  }

  @AfterClass
  public void afterClass() {
	  
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Start setting Database");
	 
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Disconnect the database");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Open the broser");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Close the browser");
  }

}
