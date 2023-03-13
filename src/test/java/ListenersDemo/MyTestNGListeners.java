package ListenersDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyTestNGListeners implements ITestListener {
	public void onTestStart(ITestResult result) {
		System.out.println("Test started");
		}
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test success");
		
	}
	public void onTestFailure(ITestResult result) {
		System.out.println("Test failed");
		
	}
	public void onTestSkipped(ITestResult result) {
	System.out.println("Test skipped");
	}
	}
	


