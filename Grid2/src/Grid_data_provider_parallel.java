import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Grid_data_provider_parallel {
	
	ThreadLocal<WebDriver> dr=new ThreadLocal<WebDriver>();
	public WebDriver driver;
	
	public WebDriver getDriver() {
		return dr.get();
		
	}
	
	public void setWebDriver(WebDriver driver) {
		dr.set(driver);
	}
	
	
	ThreadLocal<DesiredCapabilities> dc=new ThreadLocal<DesiredCapabilities>();
	public DesiredCapabilities desiredcap;
	
	public DesiredCapabilities getDesiredCap() {
		return dc.get();
		
	}
	
	public void setDesiredCapabilities(DesiredCapabilities desiredcap) {
		dc.set(desiredcap);
	}
	
		
	
	
	@Test(dataProvider="appData")
	public void testLogin(String un,String browser) throws MalformedURLException {
		
	
	//DesiredCapabilities cap=null;
	System.out.println(browser);	
		
	if(browser.equals("chrome")) {
	desiredcap=new DesiredCapabilities();
	setDesiredCapabilities(desiredcap);
	
	getDesiredCap().setBrowserName("chrome");
	getDesiredCap().setPlatform(Platform.ANY);
	}

	else if	(browser.equals("firefox")) {
	desiredcap=new DesiredCapabilities();
	setDesiredCapabilities(desiredcap);	
	
	getDesiredCap().setBrowserName("firefox");
	getDesiredCap().setPlatform(Platform.ANY);
	}

	driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),getDesiredCap());
	setWebDriver(driver);
	getDriver().get("http://www.gmail.com");
	getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	getDriver().findElement(By.id("identifierId")).sendKeys(un);
	getDriver().findElement(By.xpath("//*[@id='identifierNext']/span/span")).click();
	//driver.findElement(By.id("password")).sendKeys(pwd);

	getDriver().quit();//to kill the session, this is mandatory	
	
	}
	
	
	//creating the data provider
	
	@DataProvider(parallel=true)
	public Object[][] appData(){
		
	Object[][] data=new Object[2][2];
	
	//1st row
	data[0][0]="kanojia.nikhil07@gmail.com";
	//data[0][1]="abc";
	data[0][1]="chrome";
	
	//2nd row
	data[1][0]="kanojia.nikhil07@gmail.com";
	//data[1][1]="xyz";
	data[1][1]="firefox";
		
	return data;	
	}
	
	
	
	
}
