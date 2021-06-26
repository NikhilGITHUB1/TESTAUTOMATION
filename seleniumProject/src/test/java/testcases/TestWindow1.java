package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestWindow1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/a"));
		
		Actions action=new Actions(driver);
		WebElement e=driver.findElement(By.xpath("/html/body/form/table[2]/tbody/tr/td[3]/table/tbody/tr[1]/td/table[3]/tbody/tr/td/a"));
		action.moveToElement(e).build().perform();
		
		//WebDriverWait wait=new WebDriverWait(driver,5);
		//wait.until(
        //ExpectedConditions.elementToBeClickable())).click();
		

	}

}
