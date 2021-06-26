package cucumbertest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {
	
	private static WebDriver driver = null;
	 public static void main(String[] args) {
	 // Create a new instance of the Firefox driver
	 
		 driver = new ChromeDriver();
	 
	        //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
	 
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	        //Launch the Online Store Website
	 
	        driver.get("http://www.store.demoqa.com");
	 
	      driver.findElement(By.xpath("//*[@id=\"nav-menu-item-cart\"]/a/span/i")).click();
	      driver.findElement(By.xpath("//*[contains(text(),'Your cart is currently empty')]"));
	        
	      driver.findElement(By.xpath("//*[contains(text(),'Return to shop')]")).click();
	      //driver.findElement(By.linkText())
	      
	 
	        driver.quit();
	 
	 }

}
