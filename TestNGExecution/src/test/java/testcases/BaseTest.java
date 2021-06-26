package testcases;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	
@BeforeSuite
public void setup() {
	System.out.println("Set up");

}

@AfterSuite
public void teardown() {
	System.out.println("tear down");

}

}
