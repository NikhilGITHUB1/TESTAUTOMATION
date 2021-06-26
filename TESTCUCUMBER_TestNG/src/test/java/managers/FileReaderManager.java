package managers;

import configfilereader.ConfigFileReader;
import configfilereader.JsonDataReader;

public class FileReaderManager {
	
private static ConfigFileReader configFileReader;	
private static JsonDataReader jsonDataReader;	

	
private FileReaderManager() {
	
}
	
public static FileReaderManager getInstance() {
	
	return new FileReaderManager();
	
}


public ConfigFileReader getConfigFileReader() {
	
	return (configFileReader==null) ? new ConfigFileReader(): configFileReader;
}


public JsonDataReader jsonDataReader() {
	
	return (jsonDataReader==null) ? new JsonDataReader(): jsonDataReader;
}


	
}
