package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Links {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.gecko.driver","/Users/nikhilkanojia/Desktop/drivers/geckodriver");	
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.wikipedia.org/");
		WebElement block=driver.findElement(By.xpath("//*[@id='www-wikipedia-org']/div[6]/div[3]"));
		List<WebElement> ele=block.findElements(By.tagName("a"));
		System.out.println("size:"+ele.size());
		
		for(WebElement e:ele) {
			System.out.println(e.getAttribute("href"));
		}
		
		
		
	}

}
