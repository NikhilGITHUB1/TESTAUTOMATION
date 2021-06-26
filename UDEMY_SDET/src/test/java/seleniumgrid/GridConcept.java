package seleniumgrid;

import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;



public class GridConcept {
	
	@Test
	public void runtest() throws MalformedURLException {
		
		DesiredCapabilities dc  = new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.MAC);
		
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.52:4444/wd/hub"),dc);
		driver.get("http://google.com");
		
	}

}
