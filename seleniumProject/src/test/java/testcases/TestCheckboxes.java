package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCheckboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//div[4]/input[1]
		
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.gecko.driver","/Users/nikhilkanojia/Desktop/drivers/geckodriver");	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
		WebElement block =driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]"));
		List<WebElement> chkboxes=block.findElements(By.name("sports"));
		System.out.println(chkboxes.size());
		
        for(WebElement chkbox:chkboxes)	{
        	chkbox.click();
        }
		
		

	}

}
