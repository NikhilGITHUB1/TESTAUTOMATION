package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import context.TestContext;
import cucumber.api.java.en.When;
import managers.FileReaderManager;
import pageobjects.CheckoutPage;
import testdatatypes.Customer;

public class CheckoutPageSteps {
	
	WebDriver driver;	
	TestContext testContext;
	CheckoutPage checkoutPage;
	
	
	public CheckoutPageSteps(TestContext context) {
		testContext = context;
		checkoutPage = testContext.getPageObjectManager().getcheckoutPage();
	}
	
	


	@When("^enter \"([^\"]*)\" personal details on checkout page$")
	public void enter_personal_details_on_checkout_page(String customerName) throws Throwable {
		
		
		//checkoutPage=new CheckoutPage(driver);
		//checkoutPage.fillPersonalDetails();
		
		Customer customer=FileReaderManager.getInstance().jsonDataReader().getCustomerByName(customerName);
		checkoutPage.fillPersonalDetails(customer);
	}



	@When("^select payment method as “check” payment$")
	public void select_payment_method_as_check_payment() throws Throwable {
		
		WebElement payment_method=driver.findElement(By.xpath("//*[@id=\"payment\"]/ul/li/label"));
	    String text=payment_method.getText();
	    System.out.println(text);
	    
	}

	@When("^place the order$")
	public void place_the_order() throws Throwable {

		checkoutPage.placeOrder();
		
	  }
	

}
