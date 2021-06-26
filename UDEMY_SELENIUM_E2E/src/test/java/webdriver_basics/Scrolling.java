package webdriver_basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;


public class Scrolling {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/nikhilkanojia/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,600)");
		
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		List<WebElement> ls = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum=0;
		
		for(int i=0;i<ls.size();i++) {
			sum = sum + Integer.parseInt(ls.get(i).getText());
		}
		
		System.out.println(sum);
		
		
		int totalAmount =Integer.parseInt(driver.findElement(By.xpath("//div[@class='totalAmount']")).getText().split(":")[1].trim());
		
		System.out.println(totalAmount);
		Assert.assertEquals(sum, totalAmount);
		
		//Assigment 
		
		//no of rows
		List<WebElement> ls1 =driver.findElements(By.cssSelector(".table-display tr"));
		System.out.println(ls1.size());
		
		//no of columns
		List<WebElement> ls2 =driver.findElements(By.cssSelector(".table-display th"));
		System.out.println(ls2.size());
		
		//print the 2nd row
		List<WebElement> ls3 = driver.findElements(By.xpath("//*[@class='table-display']//tr[3]/td"));
		for(WebElement e:ls3) {
			System.out.println(e.getText());
		}
		
		
		//Assignment autosuggestion
		driver.findElement(By.cssSelector(".inputs.ui-autocomplete-input")).sendKeys("ind");
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		
		
		List<WebElement> ls4 = driver.findElements(By.cssSelector(".ui-menu-item div"));
		
		for(int i=0;i<ls4.size();i++) {
			if(ls4.get(i).getText().equals("India")){
				
				ls4.get(i).click();
				break;
				
			}
		}
		
		//to get the entered attribute value
		System.out.println(driver.findElement(By.cssSelector(".inputs.ui-autocomplete-input")).getAttribute("value"));
		
		
		/* could have tried the below code as well----====
		 
		 WebDriver driver = new ChromeDriver();

    driver.get("http://qaclickacademy.com/practice.php");

    driver.findElement(By.id("autocomplete")).sendKeys("ind");

    Thread.sleep(2000);

    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

   System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value")); 
		 
		 */
		
		
		

		
		
		
		
		
		
	    
		
		
	}

}
