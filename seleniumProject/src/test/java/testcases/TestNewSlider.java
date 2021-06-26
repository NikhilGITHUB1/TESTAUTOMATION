package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNewSlider {

public static void main(String[] args) {

	WebDriverManager.chromedriver().setup();
	//System.setProperty("webdriver.gecko.driver","/Users/nikhilkanojia/Desktop/drivers/geckodriver");	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://jqueryui.com/resources/demos/slider/default.html");
	
	WebElement mainSlider=driver.findElement(By.xpath("//*[@id=\"slider\"]"));
	int width=mainSlider.getSize().width/2;
	
	WebElement slider=driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
	
	new Actions(driver).dragAndDropBy(slider, width, 0).perform();
		
	}

}
