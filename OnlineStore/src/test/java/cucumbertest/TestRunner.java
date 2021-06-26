package cucumbertest;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature"
		,glue={"stepdefinition"}
		//,dryRun = true
		//,monochrome=true
		,tags= {"@smoketest"}
		)


public class TestRunner {
	
	

}
