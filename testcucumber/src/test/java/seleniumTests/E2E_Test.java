package seleniumTests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




@SuppressWarnings("unused")
public class E2E_Test {
	private static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","/testcucumber/src/test/resources/exe_files/chromedriver");
		
		driver = new ChromeDriver();
		//driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.shop.demoqa.com");
		
	}
	
}	