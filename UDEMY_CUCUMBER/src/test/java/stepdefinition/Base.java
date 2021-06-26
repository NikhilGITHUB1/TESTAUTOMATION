package stepdefinition;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public static WebDriver driver;
	
	public static Properties prop;
	
	public static WebDriver getDriver() throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/nikhilkanojia/Downloads/chromedriver 8");
		
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream("/Users/nikhilkanojia/seleniumProject/UDEMY_CUCUMBER/src/resources/global.properties");
		prop.load(fis);
		
		
		driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));
		
		return driver;
		
	}

}
