package ioscode;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class IOSDesiredCapabilities {
	
	IOSDriver<IOSElement> driver;

	public static  IOSDriver<IOSElement> iosCapabilities() throws MalformedURLException {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 8");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
		
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
		dc.setCapability(MobileCapabilityType.APP, "/Users/nikhilkanojia/Downloads/UICatalog.app");
		
		IOSDriver<IOSElement> driver=new IOSDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),dc);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        		
		return driver;
		
	}
	
}
