package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ProductListingPage {
	
	public ProductListingPage(WebDriver driver) {
		//this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'noo-product-inner')]/h3/a")
	private List<WebElement> itemList;
	
	
	public void selectItem(int itemNumber) {
		//String s= itemList.get(itemNumber).findElement(By.xpath("//*[contains(@class,'noo-product-inner')]/h3/a")).getText();
		//System.out.println(s);
		itemList.get(itemNumber).click();
		//return s;
	}
	
	
	public String getProductName(int itemNumber) {
		return itemList.get(itemNumber).findElement(By.xpath("//*[@id=\"noo-site\"]//*/h3/a")).getText();
	}

}
