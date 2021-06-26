package ecommerce;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Ecommerce_AppiumFirstProgram {

	public static AndroidDriver<AndroidElement> androidCapabilities() throws MalformedURLException {
		
		
		File f = new File("apps");
		File fs = new File(f,"General-Store.apk");
		
		DesiredCapabilities  cap = new DesiredCapabilities();
		//cap.setCapability(MobileCapabilityType.DEVICE_NAME, "kanojiaAndroidpixel3");
		
		//configured the real device
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
	
		
//		cap.setCapability("autoGrantPermissions", true);
//		cap.setCapability("noReset", "false");
//		cap.setCapability("fullReset", "true");
		
	
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		return driver;

		

		
		
		
	}

}
