package webdriver_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomDemo {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/nikhilkanojia/Downloads/chromedriver 2");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://sandbox-sponsors.pointsville.com/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver; 
		
		WebElement username = (WebElement)js.executeScript("return document.querySelector('amplify-authenticator > amplify-sign-in').shadowRoot.querySelector('amplify-form-section > amplify-auth-fields').shadowRoot.querySelector('div > amplify-username-field').shadowRoot.querySelector('amplify-form-field').shadowRoot.querySelector('#username')");
		
		//pass user value in javascript
		String js1="arguments[0].setAttribute('value','Nikhil:best in the world')";
		
		((JavascriptExecutor)driver).executeScript(js1,username);
		
	}

}
