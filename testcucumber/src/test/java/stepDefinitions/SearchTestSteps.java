package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.TestContext;
import cucumber.api.PendingException;
import cucumber.api.java.en.When;
import dataProvider.ConfigFileReader;
import dataProvider.FileReaderManager;
import manager.PageObjectManager;
import manager.WebDriverManager;
import pageobjects.HomePage;
import testDataTypes.PojoCustomer;



public class SearchTestSteps {
	
	TestContext testcontext;
    HomePage homepage;
    
    public SearchTestSteps(TestContext context) {// how this constructor gets called?
    	testcontext=context;
    	homepage=testcontext.getPageObjectManager().getHomePage();
    }
	
	
	@When("^he searches for \"([^\"]*)\"$")
	public void he_searches_for(String customerName) throws Throwable {
		PojoCustomer customer = FileReaderManager.getInstance().getJsonReader().getCustomerByName(customerName);
		//homepage.search_item(customer);	
		//homepage.search_item(product);
		homepage.fill_PersonalDetails(customer);
		homepage.search_item(customer.product);
		
			}	
	
}	
