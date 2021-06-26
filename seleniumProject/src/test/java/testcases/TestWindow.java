package testcases;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestWindow {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.hdfcbank.com/assets/popuppages/netbanking.htm");	
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/a")).click();
		driver.switchTo().frame(0);
	    
		 WebDriverWait wait=new WebDriverWait(driver,5);
		 wait.until(
        ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/table[2]/tbody/tr/td[3]/table/tbody/tr[1]/td/table[3]/tbody/tr/td/a"))).click();
		
		  Set<String> handles=driver.getWindowHandles(); 
		  Iterator<String> iterate=handles.iterator();
		  
		  while(iterate.hasNext()) { 
		  String second_window=iterate.next();
		  driver.switchTo().window(second_window);
		  System.out.println(driver.getTitle()); 
		  
		  }
		 
	}

}
