package oauth2;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.List;


public class SerializeTest {
	
	
 @Test
 public void test() {
	 
	 // we will define the java object here, and pass it through the body of the request
	 //here serialization is happening where we are converting java object to json and submit this json to
	 //addplace api which we are interested.
	 //internally the java obj is converted to json
	 
	 
	 AddPlace place = new AddPlace();
	 place.setAccuracy(50);
	 place.setAddress("liluah");
	 place.setLanguage("hindi");
	 place.setName("kanojia");
	 place.setPhoneNumber("(+91) 8898989944");
	 place.setWebsite("https://www.google.com");

	 List<String> ls = new ArrayList<String>();
	 ls.add("test");
	 ls.add("test2");
	 
	 place.setTypes(ls);
	 
	 Location loc =new Location();
	 loc.setLat(33.2);
	 loc.setLng(22.7);
	 
	 place.setLocation(loc);
	 
	 RestAssured.baseURI = "https://rahulshettyacademy.com/";
	 
	 Response res = given().queryParam("key", "qaclick123").body(place).when().post("/maps/api/place/add/json").then().
	 assertThat().statusCode(200).extract().response();
	 
	 String responseString = res.asString();
	 System.out.println(responseString);
	 
	 
	 
 }

}
