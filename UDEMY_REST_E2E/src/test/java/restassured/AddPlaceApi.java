package restassured;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import reusablemethods.ReusableMethods;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*; // for equal To

import org.testng.Assert;
	
	
	
	public class AddPlaceApi {
		
		public static void main(String args[]) {
		
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		
		String response= given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body(payload.addPlace()).when()
		        .post("maps/api/place/add/json")
		        .then()
		        .assertThat().statusCode(200).header("Server","Apache/2.4.18 (Ubuntu)").
		        extract().response().asString();
		
		
		System.out.println("the response is:" +response);
		
		//now we will parse the json to extract the place id
		
		JsonPath json = new JsonPath(response);
		String placeId = json.getString("place_id");
		
		System.out.println("the placeid is:" + placeId);
		
		
		
		//update the place
		//we added and updated the address, and now we want to see if the address actually got updated
		
		String newAddress="India";
		
		given().log().all().queryParam("key", "qaclick123").headers("Content-Type", "application/json")
		.body("{\n" + 
				"\"place_id\":\""+placeId+"\",\n" + 
				"\"address\":\""+newAddress+"\",\n" + 
				"\"key\":\"qaclick123\"\n" + 
				"}\n" + 
				"").when().put("maps/api/place/update/json")
		        .then().assertThat().log().all().statusCode(200).body("msg", equalTo("Address successfully updated"));
	

		//check if the place actually got updated using getPlace api
		
		//given().log().all().queryParam("key", "qaclick123").queryParam("place_id", placeId)
		//.when().get("maps/api/place/get/json").then().assertThat().log().all().statusCode(200)
		//.body("address", equalTo(newAddress));
		
		
		
		        String getApiResponse = given().log().all().queryParam("key", "qaclick123").queryParam("place_id", placeId)
				.when().get("maps/api/place/get/json").then().assertThat().log().all().statusCode(200)
			    .extract().response().asString();
		        
		        
		    	JsonPath getAddress = ReusableMethods.rawToJson(getApiResponse); // defining a reusable method here
				String actualAddress = getAddress.getString("address");
				
				System.out.println("the updated address is:" + actualAddress);
				
				//using testng
				Assert.assertEquals(actualAddress, newAddress);
		
		
		
		}
	
	

}