package supplier;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
	
	private static final Supplier<WebDriver> chromesupplier = () -> {
		
		System.setProperty("webdriver.chrome.driver", "/Users/nikhilkanojia/Downloads/chromedriver 7");
		return new ChromeDriver();	
	};
	
	//similarly do it for FF
	
	private static final Map<String,Supplier<WebDriver>> MAP = new HashMap<>();
	
static {
		MAP.put("chrome", chromesupplier);
	}


	public static WebDriver getDriver(String browser) {
		return MAP.get(browser).get();
		
	}

}
