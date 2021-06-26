package testrunner;


import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.PickleEventWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Map;
import java.util.UUID;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import managers.WebDriverManager;
//import selenium_tests.Webdriver_builder;


@CucumberOptions(
 features = "src/test/resources/features",
 glue = {"stepdefinitions"}
 
 )

public class TestRunner {
	
	//WebDriverManager mgr;
	
	public static WebDriverManager driver = new WebDriverManager();
	private TestNGCucumberRunner testNGCucumberRunner;
	private volatile static int testID;
	
	
	@DataProvider
	public Object[][] scenarios() {

		try{
			
			
			
			return testNGCucumberRunner.provideScenarios();
		}catch(Exception e){

			if (driver.getDriver() == null) System.out.println("There was a problem initialising the Webdriver");

			throw e;

		}
	}
	
	//here we have provided a data provider, and passing it to the @Test method
	//we return provide scenarios, which takes into consideration, pickle event and the cucumber feature
	//refer https://html.developreference.com/article/14760465/How+to+run+Cucumber+scenario+in+different+%23Test+or+xml+%3Ctest%3E+with+Cucumber+%26+TestNG
    // basically we want to run each scenario as a test
	
	@Test(groups = "cucumber", description = "Runs Cucumber Scenarios", dataProvider = "scenarios")
	public void run_scenario(PickleEventWrapper pickleEvent, CucumberFeatureWrapper cucumberFeature) throws Throwable {

		//driver.get().esm.clear_captured_proxy_data();

		testNGCucumberRunner.runScenario(pickleEvent.getPickleEvent());


	}


	@AfterClass(alwaysRun = true)
	public void tear_down() throws Exception {

		testNGCucumberRunner.finish();

}
	
	
//	//==============================================
//		// Use reflection to dynamically change cucumber options (create unique .json files/results).
//		//==============================================  
//
//		static volatile boolean firstThread = true;
//	
//		private synchronized void rewrite_cucumber_options(Class<?> clazz, String key, Object newValue, boolean requireOffset) throws Exception{  
//
//			if (requireOffset){
//
//				//Slightly offset each parralel thread so each gets unique CucumberOptions (.json file name)
//				if (!firstThread) Thread.sleep(6000);
//				firstThread = false;
//
//			}
//
//			Annotation options = clazz.getAnnotation(CucumberOptions.class);                   //get the CucumberOptions annotation  
//			InvocationHandler proxyHandler = Proxy.getInvocationHandler(options);              //setup handler so we can update Annotation using reflection. Basically creates a proxy for the Cucumber Options class
//			Field f = proxyHandler.getClass().getDeclaredField("memberValues");                //the annotaton key/values are stored in the memberValues field
//			f.setAccessible(true);                                                             //suppress any access issues when looking at f
//			@SuppressWarnings("unchecked")
//			Map<String, Object> memberValues = (Map<String, Object>) f.get(proxyHandler);      //get the key-value map for the proxy
//			memberValues.remove(key);                                                          //renove the key entry...don't worry, we'll add it back
//			memberValues.put(key,newValue);     
//			
//		}
//	
	
	
}
