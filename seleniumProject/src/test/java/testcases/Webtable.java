package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.WebDriverEventListener;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Webtable {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://money.rediff.com/losers/bse/daily/groupa");
		List<WebElement> rowNum = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		List<WebElement> colNum = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td"));
		
		for(int rows=1;rows<=rowNum.size();rows++) {
			
			for(int cols=1;cols<=colNum.size();cols++) {
			
			 System.out.print(driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+rows+"]/td["+cols+"]")).getText()+" ");
		}
			
		System.out.println();
		
	  }

	}
}	