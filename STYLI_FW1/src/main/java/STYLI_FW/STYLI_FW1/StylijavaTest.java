package STYLI_FW.STYLI_FW1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class StylijavaTest {

	@Test
	public void styliJavaTest() throws MalformedURLException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/nikhilkanojia/Downloads/chromedriver 3");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://stylishop.com/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.navigate().to("https://stylishop.com/sa/en");
		// WebElement e=
		// driver.findElement(By.linkText("a")).getAttribute("href").contains("/sa/en/list/men")
		// driver.findElement(By.partialLinkText("/sa/en/list/men")).click();
		driver.findElement(By.cssSelector("a[title='Men']")).click();
		driver.findElement(By.xpath("//*[contains(text(),'Activewear')]")).click();

		driver.findElement(By.xpath("//*[@title='NSW Just Do It Printed Tank']")).click();
	     JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,1000)");


		driver.findElement(By.xpath("//*[contains(@class,'m-15')]")).click();
		WebElement e = driver.findElement(By.xpath("(//*[@dir='ltr'])[2]"));
        e.sendKeys("test@test.com");
        e.sendKeys(Keys.ESCAPE);
        
       // WebElement nextButton = driver.findElement(By.xpath("(//*[contains(@class,'buttonNext')])[1]"));
        
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        //js1.executeScript("arguments[0].scrollIntoView();", nextButton); 
        js1.executeScript("window.scrollBy(0,-1000)");
        Thread.sleep(2000);

        
		while (true) {
			driver.findElement(By.xpath("(//*[contains(@class,'buttonNext')])[1]")).click();
			Thread.sleep(1000);
			if (!driver.findElement(By.xpath("(//*[contains(@class,'buttonNext')])[1]"))
					.isEnabled()) {
				break;
			}

		}

		driver.quit();
	}

}
