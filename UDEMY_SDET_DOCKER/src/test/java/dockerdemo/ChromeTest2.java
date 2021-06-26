package dockerdemo;

import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ChromeTest2 {
	
	@Test	
	public void test2() throws MalformedURLException {
		
		//URL url = new URL("http://localhost:4444/wd/hub");
		//http://18.222.114.219:4444/
		URL url = new URL("http://18.222.114.219:4444/wd/hub");

		DesiredCapabilities cap = DesiredCapabilities.chrome();
		RemoteWebDriver driver = new RemoteWebDriver(url,cap);
		driver.get("https://www.gmail.com");
		System.out.println(driver.getTitle());
		
		
		
		
	}
	

}
