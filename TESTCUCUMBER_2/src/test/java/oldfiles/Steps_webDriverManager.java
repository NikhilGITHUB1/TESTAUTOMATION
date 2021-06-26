package oldfiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import configfilereader.ConfigFileReader;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import managers.FileReaderManager;
import managers.PageObjectManager;
import managers.WebDriverManager;
import pageobjects.CartPage;
import pageobjects.CheckoutPage;
import pageobjects.HomePage;
import pageobjects.ProductListingPage;

public class Steps_webDriverManager {

WebDriver driver;	
HomePage homepage;
ProductListingPage productListingPage;
CartPage cartPage;
CheckoutPage checkoutPage;
PageObjectManager pageObjectManager;
ConfigFileReader configFileReader;
FileReaderManager fileReaderManager;
WebDriverManager webDriverManager;
	
@Given("^user is on Home Page$")
public void user_is_on_Home_Page() throws Throwable {
    
	
	webDriverManager = new WebDriverManager();
	driver=webDriverManager.getDriver();
	driver.manage().window().maximize();
	configFileReader = new ConfigFileReader();
	driver.manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getConfigFileReader().getImplicitWait(), TimeUnit.SECONDS);
	driver.get(FileReaderManager.getInstance().getConfigFileReader().getApplicationUrl());
	pageObjectManager = new PageObjectManager(driver);
	
}

@When("^he search for \"([^\"]*)\"$")
public void he_search_for_dress(String arg1) throws Throwable {
	
	//homepage = new HomePage(driver);
	pageObjectManager.getHomePage().performSearch(arg1);  
}


@When("^choose to buy the first item$")
public void choose_to_buy_the_first_item() throws Throwable {
	
	//productListingPage = new ProductListingPage(driver);	
	pageObjectManager.getproductListingPage().selectItem(0);
    
}

@When("^moves to checkout from mini cart$")
public void moves_to_checkout_from_mini_cart() throws Throwable {
	
	//cartPage = new CartPage(driver);
	cartPage=pageObjectManager.getcartPage();
	
	cartPage.chooseColor();
    cartPage.chooseSize();
    cartPage.addToCart();
    cartPage.viewCart();
    cartPage.checkOut();	
	
}


@When("^enter personal details on checkout page$")
public void enter_personal_details_on_checkout_page() throws Throwable {
	
	
	//checkoutPage=new CheckoutPage(driver);
	pageObjectManager.getcheckoutPage().fillPersonalDetails();
    	
}



@When("^select payment method as “check” payment$")
public void select_payment_method_as_check_payment() throws Throwable {
	
	WebElement payment_method=driver.findElement(By.xpath("//*[@id=\"payment\"]/ul/li/label"));
    String text=payment_method.getText();
    System.out.println(text);
    
}

@When("^place the order$")
public void place_the_order() throws Throwable {

	pageObjectManager.getcheckoutPage().placeOrder();
	
  }
	
}
