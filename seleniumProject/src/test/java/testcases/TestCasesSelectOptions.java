package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCasesSelectOptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.gecko.driver","/Users/nikhilkanojia/Desktop/drivers/geckodriver");	
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.wikipedia.org/");	
		/*
		List<WebElement> ls=driver.findElements(By.tagName("option"));
		
		for(int i=0;i<ls.size();i++) {
        WebElement options=ls.get(i);
       
        if(options.getText().equals("Български")) {
        	System.out.println("Found");
			options.click();
		}
	  }
	*/
		//To check if thats a multi select
		/*
		WebElement e=driver.findElement(By.id("searchLanguage"));
		Select select=new Select(e);
		if(select.isMultiple()) {
        System.out.println("isMultiple");
		}
		else {
	        System.out.println("isNotMultiple");

		}
		*/
		
		WebElement e=driver.findElement(By.id("searchLanguage"));
		Select select=new Select(e);
		
		List<WebElement> allOptions=select.getOptions();
		
		for(int i=0;i<allOptions.size();i++) {
			 WebElement options=allOptions.get(i);
		       
		        if(options.getText().equals("Български")) {
		        	System.out.println("Found");
					options.click();
			
		  }	
		}	

  }
}
