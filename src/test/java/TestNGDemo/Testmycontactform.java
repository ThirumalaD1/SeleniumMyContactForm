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

public class Testmycontactform {
  @Test(dataProvider = "dp", priority = 0)
  public void testCaseValid(Integer n, String s) {
	  
	  System.out.println(" Test is successfull");
  }
  @Test(priority = 1, timeOut = 3000, description = " I want to test with invalid detaisl", invocationCount = 10)
  public void testCaseInvalid() throws InterruptedException  {
	  System.out.println("Negative scenaoris");
	  Thread.sleep(4000);
	  
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println(" Launch URL nd valid login");
  }

  @AfterMethod
  public void afterMethod() {
	  
	  System.out.println(" Logout ");
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
      new Object[] { 3, "a" },
      new Object[] { 4, "b" },
      new Object[] { 5, "a" },
      new Object[] { 6, "b" },
      new Object[] { 7, "Z" },
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
	  System.out.println("Setting Database connecitnofor getting testdata");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println(" Close connnecton and genderate reports ");
  }

  @BeforeSuite
  public void beforeSuite() {
	  
	  System.out.println(" Openthe browser");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println(" close the browser");
  }

}
