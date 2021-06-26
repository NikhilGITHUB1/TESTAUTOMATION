package stepdefinitions;




import context.TestContext;
import cucumber.api.java.en.When;
import enums.Context;
import pageobjects.ProductListingPage;

public class ProductPageSteps {
	
	TestContext testContext;
	ProductListingPage productListingPage;
	
	
	public ProductPageSteps(TestContext context) {
		testContext = context;
		productListingPage = testContext.getPageObjectManager().getproductListingPage();
	}

	
	
	@When("^choose to buy the first item$")
	public void choose_to_buy_the_first_item() throws Throwable {
		
		productListingPage.selectItem(0);
		
		//productListingPage = new ProductListingPage(driver);	
		
		//String s=productListingPage.selectItem(0);
		//System.out.println(s);
		//testContext.getScenarioContext().setContext(Context.PRODUCT_NAME,s);
		
		

		
	}

}
