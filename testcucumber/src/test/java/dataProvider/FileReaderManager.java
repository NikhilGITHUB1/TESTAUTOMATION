package dataProvider;

public class FileReaderManager {
	
	private static FileReaderManager filereadermgr=new FileReaderManager();
	private static ConfigFileReader configFileReader;
	private static JsonDataReader jsonDataReader;


	private FileReaderManager() {
		
	}
	
	public static FileReaderManager getInstance() {
		return filereadermgr;
	}
	
	public ConfigFileReader getConfigFileReader() {
		return (configFileReader==null)? new ConfigFileReader():configFileReader;
	}
	
	 public JsonDataReader getJsonReader(){
		 return (jsonDataReader == null) ? new JsonDataReader() : jsonDataReader;
		 }
	
	
}
