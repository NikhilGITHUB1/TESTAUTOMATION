package jmeterselenium.UDEMY_JmeterSelenium;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestJmeter {
	
@Test
public void jmeterrun() {
	
	System.setProperty("webdriver.chrome.driver", "/Users/nikhilkanojia/Downloads/chromedriver");

	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
	
	
}

}
