package STYLI_FW.STYLI_FW1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;


public class StyliTest {

@Test
public void stylitest() throws MalformedURLException, InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "/Users/nikhilkanojia/Downloads/chromedriver");

	URL url = new URL("http://localhost:4444/wd/hub");
	DesiredCapabilities cap = DesiredCapabilities.chrome();
	RemoteWebDriver driver = new RemoteWebDriver(url,cap);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://stylishop.com/");
		String title=driver.getTitle();
		System.out.println(title);
		driver.navigate().to("https://stylishop.com/sa/en");
	
		driver.findElement(By.cssSelector("a[title='Men']")).click();
		driver.findElement(By.xpath("//*[contains(text(),'Jackets')]")).click();
		
		driver.findElement(By.xpath("//*[@title='Plain Hooded Jacket with Long Sleeves']")).click();
	    Thread.sleep(1000);

		while(true) {
	    driver.findElement(By.xpath("(//*[@class='buttonNext___2mOCa carousel__next-button'])[1]")).click();
	    Thread.sleep(1000);
        if(!driver.findElement(By.xpath("(//*[@class='buttonNext___2mOCa carousel__next-button'])[1]")).isEnabled()) {
        	break;
        }
	  
		}	
		
		driver.quit();
	}

}
