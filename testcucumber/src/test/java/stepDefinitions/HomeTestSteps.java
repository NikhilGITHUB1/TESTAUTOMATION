package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import dataProvider.ConfigFileReader;
import manager.PageObjectManager;
import manager.WebDriverManager;
import pageobjects.HomePage;

public class HomeTestSteps {
	
    TestContext testcontext;
    HomePage homepage;
    
    public HomeTestSteps(TestContext context) {// how this constructor gets called?
    	testcontext=context;
    	homepage=testcontext.getPageObjectManager().getHomePage();
    }
	
	@Given("^user is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		homepage.navigateTo_HomePage(); 
	}

}
