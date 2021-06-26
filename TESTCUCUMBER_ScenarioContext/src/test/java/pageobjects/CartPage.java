package pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CartPage{

	public CartPage(WebDriver driver) {
		//super(driver);
		//this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(how=How.ID,using="pa_color")
	private WebElement color;
	
	@FindBy(how=How.ID,using="pa_size")
	private WebElement size;
	
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'product-')]//*[@type='submit']")
	private WebElement addToCart;
	
	@FindBy(how=How.XPATH,using="//*[@class=\"woocommerce-message\"]//*[contains(@href,'shop.demoqa.com/cart/')]")
	private WebElement viewCart;
	
	@FindBy(how=How.XPATH,using="//*[@id='post-6']//*[contains(@class,'checkout-button')]")
	private WebElement checkOut;
	
	
	public void chooseColor() {
		Select select=new Select(color);
		List<WebElement> options=select.getOptions();
		options.get(1).click();
	}
	
	
	public void chooseSize() {
		Select selectsize=new Select(size);
		List<WebElement> options1=selectsize.getOptions();
		options1.get(1).click();
	}
	
	public void addToCart() {
		addToCart.click();
	}
	
	public void viewCart() {
		viewCart.click();
	}
	
	public void checkOut() {
		checkOut.click();
	}
	
}
