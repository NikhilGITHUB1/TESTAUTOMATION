package webdriver_basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Styli {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/nikhilkanojia/Downloads/chromedriver 2");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://stylishop.com/");
		driver.navigate().to("https://stylishop.com/sa/en");
		//WebElement e= driver.findElement(By.linkText("a")).getAttribute("href").contains("/sa/en/list/men")
		//driver.findElement(By.partialLinkText("/sa/en/list/men")).click();
		driver.findElement(By.cssSelector("a[title='Men']")).click();
		driver.findElement(By.xpath("//*[contains(text(),'Jackets')]")).click();
		driver.findElement(By.xpath("//*[@alt='Plain Hooded Jacket with Long Sleeves']")).click();
		while(true) {
	    driver.findElement(By.xpath("(//*[@class='buttonNext___2mOCa carousel__next-button'])[1]")).click();
	    
        if(!driver.findElement(By.xpath("(//*[@class='buttonNext___2mOCa carousel__next-button'])[1]")).isEnabled()) {
        	break;
        }
	  
		}	
		
		driver.quit();
	}

}
