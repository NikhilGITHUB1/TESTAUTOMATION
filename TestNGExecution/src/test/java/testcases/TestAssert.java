package testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAssert {
	

	@Test
	public void testAssert1() {
		Assert.assertEquals("pass", "fail");	
		System.out.println("Run before each test method");

		//softassert.assertAll();
	}
	
	
	@Test
	public void testAssert2() {
		Assert.assertEquals("test1", "test1","this has passed");
		//Assert.assertEquals(true,false,"this is failing");
		//softassert.assertAll();
	}

}
