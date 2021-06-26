package jmeterselenium;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JmeterSelenium {
	
	@Test
	public void method_Jmeter() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/nikhilkanojia/Downloads/chromedriver 8");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.google.com");
		
	}
	
	

}
