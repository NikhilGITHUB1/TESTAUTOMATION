package testcases;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTestcase extends BaseTest{
	
	@Test
	public void skiptest() {
	
	throw new SkipException("skipping as the condition is not met");
		
	}
	
	}
