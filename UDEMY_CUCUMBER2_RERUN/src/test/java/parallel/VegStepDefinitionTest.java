package parallel;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class VegStepDefinitionTest {
	
	WebDriver driver;
	HomePage homepage;
	
	@Given("user is on the greekart landing page")
	public void user_is_on_the_greekart_landing_page() throws IOException {
		
		driver = Base.getDriver();
	    
	}

	@When("^user search for (.+) vegetables$")
	public void user_search_for_vegetables(String string) throws InterruptedException {
	    homepage = new HomePage(driver);
		homepage.searchElement.sendKeys(string);
		Thread.sleep(3000);
		
	   
	}

	@Then("^\"([^\"]*)\" results are displayed$")
	public void results_are_displayed(String string) {
		
		Assert.assertTrue(driver.findElement(By.cssSelector("h4.product-name")).getText().contains(string));

	}
	
	
	
	@When("added items to cart")
	public void added_items_to_cart() {
		
		driver.findElement(By.cssSelector("a.increment")).click();
		driver.findElement(By.xpath("//*[contains(text(),'ADD TO CART')]")).click();
	   
	}

	@When("user proceeds to checkout page for purchase")
	public void user_proceeds_to_checkout_page_for_purchase() throws InterruptedException {
		driver.findElement(By.cssSelector("a.cart-icon img")).click();
		driver.findElement(By.xpath("//*[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		Thread.sleep(3000);
		

	}

	@Then("^verify selected (.+) items are displayed in checkout page$")
	public void verify_selected_items_are_displayed_in_checkout_page(String string) {
		Assert.assertTrue(driver.findElement(By.cssSelector("p.product-name")).getText().contains(string));
		driver.findElement(By.xpath("//*[contains(text(),'Place Order')]")).click();
		
		


	}


}
