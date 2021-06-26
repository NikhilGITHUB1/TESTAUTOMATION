package testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;

import org.testng.asserts.SoftAssert;

public class TestAssertions {

	SoftAssert softassert = new SoftAssert();

	@Test
	public void testAssert3() {
		Assert.assertEquals("test", "test");
		softassert.assertAll();
		System.out.println("Run soft Assertion");
	}

	@Test
	public void testAssert4() {
		Assert.assertEquals("test1", "test1", "this has passed");
		Assert.assertEquals(true, false, "this is failing");
		System.out.println("Run via Assert:this will not print");

		softassert.assertAll();
	}

}
