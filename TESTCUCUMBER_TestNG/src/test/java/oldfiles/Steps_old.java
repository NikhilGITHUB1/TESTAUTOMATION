package oldfiles;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Steps_old {

WebDriver driver;	
	
@Given("^user is on Home Page$")
public void user_is_on_Home_Page() throws Throwable {
    
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://www.shop.demoqa.com");
}

@When("^he search for \"([^\"]*)\"$")
public void he_search_for_dress(String arg1) throws Throwable {
	 driver.navigate().to("http://shop.demoqa.com/?s=" + arg1 + "&post_type=product");
     	
    
}


@When("^choose to buy the first item$")
public void choose_to_buy_the_first_item() throws Throwable {
	
	 List<WebElement> items = driver.findElements(By.xpath("//*[contains(@class,'noo-product-inner')]/h3/a"));
	 
	 System.out.println(items.get(0).getText());
	 items.get(0).click();
    
}

@When("^moves to checkout from mini cart$")
public void moves_to_checkout_from_mini_cart() throws Throwable {
    
	WebElement color = driver.findElement(By.id("pa_color"));
	Select select=new Select(color);
	List<WebElement> options=select.getOptions();
	options.get(1).click();
	
	WebElement size = driver.findElement(By.id("pa_size"));
	Select selectsize=new Select(size);
	List<WebElement> options1=selectsize.getOptions();
	options1.get(1).click();
	
	WebElement addtocart=driver.findElement(By.xpath("//*[contains(@id,'product-')]//*[@type='submit']"));
	addtocart.click();
	
	WebElement viewcart=driver.findElement(By.xpath("//*[@class=\"woocommerce-message\"]//*[contains(@href,'shop.demoqa.com/cart/')]"));
	viewcart.click();
	
	
	WebElement checkout=driver.findElement(By.xpath("//*[@id='post-6']//*[contains(@class,'checkout-button')]"));
	checkout.click();
	
	
	
	
}


@When("^enter personal details on checkout page$")
public void enter_personal_details_on_checkout_page() throws Throwable {
	
  driver.findElement(By.xpath("//*[@id=\"billing_first_name\"]")).sendKeys("test");
  driver.findElement(By.xpath("//*[@id=\"billing_last_name\"]")).sendKeys("test");
  driver.findElement(By.xpath("//*[@id=\"billing_address_1\"]")).sendKeys("afsal nivas");
  driver.findElement(By.xpath("//*[@id=\"billing_city\"]")).sendKeys("kolkata");
  driver.findElement(By.xpath("//*[@id=\"select2-billing_state-container\"]")).click();
  
  List<WebElement> ls=driver.findElements(By.xpath("//*[@class=\"select2-results__option\"]"));
  for(int i=0;i<ls.size();i++) {
	  if(ls.get(i).getText().equals("Pondicherry (Puducherry)")){
		  ls.get(i).click();
	  }
  }
    	
}



@When("^select same delivery address$")
public void select_same_delivery_address() throws Throwable {

	  driver.findElement(By.xpath("//*[@id=\"billing_postcode\"]")).sendKeys("711202");
	  driver.findElement(By.xpath("	//*[@id=\"billing_phone\"]")).sendKeys("787877822");
	  
	  String xpath="//*[@id='billing_email']";
	  
	  
	  WebElement w=driver.findElement(By.xpath(xpath));
	  w.sendKeys("test@test.com");
	  
	  //driver.findElement(By.xpath("//*[@id=\"order_comments\"]")).sendKeys("hello");
	
}

@When("^select payment method as “check” payment$")
public void select_payment_method_as_check_payment() throws Throwable {
	
	WebElement payment_method=driver.findElement(By.xpath("//*[@id=\"payment\"]/ul/li/label"));
    String text=payment_method.getText();
    System.out.println(text);
    
}

@When("^place the order$")
public void place_the_order() throws Throwable {

	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("document.getElementById('terms').click();");
	
	
	JavascriptExecutor jse1 = (JavascriptExecutor)driver;
	jse1.executeScript("document.getElementById('place_order').click();");	

  }
	
}
