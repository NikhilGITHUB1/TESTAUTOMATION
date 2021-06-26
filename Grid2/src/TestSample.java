import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestSample {

	
@Parameters({"browser"})	
@Test
public void testLogin(String browser) throws MalformedURLException {
	
DesiredCapabilities cap=null;
System.out.println(browser);	
	
if(browser.equals("chrome")) {
cap=DesiredCapabilities.chrome();
cap.setBrowserName("chrome");
//cap.setCapability(CapabilityType.BROWSER_NAME, "IE");
cap.setPlatform(Platform.ANY);
}

else if	(browser.equals("firefox")) {
cap=DesiredCapabilities.firefox();
cap.setBrowserName("firefox");
//cap.setCapability(CapabilityType.BROWSER_NAME, "IE");
cap.setPlatform(Platform.ANY);
}

RemoteWebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
driver.get("http://www.gmail.com");
driver.findElement(By.id("identifierId")).sendKeys("test@gmail.com");
//driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("abcd");	

//Selenium Grid uses a hub-node concept where you only run the test on a single machine called a hub, 
//but the execution will be done by different machines called nodes. 

driver.quit();//to kill the session, this is mandatory
}

}
