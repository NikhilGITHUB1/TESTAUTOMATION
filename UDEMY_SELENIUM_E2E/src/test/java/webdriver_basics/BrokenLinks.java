package webdriver_basics;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/nikhilkanojia/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		SoftAssert a = new SoftAssert();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> hrefs = driver.findElements(By.tagName("a")); 
		
		for(WebElement href:hrefs) {
			
			String url=href.getAttribute("href");
			
			try {
			
			URL url1 = new URL(url);
			
			HttpURLConnection con = (HttpURLConnection) url1.openConnection();
			con.setConnectTimeout(3000);

			
			//con.setRequestMethod("GET");
			con.connect();
			
			int respcode = con.getResponseCode();
			if(respcode==404) {
				System.out.println("broken link:"+url);
				a.assertTrue(respcode==400, "the link with url " +url+ " is broken with "+respcode);
				break;
			}
			
			}
			catch(Exception e) {
				
			}	
			
		}
		
		a.assertAll();
	}

}
