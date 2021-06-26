package stepdefinition;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

//@RunWith(Cucumber.class) - this is not required
public class StepDefinition {
	public static WebDriver driver;
	
	@Given("^the browser is opened$")
    public void the_browser_is_opened() throws Throwable {
		

		System.setProperty("webdriver.chrome.driver", "/Users/nikhilkanojia/Downloads/chromedriver 2");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
    }

    @When("^values are entered in the browser$")
    public void values_are_entered_in_the_browser() throws Throwable {
    	driver.findElement(By.name("q")).sendKeys("hello");
    	
    }

    @Then("^search button is clicked$")
    public void search_button_is_clicked() throws Throwable {
    	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    	driver.quit();
    }

	
	   @Given("^user is on the Netbanking login page$")
	    public void user_is_on_the_netbanking_login_page() throws Throwable {
		   System.out.println("i am on the logon page");
	   }

	    @When("^user login into application with username and password$")
	    public void user_login_into_application_with_username_and_password() throws Throwable {
	    	System.out.println("i enter un and pwd");
	    }

	    @Then("^Home page is populated$")
	    public void home_page_is_populated() throws Throwable {
	    	System.out.println("homepage is populated");
	    }
	    
	    @Then("^Home page is populateds$")
	    public void home_page_is_populateds() throws Throwable {
	    	System.out.println("homepage is populated");
	    }

	    @And("^Cards are displayed$")
	    public void cards_are_displayed() throws Throwable {
	    	System.out.println("cards are displayed");
	    }
	    
	    @When("user login into application with username {string} and password {string}")
	    public void user_login_into_application_with_username_and_password(String username, String password) {
	    	System.out.println(username);
	    	System.out.println(password);
	    
	    }
	    
	    
	    @Then("Cards displayed are {string}")
	    public void cards_displayed_are(String cardstatus) {
	    	System.out.println(cardstatus);
	    }
	    
	    
	    @When("user signs up with following details")
	    public void user_signs_up_with_following_details(DataTable data) {
	    	List<List<String>> obj = data.asLists();
            
	    	for(int i=0; i<obj.size(); i++) { //i starts from 1 because i=0 represents the header
	    		int size1= obj.get(0).size();
	    		
	    		for(int j=0;j<size1;j++) {
	    		
	    		System.out.println(obj.get(i).get(j)); 
	    		//System.out.println(obj.get(i).get(1));
	    		}
	    	}
	    	}
	    	
	
	    @When("^user login into application with user (.+) and pass (.+)$")
	    public void user_login_into_application_with_user_and_pass(String username, String password) throws Throwable {
	    	System.out.println(username);
	    	System.out.println(password);
	    
	    }
	    
	    @Given("^validate the browser$")
	    public void validate_the_browser() throws Throwable {
	    	System.out.println("validate the browser");
	    	
	    }

	    @When("^browser is triggered$")
	    public void browser_is_triggered() throws Throwable {
	    	System.out.println("trigger the browser");
	    }

	    @Then("^check if browser is started$")
	    public void check_if_browser_is_started() throws Throwable {
	    	System.out.println("check if the browser is started");
	    }
	    
	    
	    @Then("the datatable is fetched as maps")
	    public void the_datatable_is_fetched_as_maps(DataTable dataTable) {
	    	
	    	List<Map<String,String>> list = dataTable.asMaps();
	    	System.out.println(list);
	    	
	    	for(Map<String,String> e : list) {
	    		System.out.println(e.get("name"));
	    	}
	    	
	        // Write code here that turns the phrase above into concrete actions
	        // For automatic transformation, change DataTable to one of
	        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	        // Double, Byte, Short, Long, BigInteger or BigDecimal.
	        //
	        // For other transformations you can register a DataTableType.
	        
	    }

	 
	    }


