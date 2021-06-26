package ecommerce;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import java.net.MalformedURLException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import junit.framework.Assert;

public class Ecommerce_tc5 extends Ecommerce_AppiumFirstProgram{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		AndroidDriver<AndroidElement> driver = androidCapabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.findElementById("com.androidsample.generalstore:id/spinnerCountry").click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Afghanistan\"));").click();
		driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("nikhil");

		driver.findElementById("com.androidsample.generalstore:id/radioFemale").click();
		driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
		
		//driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(new UiSelector().textMatches(\"Jordan 6 Rings\").instance(0))"));
		
		
		int count = driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).size();
		
		for(int i=0;i<count;i++) {
			
			//String text = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
			driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
		}
		
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
		Thread.sleep(2000);
		
		Set<String> contexts = driver.getContextHandles();
		
		for(String contextNames : contexts) {
			System.out.println(contextNames);
		}
		
		//move to web context
		driver.context("WEBVIEW_com.androidsample.generalstore");
		//here after you can use selenium to deal with webpages objects
		driver.context("NATIVE_APP");
		
		
		
//		
//		
		
		
		
		
		
		

	}

}
