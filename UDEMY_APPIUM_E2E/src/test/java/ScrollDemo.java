import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ScrollDemo extends AppiumFirstProgram {
	
	public static void main(String args[]) throws MalformedURLException, InterruptedException {

	AndroidDriver<AndroidElement> driver = androidCapabilities();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
	
	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));");
	
	}
	

}
