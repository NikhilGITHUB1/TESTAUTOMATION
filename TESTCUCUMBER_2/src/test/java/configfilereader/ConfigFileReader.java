package configfilereader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import enums.DriverType;
import enums.EnvironmentType;

public class ConfigFileReader {
	
	private Properties properties;
	private final String propertyFilePath="config//Configuration.properties";
	
	
public ConfigFileReader() {
	
	BufferedReader reader;
	
	try {
		reader=new BufferedReader(new FileReader(propertyFilePath));
	
	properties=new Properties();
	try {
		properties.load(reader);
		reader.close();
		
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	}
	catch (FileNotFoundException e) {
		e.printStackTrace();
		throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
	 }
	
	
	}


    public String getApplicationUrl() {
    	String url=properties.getProperty("url");
    	if(url!=null) return url;
    	else throw new RuntimeException("url not specified");	
    }
    
    
    public long getImplicitWait() {
    	String wait=properties.getProperty("ImplicitWait");
    	if(wait!=null) return Long.parseLong(wait);
    	else throw new RuntimeException("url not specified");	
    }
    
    
    public DriverType getBrowser() {
    	
        String browser = properties.getProperty("browser");
        if(browser==null||browser.equals("chrome")) return DriverType.CHROME;
        else if(browser.equalsIgnoreCase("firefox")) return DriverType.FIREFOX;
        else throw new RuntimeException("Browser Name Key value in Configuration.properties is not matched : " + browser);
    	
    }
    
    public EnvironmentType getEnvironment() {
    	String environment = properties.getProperty("environmentType");
    	if(environment==null || environment.equalsIgnoreCase("local")) return EnvironmentType.LOCAL;
        else if(environment.equalsIgnoreCase("remote")) return EnvironmentType.REMOTE;
        else throw new RuntimeException("Environment Type Key value in Configuration.properties is not matched : " + environment);

    }

    public String getTestDataResourcesPath() {
    	String path=properties.getProperty("testDataResourcePath");
    	if(path!=null) return path;
    	else throw new RuntimeException("path not specified");	
    }
    

}


