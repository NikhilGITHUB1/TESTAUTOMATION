package selenium;

import java.util.function.Function;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import dataProvider.FileReaderManager;

public class Wait {

	public static void untilPageLoadComplete(WebDriver driver) {
		untilPageLoadComplete(driver,FileReaderManager.getInstance().getConfigFileReader().getImplicitlyWait());	
	}

	private static void untilPageLoadComplete(WebDriver driver, long timeoutInSeconds) {
		until(driver, (d) ->
		{
			Boolean isPageLoaded = (Boolean)((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
			if (!isPageLoaded) System.out.println("Document is loading");
			return isPageLoaded;
		}, timeoutInSeconds);
}

	private static void until(WebDriver driver, Function<WebDriver,Boolean> waitCondition, long timeoutInSeconds) {
		until(driver, waitCondition, FileReaderManager.getInstance().getConfigFileReader().getImplicitlyWait());	
	}
	
	private static void until(WebDriver driver, Function<WebDriver, Boolean> waitCondition, Long timeoutInSeconds) throws InterruptedException{
		WebDriverWait webDriverWait = new WebDriverWait(driver, timeoutInSeconds);
		webDriverWait.wait(timeoutInSeconds);
		try{
			webDriverWait.until(waitCondition);
		}catch (Exception e){
			System.out.println(e.getMessage());
		}          
	}

}
