package stepdefinitions;

import org.testng.Assert;

import context.TestContext;
import cucumber.api.java.en.Then;
import enums.Context;
import pageobjects.ConfirmationPage;

public class ConfirmationPageSteps {
	
	TestContext testContext;
	ConfirmationPage confirmationpage;
	
	public ConfirmationPageSteps(TestContext context) {
		
		testContext=context;
		confirmationpage=testContext.getPageObjectManager().getConfirmationPage();
		
	}
	
	@Then("^verify the order details$")
	 public void verify_the_order_details(){
		String productname=(String) testContext.scenarioContext.getContext(Context.PRODUCT_NAME);
		Assert.assertTrue(confirmationpage.getProductNames().stream().filter(x -> x.contains(productname)).findFirst().get().length()>0);
	
	
	
	}
}
	
	


