package ioscode;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class SafariTest {
	
	IOSDriver<IOSElement> driver;

	
	@Test
	public void browser() throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 8");
		dc.setCapability(MobileCapabilityType.BROWSER_NAME, "safari");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);

		IOSDriver<IOSElement> driver=new IOSDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),dc);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.gmail.com");
		//Thread.sleep(5000);
		//get the object from chrome browser itself by inspecting it
		driver.findElement(By.id("identifierId")).sendKeys("nikhil");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[2]")).click();

		driver.findElement(By.name("password")).sendKeys("kanojia");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[2]")).click();
		

		
		
	}
	

}
