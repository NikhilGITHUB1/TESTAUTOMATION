package invocationandthreadpool;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Basetest {
	
public WebDriver driver;	

public WebDriver getDriver(String browser) {
	
if(browser.equals("chrome")) {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
}
else if(browser.equals("ff")) {
	WebDriverManager.firefoxdriver().setup();
	driver=new FirefoxDriver();
}

return driver;
	
}

}
