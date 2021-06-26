package webdriver_basics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChild {
	
	static String text;

	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/nikhilkanojia/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.findElement(By.cssSelector(".cart-header-navlink.blinkingText")).click();
		
		Set<String> handles = driver.getWindowHandles(); //parentid , childid
		Iterator<String> it = handles.iterator();
		String parent = it.next();
		//String child = it.next();
		
		while(it.hasNext()) {
			
			String child = it.next();
			driver.switchTo().window(child);
			text = driver.findElement(By.cssSelector(".im-para.red")).getText();
			
			String[] updatedtext = text.split("at");
			String[] text1 = updatedtext[1].split("with");
			text = text1[0].trim();
			
			Thread.sleep(2000);
			break;
			
			
		}
		
		driver.switchTo().window(parent);
		driver.findElement(By.cssSelector(".search-keyword")).sendKeys(text);
		
		
		

}
	
	
}
