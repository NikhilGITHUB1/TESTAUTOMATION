import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class SwipeDemo extends AppiumFirstProgram {
	
	public static void main(String args[]) throws MalformedURLException, InterruptedException {

	AndroidDriver<AndroidElement> driver = androidCapabilities();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
	driver.findElementByAndroidUIAutomator("text(\"Date Widgets\")").click();
	driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
	driver.findElement(By.xpath("//*[@content-desc='9']")).click();
	TouchAction t = new TouchAction(driver);
	
	WebElement first = driver.findElement(By.xpath("//*[@content-desc='15']"));
	WebElement second = driver.findElement(By.xpath("//*[@content-desc='45']"));
	
	t.longPress(longPressOptions().withElement(element(first)).withDuration(ofSeconds(2))).moveTo(element(second)).release().perform();

	
	
	


}
}