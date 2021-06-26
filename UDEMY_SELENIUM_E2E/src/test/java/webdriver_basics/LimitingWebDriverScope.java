package webdriver_basics;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LimitingWebDriverScope {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/nikhilkanojia/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		WebElement footerdriver = driver.findElement(By.cssSelector("#gf-BIG"));

		System.out.println(footerdriver.findElements(By.tagName("a")).size());

		// use the footerdriver as the driver to find the links of the 1st column

		WebElement column1 = footerdriver.findElement(By.xpath("//*[@id='gf-BIG']/table/tbody/tr/td[1]/ul"));

		System.out.println(column1.findElements(By.tagName("a")).size());

		List<WebElement> links = column1.findElements(By.tagName("a"));

		for (WebElement link : links) {

			link.sendKeys(Keys.chord(Keys.COMMAND, Keys.ENTER));

		}

		Set<String> handle = driver.getWindowHandles();
		Iterator<String> it = handle.iterator();
		
		String parent =it.next();
		
		while(it.hasNext()) {
			String child = it.next();
			driver.switchTo().window(child);
			System.out.println(driver.getTitle());
			
			
		}

	}

}
