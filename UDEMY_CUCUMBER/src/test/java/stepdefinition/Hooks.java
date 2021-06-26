package stepdefinition;

import java.sql.Driver;

import org.junit.Assume;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends Base{
	
	@Before(value="@skip", order=0)
	public void beforemobileHook(Scenario scenario) {
		
		System.out.println("Skipped scenario"+scenario.getName());
		Assume.assumeTrue(true);
		
	}
	
	
	@After("@mobile")
	public void aftermobileHook() {
		
		System.out.println("after mobile hook");

		
	}

	
	
	@Before("@regression1")
	public void beforeregHook() {
		
		System.out.println("before regression hook");
		
	}
	
	
	@After("@regression1")
	public void afterregHook() {
		
		System.out.println("after regression hook");

		
	}
	
	
	@After("@regression")
	public void afterExecutionCloseBrowser() {
		
		driver.close();
		
	}

}
