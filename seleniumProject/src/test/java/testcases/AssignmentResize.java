package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentResize {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.gecko.driver","/Users/nikhilkanojia/Desktop/drivers/geckodriver");	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Dimension d = new Dimension (100,100);
		
		driver.manage().window().setSize(d);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		
		for(int i=400;i<1000;i=i+50) {
			driver.manage().window().setSize(new Dimension(i+100, i+100));	
			
		}

		


		
	}

}
