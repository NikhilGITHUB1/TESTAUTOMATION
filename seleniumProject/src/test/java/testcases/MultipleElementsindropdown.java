package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleElementsindropdown {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.gecko.driver","/Users/nikhilkanojia/Desktop/drivers/geckodriver");	
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.wikipedia.org/");	
		
		List<WebElement> options=driver.findElements(By.tagName("option"));
		for(int i=0;i<options.size();i++) {
			System.out.println(options.get(i).getText());
			System.out.println(options.get(i).getAttribute("lang"));

		}
		
	}

}
