package managers;



import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import enums.DriverType;
import enums.EnvironmentType;


public class WebDriverManager {
	
WebDriver driver;
DriverType drivertype;
EnvironmentType environmentType;


public WebDriverManager() {
	
	drivertype=FileReaderManager.getInstance().getConfigFileReader().getBrowser();
	environmentType=FileReaderManager.getInstance().getConfigFileReader().getEnvironment();
}


public WebDriver getDriver() {
	if(driver==null)driver = createDriver();
	return driver;
}

public WebDriver createDriver() {
   switch(environmentType) {
	   case LOCAL : driver=createLocalDriver();
	   break;
	   case REMOTE : driver=createRemoteDriver();
	   break;
   }
   
  return driver;
   
}


private WebDriver createRemoteDriver() {
	
	throw new RuntimeException("RemoteWebDriver is not yet implemented");

}


private WebDriver createLocalDriver() {

	  switch(drivertype) {
	   case CHROME : driver=new ChromeDriver();
	   break;
	   case FIREFOX : driver=new FirefoxDriver();
	   break;
  }
  
 return driver;
	
}  


public void log_test_failure_and_take_screenshot(String testID,String stack_trace)  {

	try{

		//Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot =((TakesScreenshot)driver);

		//Call getScreenshotAs method to create image file
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

		String uniqueID = UUID.randomUUID().toString();


		//dynamic log file per failure (using dat/time)
		
		//String filePath = error_log_base_path + "test-failures/" + 
		//		operating_system + "-" + browser + "_" + uniqueID; 
		
		String filePath = "test-failures/" + "-"  + "_" + uniqueID; 
		

		String screenshotPath = filePath + "/" + "screenshot.png";

		File DestFile=new File(screenshotPath);
		

		//Copy file at destination
		FileUtils.copyFile(SrcFile, DestFile);
		
		System.out.println("==============================================");
		System.out.println("[Test ID]");
		System.out.println(testID);
		System.out.println("");
		System.out.println("[Failed URL]");	
		System.out.println(driver.getCurrentUrl());
		System.out.println("");		
		System.out.println("[Page Title]");	
		System.out.println(driver.getTitle());
		System.out.println("");					
		System.out.println("[Environment]");
		//System.out.println(operating_system + "_" + browser);
		System.out.println("");
		System.out.println("[Screenshot ands logs found here]");		
		System.out.println(filePath);
		System.out.println("");
		System.out.println("[Stack trace]");		
		System.out.println(stack_trace);	
		System.out.println("");


		//Output failed scenario name, URL + page title to text file next to screenshot
		File failed_scenario_details_file = new File(filePath + "/" + "failed_scenario_details.txt");

		FileWriter fw = new FileWriter(failed_scenario_details_file, false);

		try {
			fw.write("[Test ID]" + System.lineSeparator()  + testID + System.lineSeparator() + System.lineSeparator() +
					"[Failed URL]" + System.lineSeparator() + driver.getCurrentUrl() + System.lineSeparator() + System.lineSeparator() +
					"[Page Title]" + System.lineSeparator() + driver.getTitle() + System.lineSeparator() + System.lineSeparator() +
					"[Stack trace]" + System.lineSeparator() + stack_trace);

		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			fw.close();
		}	


	


	}catch(Throwable t){

		System.out.println("[Error when logging failure]" + t.getMessage()); 

	}

}		



}
