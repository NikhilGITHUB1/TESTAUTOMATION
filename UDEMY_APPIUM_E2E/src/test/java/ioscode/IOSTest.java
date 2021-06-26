package ioscode;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class IOSTest extends IOSDesiredCapabilities {
	
	public static void main(String[] args) throws MalformedURLException {
		
		IOSDriver<IOSElement> driver = iosCapabilities();
		driver.findElementByAccessibilityId("Alert Views").click();
		driver.findElement(By.xpath("//*[@value='Text Entry']")).click();
		driver.findElementByClassName("XCUIElementTypeTextField").sendKeys("nikhil");
		driver.findElementByName("OK").click();
		
		driver.navigate().back();
		
//		Dimension size = driver.manage().window().getSize();
//		int x = size.getWidth()/2;
//		int starty = (int)(size.getHeight()*0.60);
//		int endy = (int)(size.getHeight()*0.10);
//		
//		TouchAction actions = new TouchAction(driver);
//		actions.press(starty, endy).waitAction(Duration.ofSeconds(2)).moveTo(endX, endY).release().perform();

//		MobileElement topCharts = driver.findElement(MobileBy.xpath("//android.widget.TextView[@text = 'Top Charts']"));
//		Point point = topCharts.getLocation();
//		int startY = point.y;
//		int endY = point.y;
//
//		int startX = (int) ((driver.manage().window().getSize().getWidth()) * 0.80);
//		int endX = (int) ((driver.manage().window().getSize().getWidth()) * 0.20);
//
//		TouchAction actions = new TouchAction(driver);
//		actions.press(startX, startY).waitAction(Duration.ofSeconds(2)).moveTo(endX, endY).release().perform();
//		
		JavascriptExecutor js = (JavascriptExecutor) driver;

		HashMap scrollObject = new HashMap();

		scrollObject.put("direction", "down");

		js.executeScript("mobile: scroll", scrollObject);
		
		driver.findElementByAccessibilityId("Steppers").click();
         
		driver.findElement(By.name("Increment")).click();
		driver.findElement(By.name("Increment")).click();
		
		System.out.println(driver.findElementsByClassName("XCUIElementTypeStaticText").get(1).getText());
		driver.navigate().back();
		driver.findElementByAccessibilityId("Picker View").click();
		driver.findElementByAccessibilityId("Green color component value").sendKeys("200");
		driver.findElementsByClassName("XCUIElementTypePickerWheel").get(0).sendKeys("55");


		
		
		
		
	}
	
	

}
