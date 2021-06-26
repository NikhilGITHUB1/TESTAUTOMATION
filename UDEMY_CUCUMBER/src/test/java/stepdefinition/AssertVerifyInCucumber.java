package stepdefinition;

import org.junit.Test;
import static org.junit.Assert.*;
	
import io.cucumber.java.After;
import io.cucumber.java.en.Then;
import io.cucumber.messages.Messages.GherkinDocument.Feature.Scenario;

public class AssertVerifyInCucumber {
	
   

		//Assert mySoftAssert=new Assert();

		    @Then("check something")
		    public void checkSomething() {
		    	assertTrue(true);
		    }

		    @After
		    public void afterScenario(Scenario scenario) throws Exception {
		    	//assertTrue.assertAll();
		    }
    }





