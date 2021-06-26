package testcases;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDependencies {
	
	@Test(priority=1)
	public void doregistration() {
		System.out.println("Register");
		Assert.fail("this will fail");
	}
	
	@Test(priority=2, dependsOnMethods= "doregistration")
	public void dologontestcase() {
		System.out.println("Login");
	}
	
	@Test(priority=3, dependsOnMethods= "doregistration",alwaysRun=true)
	public void dologontestcase1() {
		System.out.println("Login1");
	}
	
	@Test(priority=4, dependsOnMethods= "doregistration")
	public void dologontestcase2() {
		System.out.println("Login2");
	}

}
