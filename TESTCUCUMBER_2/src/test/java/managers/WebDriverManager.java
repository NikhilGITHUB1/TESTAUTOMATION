package managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import enums.DriverType;
import enums.EnvironmentType;

public class WebDriverManager {
	
WebDriver driver;
DriverType drivertype;
EnvironmentType environmentType;


public WebDriverManager() {
	
	drivertype=FileReaderManager.getInstance().getConfigFileReader().getBrowser();
	environmentType=FileReaderManager.getInstance().getConfigFileReader().getEnvironment();
}


public WebDriver getDriver() {
	if(driver==null)driver = createDriver();
	return driver;
}

public WebDriver createDriver() {
   switch(environmentType) {
	   case LOCAL : driver=createLocalDriver();
	   break;
	   case REMOTE : driver=createRemoteDriver();
	   break;
   }
   
  return driver;
   
}


private WebDriver createRemoteDriver() {
	
	throw new RuntimeException("RemoteWebDriver is not yet implemented");

}


private WebDriver createLocalDriver() {

	  switch(drivertype) {
	   case CHROME : 
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver");
            driver=new ChromeDriver();
	   break;
	   case FIREFOX : driver=new FirefoxDriver();
	   break;
  }
  
 return driver;
	
}  
}
