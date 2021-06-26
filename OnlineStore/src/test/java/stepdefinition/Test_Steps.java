package stepdefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Steps {
	
private static WebDriver driver=null;

	
@Given("^User is on Home Page$")
public void user_is_on_Home_Page()  {

	driver = new ChromeDriver();
	 
    //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception

    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    //Launch the Online Store Website

    driver.get("http://www.store.demoqa.com");

}

@When("^User Navigates to the \"([^\"]*)\" Page$")
public void user_Navigates_to_the_Cart_Page(String cart) throws Throwable {
     System.out.println("this is "+cart+" page");
	 driver.findElement(By.xpath("//*[@id=\"nav-menu-item-cart\"]/a/span/i")).click();
     driver.findElement(By.xpath("//*[contains(text(),'Your cart is currently empty')]"));
	
}

@When("^User returns to shop$")
public void user_returns_to_shop() throws Throwable {
   
    driver.findElement(By.xpath("//*[contains(text(),'Return to shop')]")).click();
	
	
}


@Then("^User is on the Home Page$")
public void user_is_on_the_Home_Page() throws Throwable {
    driver.quit();
}

@When("^User Navigates to the Specific Page$")
public void user_Navigates_to_the_Specific_Page(DataTable usercredentials) throws Throwable {
	List<List<String>> data = usercredentials.raw();
	System.out.println(data.get(0).get(0));
	driver.findElement(By.xpath("//*[@id=\"nav-menu-item-cart\"]/a/span/i")).click();
    driver.findElement(By.xpath("//*[contains(text(),'Your cart is currently empty')]"));
   
}

@When("^User Navigates to the Specific Page via maps$")
public void user_Navigates_to_the_Specific_Page_via_maps(List<Specificpages> specificpages) throws Throwable {
	
	//write the code to handle datatable
	for(Specificpages pages:specificpages) {
		System.out.println(pages.getPagename());
	}
	
	driver.findElement(By.xpath("//*[@id=\"nav-menu-item-cart\"]/a/span/i")).click();
    driver.findElement(By.xpath("//*[contains(text(),'Your cart is currently empty')]"));
    
}




}
