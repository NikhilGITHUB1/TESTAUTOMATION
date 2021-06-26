package webdriver_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebDriverDemo {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/nikhilkanojia/Downloads/chromedriver 8");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		driver.get("https://www.facebook.com");
		//driver.findElement(By.id("email")).sendKeys("myeamil");
		
		//driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("dsdsdsd"); // since this has space,
		// it will throw error
		
		
		
		//driver.close();
		
		
	}

}
