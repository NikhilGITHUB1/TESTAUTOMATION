package dataProvider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import enums.DriverType;
import enums.EnvironmentType;

public class ConfigFileReader {
	
	private Properties properties;
	private final String propertyFilePath="configs//Configuation.properties";
	
	public ConfigFileReader() {
		BufferedReader reader;
		
		try {
			reader=new BufferedReader(new FileReader(propertyFilePath));
			properties=new Properties();

		
		try {
			properties.load(reader);
			reader.close();  
		}
		catch (FileNotFoundException e) {
		
		} 
	}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public String getApplicationUrl() {
		String url=properties.getProperty("url");
		if(url != null) return url;
		 else throw new RuntimeException("url not specified in the Configuration.properties file.");

	
	}
	
	public long getImplicitlyWait() {
		String implicitWait=properties.getProperty("implicitlyWait");
		if(implicitWait!=null) {
			try {
			return Long.parseLong(implicitWait);
			}
			catch(NumberFormatException e) {
				throw new RuntimeException("unable to parse" + implicitWait + "to long");
			}
		}
		return 30;
	}
	
	public DriverType getBrowser() {
		String browser=properties.getProperty("browser");
		if(browser==null || browser.equals("chrome")) return DriverType.CHROME;
		else if(browser.equalsIgnoreCase("firefox")) return DriverType.FIREFOX;
		else if(browser.equals("iexplorer")) return DriverType.INTERNETEXPLORER;
		else throw new RuntimeException("Browser Name Key value in Configuration.properties is not matched : " + browser);
	}
	
	public EnvironmentType getEnvironment() {
		String environment=properties.getProperty("environment");
		if(environment==null || environment.equals("local")) return EnvironmentType.LOCAL;
		else if(environment.equals("remote")) return EnvironmentType.REMOTE;
		else throw new RuntimeException("Environment Type Key value in Configuration.properties is not matched : " + environment);
	}
	
	public Boolean getBrowserWindowSize() {
		String windowSize = properties.getProperty("windowMaximize");
		if(windowSize != null) return Boolean.valueOf(windowSize);
		return true;
	}
	
	public String getTestDataResourcePath(){
		String testDataResourcePath = properties.getProperty("testDataResourcePath");
		if(testDataResourcePath!= null) return testDataResourcePath;
		else throw new RuntimeException("Test Data Resource Path not specified in the Configuration.properties file for the Key:testDataResourcePath");		
	}
	
	public String getReportConfigPath(){
		String reportConfigPath = properties.getProperty("reportConfigPath");
		if(reportConfigPath!= null) return reportConfigPath;
		else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");		
	}

}
