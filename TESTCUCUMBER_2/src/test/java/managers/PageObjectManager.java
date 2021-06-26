package managers;

import org.openqa.selenium.WebDriver;

import pageobjects.CartPage;
import pageobjects.CheckoutPage;
import pageobjects.ConfirmationPage;
import pageobjects.HomePage;
import pageobjects.ProductListingPage;

public class PageObjectManager {
	
WebDriver driver;
HomePage homepage;
CheckoutPage checkoutPage;
CartPage cartPage;
ProductListingPage productListingPage;
ConfirmationPage confirmationPage;

public PageObjectManager(WebDriver driver) {
this.driver=driver;
}

public HomePage getHomePage() {
	return (homepage==null) ? homepage = new HomePage(driver):homepage;
	
}


public CheckoutPage getcheckoutPage() {
	return (checkoutPage==null) ? checkoutPage = new CheckoutPage(driver):checkoutPage;
	
}


public CartPage getcartPage() {
	return (cartPage==null) ? cartPage = new CartPage(driver):cartPage;
	
}





public ProductListingPage getproductListingPage() {
	return (productListingPage==null) ? productListingPage = new ProductListingPage(driver):productListingPage;
	
}

public ConfirmationPage getConfirmationPage() {
return (confirmationPage == null) ? confirmationPage = new ConfirmationPage(driver) : confirmationPage;
}




}
