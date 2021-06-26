package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {
	
	@BeforeTest
	public void beforetest() {
		System.out.println("Runs only once before all test methods");
		
	}
	
	@BeforeMethod
	public void precondition() {
		System.out.println("Run before each test method");
		
	}
	
	
	@AfterMethod
	public void postcondition() {
		System.out.println("Run after each test method");
	}
	
	@Test(priority=1,groups= {"functional"})
	public void doregistration() {
		System.out.println("Register");
	}
	
	@Test(priority=2,groups= {"smoke"})
	public void dologontestcase() {
		System.out.println("Login");
	}
	
	@Test(priority=3,groups= {"smoke","functional"})
	public void showUsername() {
		System.out.println("UN");
	}
	
	@Test(priority=4,groups= {"smoke","functional"})
	public void showPass() {
		System.out.println("Pass");
	}
	
	@AfterTest
	public void aftertest() {
		System.out.println("Runs only once after all test methods");
		
	}
	

}
