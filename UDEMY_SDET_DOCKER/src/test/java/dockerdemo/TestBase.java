package dockerdemo;

import static utils.ProcessUtils.execute;

import java.net.URL;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


public class TestBase {
	
	
	private static final String SETUP_DOCKER_SCRIPT_FILE = "./dockerbat.sh";
    private static final String SCALE_CHROME_FILE = System.getProperty("user.dir") + "/docker_scale.sh";
    private static final String TEAR_DOWN_SCRIPT_FILE = System.getProperty("user.dir") + "/dockerdown.sh";
    private static final String EXPECTED_MESSAGE = "The node is registered to the hub and ready to use";
    public static ThreadLocal<RemoteWebDriver> remoteWebDriver = new ThreadLocal<>();
	public static RemoteWebDriver driver;

 
    @BeforeSuite
    public void setUp() {
      execute(SETUP_DOCKER_SCRIPT_FILE, EXPECTED_MESSAGE);
      execute(SCALE_CHROME_FILE, true);
  }
 
    @BeforeClass
    public void beforeTest() throws Exception {
    	//ChromeOptions options = new ChromeOptions();
        URL url = new URL("http://localhost:4444/wd/hub");
        DesiredCapabilities desiredCapabilities = DesiredCapabilities.chrome();
        driver=new RemoteWebDriver(url,desiredCapabilities );
    }
 
    @AfterClass
    public void tearDown() {
        driver.close();
    }
 
    @AfterSuite
    public void afterTest() {
        execute(TEAR_DOWN_SCRIPT_FILE, true);
    }
 
}


