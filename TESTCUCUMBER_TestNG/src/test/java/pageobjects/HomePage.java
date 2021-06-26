package pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import managers.FileReaderManager;

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void performSearch(String arg1) {
		driver.manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getConfigFileReader().getImplicitWait(), TimeUnit.SECONDS);
		driver.navigate().to(FileReaderManager.getInstance().getConfigFileReader().getApplicationUrl()+ "?s=" + arg1 + "&post_type=product");
	}
	
	public void navigateToHomePage() {
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getConfigFileReader().getImplicitWait(), TimeUnit.SECONDS);
	   driver.get(FileReaderManager.getInstance().getConfigFileReader().getApplicationUrl());
	}
	

}
