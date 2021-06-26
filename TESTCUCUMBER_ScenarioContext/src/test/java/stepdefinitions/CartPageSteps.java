package stepdefinitions;


import context.TestContext;
import cucumber.api.java.en.When;

import pageobjects.CartPage;

public class CartPageSteps {
	
	TestContext testContext;
	CartPage cartPage;
	
	
	public CartPageSteps(TestContext context) {
		testContext = context;
		cartPage = testContext.getPageObjectManager().getcartPage();
	}
	
	
	
	@When("^moves to checkout from mini cart$")
	public void moves_to_checkout_from_mini_cart() throws Throwable {
		
		//cartPage = new CartPage(driver);
		//cartPage=pageObjectManager.getcartPage();
		
		cartPage.chooseColor();
	    cartPage.chooseSize();
	    cartPage.addToCart();
	    cartPage.viewCart();
	    cartPage.checkOut();	
		
	}

}
