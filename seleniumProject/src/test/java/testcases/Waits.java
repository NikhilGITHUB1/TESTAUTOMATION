package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.gecko.driver","/Users/nikhilkanojia/Desktop/drivers/geckodriver");	
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("kanojia.nikhil07@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
		driver.findElement(By.name("password")).sendKeys("password");
		
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"passwordNext\"]/content/span"))).click();
		//WebDriverWait wait1=new WebDriverWait(driver,10);
		//wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"password\"]/div[2]/div[2]/div"))).getText();

		System.out.println(driver.findElement(By.xpath("//*[@id=\"password\"]/div[2]/div[2]/div")).getText());
		
	}

}
