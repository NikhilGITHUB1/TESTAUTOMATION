package context;

import managers.PageObjectManager;
import managers.WebDriverManager;

public class TestContext {
	
private WebDriverManager webdriverManager;
private PageObjectManager pageobjectManager;
public ScenarioContext scenarioContext;



public TestContext() {
	
	webdriverManager=new WebDriverManager();
	pageobjectManager=new PageObjectManager(webdriverManager.getDriver());
}


public WebDriverManager getWebDriverManager() {
	return webdriverManager;
}

public PageObjectManager getPageObjectManager() {
	return pageobjectManager;
}

public ScenarioContext getScenarioContext() {
	return scenarioContext;
}



}


