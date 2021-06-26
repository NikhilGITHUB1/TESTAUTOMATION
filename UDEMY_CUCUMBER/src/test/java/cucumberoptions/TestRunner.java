package cucumberoptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/feature",
		stepNotifications = true, monochrome = true, 
		glue = "stepdefinition",
		tags = "@datatablenew",
		//tags = "@datatablenew and not @skip",
		//publish=true,
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"html:target/cucumber.html","json:target/cucumber.json","junit:target/cukes.xml",
				"timeline:test-output-thread/"}
		)
       
		
public class TestRunner {
	

}
