package webdriver_basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxClick {
	
	public static void main(String[] args) {
		
	
	
	System.setProperty("webdriver.chrome.driver", "/Users/nikhilkanojia/Downloads/chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.spicejet.com");
	
	  driver.manage().window().maximize();

	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    
	    // here we are trying to find the css selector and we selecting each and every checkbox
	    //we used the parent child relationship, and in css, we use space to traverse from parent to child
	    List<WebElement> checkboxes = driver.findElements(By.cssSelector("[id='discount-checkbox'] div input"));
	    
	    for(WebElement chkbox : checkboxes) {
	    	chkbox.click();
	    }
}
}