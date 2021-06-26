package restassured;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import reusablemethods.ReusableMethods;

public class UsingReusableMethods_5thCode {

	public static void main(String[] args) {
		
		
		
RestAssured.baseURI = "https://rahulshettyacademy.com";
		
		String response = given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body(payload.addPlace())
		        .when()
		        .post("maps/api/place/add/json")
		        .then()
		        .assertThat().statusCode(200).body("scope", equalTo("APP")).header("Server", "Apache/2.4.18 (Ubuntu)")
		        .extract().response().asString();
		
		JsonPath jsonpath = new JsonPath(response);
		String placeid = jsonpath.getString("place_id");
		System.out.println(placeid);
		
		
		//another given for put place api
		//This code will update the address, but to verify that we will use the getPlace api
		
		String newAddress="Liluah, INDIA";
		
	    given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
	    .body("{\n" + 
	    		"\"place_id\":\""+placeid+"\",\n" + 
	    		"\"address\":\""+newAddress+"\",\n" + 
	    		"\"key\":\"qaclick123\"\n" + 
	    		"}\n" + 
	    		"").when().put("maps/api/place/update/json").then().log().all()
	             .assertThat().statusCode(200).body("msg",equalTo("Address successfully updated"));
	    
	    //get request to verify if the address got updated
	    
	    String getResponse = given().log().all().queryParam("key", "qaclick123")
	    .queryParam("place_id", placeid).when().get("maps/api/place/get/json")
	    .then().assertThat().statusCode(200).extract().response().asString();
	    
	    JsonPath js1= ReusableMethods.rawToJson(getResponse);
	    //JsonPath js1 = new JsonPath(getResponse);  ---- removing this
	    String responseAddress = js1.getString("address");
	    System.out.println(responseAddress);
	    
	    Assert.assertEquals(newAddress, responseAddress);
	    
	    
	    
	    
	    
	    
	    
	    

		
		
	}

}
