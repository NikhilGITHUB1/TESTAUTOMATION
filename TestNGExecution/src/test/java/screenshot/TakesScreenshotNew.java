package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakesScreenshotNew {

public WebDriver driver;	
	
public void capture() throws IOException {	
		
Date d=new Date();	
String filename=d.toString().replace(":","_").replace(" ", "_");
File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(screenshotFile,new File(".//screenshot//"+filename+".jpg" ));	
	
   }

}



