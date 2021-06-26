package pageobjectframework;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumFirstProgram {

	public static AndroidDriver<AndroidElement> androidCapabilities(String appName) throws IOException {
		
		FileInputStream fis = new FileInputStream("/Users/nikhilkanojia/seleniumProject/UDEMY_APPIUM_E2E/global.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		
		
		File f = new File("apps");
		File fs = new File(f,prop.getProperty(appName));
		
		String deviceName = prop.getProperty("DeviceName");
		
		DesiredCapabilities  cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
		
		//configured the real device
		//cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
	
		
		cap.setCapability("autoGrantPermissions", true);
		cap.setCapability("noReset", "false");
		cap.setCapability("fullReset", "true");
		
	
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		return driver;

		

		
		
		
	}

}
