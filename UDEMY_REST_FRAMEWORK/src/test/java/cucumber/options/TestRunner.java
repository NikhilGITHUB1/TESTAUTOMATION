package cucumber.options;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features",
stepNotifications = true,
//tags = "@DeletePlace",
plugin = "json:target/jsonReports/cucumberReports.json",
glue = {"stepdefinitions"}
)
public class TestRunner {

}
