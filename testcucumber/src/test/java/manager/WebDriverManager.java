package manager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import dataProvider.FileReaderManager;
import enums.DriverType;
import enums.EnvironmentType;

public class WebDriverManager {
	
	private WebDriver driver;
	private static DriverType drivertype;
	private static EnvironmentType environmenttype;
	 
	public WebDriverManager() {
	   drivertype= FileReaderManager.getInstance().getConfigFileReader().getBrowser();
	   environmenttype=FileReaderManager.getInstance().getConfigFileReader().getEnvironment();
	}
	
	public WebDriver getDriver() {
		if(driver==null) driver=createDriver(); 
		return driver;
	}

	private WebDriver createDriver() {
		switch(environmenttype) {
		case LOCAL:
			driver=createLocalDriver();
		break;	
		case REMOTE:
			driver=createRemoteDriver();
		break;	
		}
		return driver;
	}

	private WebDriver createRemoteDriver() {
		throw new RuntimeException("RemoteDriver is not yet implemented");
	}

	private WebDriver createLocalDriver() {
		switch(drivertype) {
		case FIREFOX:
			driver=new FirefoxDriver();
		break;	
		case CHROME:
			driver=new ChromeDriver();
		break;	
		}

	
	 if(FileReaderManager.getInstance().getConfigFileReader().getBrowserWindowSize()) driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getConfigFileReader().getImplicitlyWait(), TimeUnit.SECONDS);
     return driver;
} 

public void closeDriver() {
driver.close();
driver.quit();
}

public void quitDriver() {
driver.quit();
	
}


}
