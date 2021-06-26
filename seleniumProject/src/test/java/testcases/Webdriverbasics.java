package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webdriverbasics {

public static void main(String[] args) {

	//WebDriverManager.firefoxdriver().setup();
	//System.setProperty("webdriver.gecko.driver","/Users/nikhilkanojia/Desktop/drivers/geckodriver");	
	//FirefoxDriver driver=new FirefoxDriver();
	WebDriverManager.chromedriver().setup();
	//System.setProperty("webdriver.gecko.driver","/Users/nikhilkanojia/Desktop/drivers/geckodriver");	
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://way2automation.com");
	String title=driver.getTitle();
	System.out.println(title);
	driver.close();
	driver.quit();
		
	}

}
