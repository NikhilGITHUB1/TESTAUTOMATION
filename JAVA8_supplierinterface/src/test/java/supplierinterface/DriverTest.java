package supplierinterface;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import supplier.DriverFactory;
import java.util.function.Consumer;


public class DriverTest {

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
		//using consumer 
		this.driver.findElements(By.tagName("a"))
		.forEach(e -> System.out.println(e.getText()));
		
		
	}
	
	
}
