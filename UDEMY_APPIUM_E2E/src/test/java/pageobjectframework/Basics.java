package pageobjectframework;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Basics extends AppiumFirstProgram {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		AndroidDriver<AndroidElement> driver = androidCapabilities("GeneralStoreApp");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		HomePage h = new HomePage(driver);
		Preferences p = new Preferences(driver);
		
		h.preferences.click();
		p.preferencesDependencies.click();
		
		//driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();
		//driver.findElement(By.xpath("//android.widget.TextView[@text='3. Preference dependencies']")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		driver.findElement(By.className("android.widget.EditText")).sendKeys("hello");
		//using findelements
		//driver.findElements(By.className("android.widget.Button")).get(1).click();
		p.buttons.get(1).click();
		
		
	}

	

}
