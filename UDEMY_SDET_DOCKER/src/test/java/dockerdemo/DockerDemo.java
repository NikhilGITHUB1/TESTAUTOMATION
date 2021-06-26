package dockerdemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DockerDemo {

	public static void main(String[] args) throws MalformedURLException {
		
		URL url = new URL("http://localhost:4444/wd/hub");
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		RemoteWebDriver driver = new RemoteWebDriver(url,cap);
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		
		
		
	}
	
}
