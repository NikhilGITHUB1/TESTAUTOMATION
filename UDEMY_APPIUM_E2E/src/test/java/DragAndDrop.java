import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.offset.ElementOption.element;



public class DragAndDrop extends AppiumFirstProgram {
	
	public static void main(String args[]) throws MalformedURLException, InterruptedException {

	AndroidDriver<AndroidElement> driver = androidCapabilities();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	TouchAction t = new TouchAction(driver);
	
	driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
	driver.findElementByAndroidUIAutomator("text(\"Drag and Drop\")").click();
	WebElement source = driver.findElementsByClassName("android.view.View").get(0);
	WebElement destination = driver.findElementsByClassName("android.view.View").get(1);
	
	t.longPress(element(source)).moveTo(element(destination)).release().perform();
	
	

	

}
}