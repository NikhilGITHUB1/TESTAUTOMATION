package wait;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class Wait {
	
public static void untilJqueryIsDone(WebDriver driver) {
	
untilJqueryIsDone(driver,FileReaderManager.getInstance().getConfigFileReader().getImplicitWait());

}

private static void untilJqueryIsDone(WebDriver driver, long timeUnitInSeconds) {

	until(driver, (d) -> 
	
	{
		
		Boolean isPageLoaded = (Boolean)((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
		if(!isPageLoaded) System.out.println("loading in progress");
		return isPageLoaded;
		
		
		
	},timeUnitInSeconds);
	
			
		
	
}

@SuppressWarnings("deprecation")
private static void until(WebDriver driver,Function<WebDriver, Boolean > waitCondition, long timeUnitInSeconds) {
 
	WebDriverWait webdriverWait=new WebDriverWait(driver, timeUnitInSeconds);
	webdriverWait.withTimeout(timeUnitInSeconds, TimeUnit.SECONDS);
	try{
		webdriverWait.until(waitCondition);
	}catch (Exception e){
		System.out.println(e.getMessage());
	}         
	
}

}
