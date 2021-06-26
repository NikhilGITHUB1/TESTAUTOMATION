package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import configfilereader.ConfigFileReader;
import context.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import managers.FileReaderManager;
import managers.PageObjectManager;
import managers.WebDriverManager;
import pageobjects.CartPage;
import pageobjects.CheckoutPage;
import pageobjects.HomePage;
import pageobjects.ProductListingPage;

public class HomePageSteps {
	
	TestContext testContext;
	HomePage homepage;
	WebDriver driver;	
	WebDriverManager webDriverManager;
	
	public HomePageSteps(TestContext context) {
		testContext=context;
		homepage = testContext.getPageObjectManager().getHomePage();
	}
	
	
		
	@Given("^user is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		
		//webDriverManager = new WebDriverManager();
		//driver=webDriverManager.getDriver();
		//driver.manage().window().maximize();
		//configFileReader = new ConfigFileReader();
		//driver.manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getConfigFileReader().getImplicitWait(), TimeUnit.SECONDS);
		homepage.navigateToHomePage();
		
		
		// driver.get(FileReaderManager.getInstance().getConfigFileReader().getApplicationUrl());
		
	}

	@When("^he search for \"([^\"]*)\"$")
	public void he_search_for_dress(String arg1) throws Throwable {
		
		//homepage = new HomePage(driver);
		System.out.println(arg1);
		homepage.performSearch(arg1);  
	}
	

}
