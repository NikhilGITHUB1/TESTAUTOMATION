import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;


public class Gestures extends AppiumFirstProgram {
	
	public static void main(String args[]) throws MalformedURLException, InterruptedException {

	AndroidDriver<AndroidElement> driver = androidCapabilities();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
	WebElement expandlist = driver.findElementByAndroidUIAutomator("text(\"Expandable Lists\")");
	
	TouchAction t = new TouchAction(driver);
	t.tap(tapOptions().withElement(element(expandlist))).perform();
	
	driver.findElementByAndroidUIAutomator("text(\"1. Custom Adapter\")").click();
	
	WebElement longPress= driver.findElementByAndroidUIAutomator("text(\"People Names\")");
	
	//WebElement longPress = driver.findElement(By.xpath("//android.widget.TextView[@text=Sample menu"));
	
	t.longPress(longPressOptions().withElement(element(longPress)).withDuration(ofSeconds(2))).release().perform();
	System.out.println(driver.findElement(By.id("android:id/title")).isDisplayed());
	
	
	

	
	
	
	
	}
	
}
