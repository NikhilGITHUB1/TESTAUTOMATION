package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


import testdatatypes.Customer;
import wait.Wait;

public class CheckoutPage extends HomePage{
	
	
	
	public CheckoutPage(WebDriver driver) {
        super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(how=How.XPATH,using="//*[@id='billing_first_name']")
	private WebElement firstname;
	
	@FindBy(how=How.XPATH,using="//*[@id='billing_last_name']")
	private WebElement lastname;
	
	@FindBy(how=How.XPATH,using="//*[@id='billing_address_1']")
	private WebElement billingAddress;
	
	@FindBy(how=How.XPATH,using="//*[@id='billing_city']")
	private WebElement billingCity;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"select2-billing_state-container\"]")
	private WebElement drpdown_clickBillingState;
	
	@FindBy(how=How.XPATH,using="//*[@class=\"select2-results__option\"]")
	private List<WebElement> billingState_list;
	
	@FindBy(how=How.ID,using="billing_postcode")
	private WebElement billing_postcode;
	
	@FindBy(how=How.ID,using="billing_phone")
	private WebElement billing_phone;
	
	@FindBy(how=How.ID,using="billing_email")
	private WebElement billing_email;
	
	@FindBy(how=How.ID,using="terms")
	private WebElement terms;
	
	@FindBy(how=How.ID,using="place_order")
	private WebElement place_order;
	
	
	public void firstName(String name) {
		firstname.sendKeys(name);
	}
	
	public void lastName(String name) {
		lastname.sendKeys(name);
	}
	
	public void billingAddress(String address) {
		billingAddress.sendKeys(address);
	}
	
	
	public void billingCity(String city) {
		billingCity.sendKeys(city);
	}
	
	
	public void billingPostalCode(String postalcode) {
		billing_postcode.sendKeys(postalcode);
	}
	
	public void billingPhone(String phone) {
		billing_phone.sendKeys(phone);
	}
	
	
	public void billingEmail(String email) {
		billing_email.sendKeys(email);
	}
	
	
	public void selectState(String stateName) throws InterruptedException {
		drpdown_clickBillingState.click();
		
		for(WebElement state:billingState_list) {
			if(state.getText().equals(stateName)) {
				state.click();
				 Wait.untilJqueryIsDone(driver);
				break;
				
			}
		}
		
	}
	
	
	public void placeOrder() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("document.getElementById('terms').click();");
		
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("document.getElementById('place_order').click();");
		
	}
	
	
	public void fillPersonalDetails(Customer customer) throws InterruptedException {
		firstName(customer.firstName);
		lastName(customer.lastName);
	
		
		billingAddress(customer.address.streetAddress);
		billingCity(customer.address.city);
		Thread.sleep(2000);
	  
		
		selectState(customer.address.state);
		billingPostalCode(customer.address.postCode);
		billingPhone(customer.phoneNumber.home);
		billingEmail(customer.emailAddress);
		
		
	}
	

}
