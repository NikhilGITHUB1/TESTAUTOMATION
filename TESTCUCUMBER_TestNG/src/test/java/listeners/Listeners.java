package listeners;

import org.testng.ITestListener;
import org.apache.commons.lang.exception.ExceptionUtils;
import org.testng.ITestContext;
import org.testng.ITestResult;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import managers.WebDriverManager;

import static testrunner.TestRunner.driver;

public class Listeners  implements ITestListener{
	
	public static ThreadLocal<Scenario> scenario = new ThreadLocal<Scenario>();


	public void onTestStart(ITestResult arg0) {

		try {

			//driver.get().esm.delete_cookies();

		} catch (Exception e) {

			e.printStackTrace();
		}


	}
	
	//==========================
	// If testNG registers a test as NOT a success then output logs and screenshot
	//==========================	

	 public void onTestFailure(ITestResult iTestResult) { log_test_failure( iTestResult);}
	public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {log_test_failure(iTestResult);}
	public void onTestSkipped(ITestResult iTestResult) {log_test_failure(iTestResult);}

	//blank overides
	public void onTestSuccess(ITestResult iTestResult) {}
	public void onFinish(ITestContext arg0) {}
	public void onStart(ITestContext arg0) {


	}

	//==========================
	// Cucumber hook
	//==========================	

	@After
	public void save_cucumber_scenario_details(Scenario scenario) throws Exception{
		
		//Save cucumber scenario details, to be used by testNG listeners
		//Cucumber hook triggers before testNG test-end listeners. 
		//So there is a need to transfer scenario details to testNG listener, 
		//to be included in its functionality.
		Listeners.scenario.set(scenario);


	}

	private String get_stack_trace(ITestResult arg0){

		return ExceptionUtils.getStackTrace(arg0.getThrowable());

	}

	private void log_test_failure(ITestResult iTestResult ){

		//Dont output log if cucumber didnt register scenario failure
		if(Listeners.scenario.get() != null && !Listeners.scenario.get().isFailed()) return;

		
	    //Call webriver logger and include the cucumber scenario name and testNG stack trace
		
	    ((WebDriverManager) driver.getDriver()).log_test_failure_and_take_screenshot(Listeners.scenario.get().getName(),get_stack_trace(iTestResult));	
		

	}

}
