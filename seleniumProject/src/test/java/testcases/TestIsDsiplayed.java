package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestIsDsiplayed {
	
	public static WebDriver driver;
    
    public static boolean isElementPresent(By by) {
    	try {
		driver.findElement(by);
		return true;
    	}
    	catch(Throwable t) {
    		return false;
    	}
	}

	public static void main(String[] args) {
		
        
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.gecko.driver","/Users/nikhilkanojia/Desktop/drivers/geckodriver");	
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.wikipedia.org/");
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\"js-link-box-en\"]/strong")).isDisplayed());
		
		//isElementPresent
		System.out.println(isElementPresent(By.xpath("//*[@id=\"searchLanguage\"]")));
		
		
	}

}
