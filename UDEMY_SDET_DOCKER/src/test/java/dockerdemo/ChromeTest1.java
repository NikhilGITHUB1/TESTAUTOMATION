package dockerdemo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import dockerusingbat.DockerEnd;
import dockerusingbat.DockerStart;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ChromeTest1 {
	
@BeforeTest
public void before() throws IOException, InterruptedException {
	
	
    File f = new File("output.txt");
		if(f.delete()) {
			System.out.println("file deleted successfully");
		}
		
	DockerStart start = new DockerStart();
	start.startDocker();
	
}

@AfterTest
public void after() throws IOException, InterruptedException {
	
	DockerEnd end = new DockerEnd();
    end.endDocker();
	
}
	

@Test	
public void test1() throws MalformedURLException{
		
		URL url = new URL("http://localhost:4444/wd/hub");
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		RemoteWebDriver driver = new RemoteWebDriver(url,cap);
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		
		
		
	}
	
}
