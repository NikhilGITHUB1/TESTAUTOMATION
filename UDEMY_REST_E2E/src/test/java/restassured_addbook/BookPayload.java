package restassured_addbook;

public class BookPayload {
	
 public static String getBookApi(String isbn, String aisle) {
	String payload= "{\n" + 
			"\n" + 
			"\"name\":\"Learn Appium Automation with Java\",\n" + 
			"\"isbn\":\""+isbn+"\",\n" + 
			"\"aisle\":\""+aisle+"\",\n" + 
			"\"author\":\"John foe\"\n" + 
			"}";
	return payload;
	 
 }

}
