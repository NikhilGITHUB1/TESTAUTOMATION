package pageobjects;

import org.openqa.selenium.WebDriver;
import selenium.Wait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import testDataTypes.PojoCustomer;

public class HomePage {
	
	public WebDriver driver;	
	
	@FindBy(how=How.XPATH,using="//*[@id=\"noo-site\"]/header/div[2]/div/div/div/a")
    private WebElement search;

	public HomePage(WebDriver driver) {
		
	this.driver=driver;
	PageFactory.initElements(driver,this);	

   }
	
	public void search_item(String product) {
		driver.navigate().to("http://shop.demoqa.com/?s=" + product + "&post_type=product");
		
		
	}
	
	 public void navigateTo_HomePage() {
		 driver.get("http://www.shop.demoqa.com");

		 }
	 
	 public void fill_PersonalDetails(PojoCustomer customer) {
		 search_item(customer.product);
			//Wait.untilPageLoadComplete(driver);

		 
		 }
	 
	 
}	
	
