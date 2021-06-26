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
import java.util.function.Consumer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import supplier.DriverFactory;

public class Tested {
	

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
		
		
		BufferedReader reader = null;
	    reader = new BufferedReader(new FileReader("/Users/nikhilkanojia/seleniumProject/JAVA8_supplierinterface/src/test/java/properties/test.properties"));
		Properties p=new Properties();
		p.load(reader);
		
		List<Properties> ls = new ArrayList<>();
		ls.add(p);
		
		
		Consumer<Properties> property = (s) -> this.driver.get(s.getProperty("url"));
		
		
		Map<String,Consumer<Properties>> map = new HashMap<>();
		map.put("property_url", property);
		
		ls.forEach(map.get("property_url"));
	
	
		
		
	}

		
}
	
			
		

		
		
	
	
	

