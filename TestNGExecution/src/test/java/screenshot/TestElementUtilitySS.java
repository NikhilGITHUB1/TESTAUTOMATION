package screenshot;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestElementUtilitySS {
	
	public WebDriver driver;	
	
	public void capture() throws IOException {	
			
	Date d=new Date();	
	String filename=d.toString().replace(":","_").replace(" ", "_");
	WebElement element=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/header/div[2]/div/div[1]/a/img"));
	File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	BufferedImage img=ImageIO.read(screenshot);
	Point p=element.getLocation();
	int height=element.getSize().getHeight();
	int width=element.getSize().getWidth();
	
	BufferedImage eleScreenshot=img.getSubimage(p.getX(),p.getY(),height, width);
	ImageIO.write(eleScreenshot, ".jpg", screenshot);
	
	FileUtils.copyFile(screenshot,new File(".//screenshot//"+filename+".jpg" ));		
		
	   }	
	

}
