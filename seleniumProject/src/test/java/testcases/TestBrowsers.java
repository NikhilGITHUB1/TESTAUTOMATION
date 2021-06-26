package testcases;

import java.net.MalformedURLException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBrowsers {
	
public static void main(String args[]) throws MalformedURLException {
	
WebDriverManager.firefoxdriver().setup();
//System.setProperty("webdriver.gecko.driver","/Users/nikhilkanojia/Desktop/drivers/geckodriver");	
FirefoxDriver driver=new FirefoxDriver();

WebDriverManager.chromedriver().setup();
//System.setProperty("webdriver.gecko.driver","/Users/nikhilkanojia/Desktop/drivers/geckodriver");	
ChromeDriver driver1=new ChromeDriver();


	}

}
