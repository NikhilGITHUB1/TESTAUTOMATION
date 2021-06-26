package testlisteners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class TestListeners implements ITestListener{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
	System.out.println("Passed test:"+result.getName());	
	}

	public void onTestFailure(ITestResult result) {
	System.setProperty("org.uncommons.reportng.escape-output","false");
    //System.out.println("Capturing ss for the failed test:"+result.getName());
		Reporter.log("<a href=\"test.png\" target=\"_blank\">screenshot link</a>");
	}

	public void onTestSkipped(ITestResult result) {
		
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
