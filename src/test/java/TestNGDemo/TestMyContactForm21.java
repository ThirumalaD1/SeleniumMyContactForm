package TestNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestMyContactForm21 {
  @Test(dataProvider = "dp")
  public void Validtestcase(Integer n, String s) {
	  System.out.println("Test is successful");
  }
  @Test(description= "I want to test with invalid test data")
  public void InValidtestcase() {
	  System.out.println("Negative scenario");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Launch the URL and validate login");
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
	  System.out.println("Set conf database");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Disconnect data base");
	 
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Open the browser");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Close the browser");
  }

}
