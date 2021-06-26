import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
//import io.appium.java_client.android.Andro
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Miscellaneaous extends AppiumFirstProgram {
	
	public static void main(String args[]) throws MalformedURLException, InterruptedException {

	AndroidDriver<AndroidElement> driver = androidCapabilities();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	System.out.println(driver.currentActivity());
	System.out.println(driver.getContext());
	System.out.println(driver.isDeviceLocked());
	
	
	
	driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
	driver.pressKey(new KeyEvent(AndroidKey.HOME));
	
	
	}

}
