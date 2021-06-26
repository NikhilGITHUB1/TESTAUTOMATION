package webdriver_basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datehandler {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/nikhilkanojia/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.path2usa.com/travel-companions");
		
		driver.findElement(By.cssSelector("#travel_date")).click();
		
		
		while(!driver.findElement(By.cssSelector("div[class='datepicker-days'] th[class='datepicker-switch']")).getText().contains("March")){
			
		   driver.findElement(By.cssSelector("div[class='datepicker-days'] th[class='next']")).click();
			
		}
		
		
		
		List<WebElement> ls  = driver.findElements(By.className("day"));
		
		for(int i=0;i<ls.size();i++) {
			
			if(ls.get(i).getText().contentEquals("6")) {
				ls.get(i).click();
				break;
			}
			
			
		}
		
		
		
		
	}

}
