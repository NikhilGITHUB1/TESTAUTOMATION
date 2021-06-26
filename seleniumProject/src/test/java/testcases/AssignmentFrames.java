package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentFrames {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.gecko.driver","/Users/nikhilkanojia/Desktop/drivers/geckodriver");	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");
		
		List<WebElement> frames=driver.findElements(By.tagName("iframe"));
	    System.out.println(frames.size());
	    
	    for(WebElement frame:frames) {
	    	int count=0;
	    	
	    	if(frame.getAttribute("id").equals(null)) {
	    		driver.switchTo().frame(count);  		 
	    	}
	    	count++;
	    }
		
		
	}

}
