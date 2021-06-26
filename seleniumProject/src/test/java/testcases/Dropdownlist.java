package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdownlist {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.gecko.driver","/Users/nikhilkanojia/Desktop/drivers/geckodriver");	
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.wikipedia.org/");
		WebElement dropdown=driver.findElement(By.id("searchLanguage"));
		Select select=new Select(dropdown);
		//select.selectByVisibleText("Dansk");
		select.selectByValue("hi");
		
		
	}

}
