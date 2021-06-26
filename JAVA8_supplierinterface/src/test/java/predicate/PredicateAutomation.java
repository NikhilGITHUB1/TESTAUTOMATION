package predicate;

import java.io.IOException;
import java.util.List;
import java.util.function.Predicate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import supplier.DriverFactory;

public class PredicateAutomation {
	
private WebDriver driver;
	
	@BeforeTest
	@Parameters("browser")
	public void setDriver(@Optional("chrome") String browser) {
	
	//instead of calling if, else for different browser string and initializing the driver,
	//we will use the Supplier interface
	
	this.driver = DriverFactory.getDriver(browser);
		
	}
	
	@Test
	public void googleTest() throws IOException {
		
		this.driver.get("https://www.google.com");
		List<WebElement> elements = this.driver.findElements(By.tagName("a"));
		//using predicate 
		System.out.println("Before:"+elements.size());
		
		
		//removing blank
		//Predicate<WebElement> isBlank = (e) -> e.getText().trim().length() == 0;
		//elements.removeIf(isBlank);
		
		//removing S
		//Predicate<WebElement> isS= (e) -> e.getText().toLowerCase().contains("s");
		//elements.removeIf(isBlank.or(isS));
		
		Rules.get().forEach(rule -> elements.removeIf(rule));
		
		
		 // Rules.get().forEach(elements::removeIf); 
		
		//[ this is via method reference,we are having an object,
		// and passing that object to a method, hence method reference can be used here
		
		//above is : Rules.get returns a list
		//on that we are calling forEach method
		//forEach accepts a consumer
		//whatever we have added in the list, is a rule here which is "isBlank" and "hasS"
		//the rule is the predicate here and we are calling removeIf for the predicate as 
		//the removeIf method accepts a predicate.
		//elements is another list which we are calling removeIf , which accepts a predicate
		
		System.out.println("After:"+elements.size());
		
		//this.driver.findElements(By.tagName("a"));
		elements.forEach(e -> System.out.println(e.getText()));
		
		
	}

}
