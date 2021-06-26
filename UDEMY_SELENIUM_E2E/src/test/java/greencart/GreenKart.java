package greencart;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//after writing the code, we realised, that we don't want to hard code cucumber here
//to avoid hardcoding, we will store the veggies in a arraylist

public class GreenKart {

	public static void main(String[] args) {
		
		String[] vegetables = {"Cucumber", "Beetroot"};
		List veglist = Arrays.asList(vegetables);
		
		System.setProperty("webdriver.chrome.driver", "/Users/nikhilkanojia/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		List<WebElement> veggies = driver.findElements(By.xpath("//div[@class='product']/h4"));
		List<WebElement> addtocart = driver.findElements(By.xpath("//div[@class='product']/div/button"));

		
		for(int i=0;i<veggies.size();i++) {
			int count = 0;
			String[] name = veggies.get(i).getText().split("-");
			String formattedName = name[0].trim();
			
			if(veglist.contains(formattedName)) {
				
				addtocart.get(i).click();
				count++;
				
				if(count == veglist.size()) {
					break;
				}
				//break;
				
			}
			
		}
		
		
	}
	
}
