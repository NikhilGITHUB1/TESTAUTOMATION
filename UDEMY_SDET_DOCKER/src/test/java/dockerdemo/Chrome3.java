package dockerdemo;

import org.testng.annotations.Test;

public class Chrome3 extends TestBase {
	
	 @Test
	    public void remoteWebdriverTest() {
	        driver.get("http://google.co.uk");
	        System.out.println(driver.getTitle());

   }
}