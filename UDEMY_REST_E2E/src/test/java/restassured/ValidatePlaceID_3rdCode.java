package restassured;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class ValidatePlaceID_3rdCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		
		

	}

}
