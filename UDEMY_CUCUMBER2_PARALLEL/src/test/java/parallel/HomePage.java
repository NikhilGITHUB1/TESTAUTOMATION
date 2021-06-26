package parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public WebDriver driver;
	
	@FindBy(how=How.CSS, using = "input.search-keyword")
	public WebElement searchElement;
	
	@FindBy(how=How.CSS, using = "h4.product-name")
	public WebElement searchElementDisplayed;
	
	
	public HomePage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
//	public WebElement search() {
//		return searchElement;
//	}
//	
//	
	

}
