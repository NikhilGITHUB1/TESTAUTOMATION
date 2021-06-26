package screenshot;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckScreenshot extends TakesScreenshotNew{

@Test	
public void chkscreenshot() throws IOException {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.google.com");
	capture();
}

}
