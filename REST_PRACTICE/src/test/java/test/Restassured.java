package test;

import org.json.simple.JSONObject;
import org.junit.Assert;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class Restassured {
	
	public static void main(String[] args) {
		

	RestAssured.baseURI = "https://petstore.swagger.io/v2";
	PojoCatClass res = given().spec(Utils.getRequestSpecification()).body(Payload.getPayloadCat()).when().post("pet")
			.as(PojoCatClass.class);
	
	System.out.println(res);
	
	System.out.println(res.getCategory().getId());
	
//	JsonPath js=new JsonPath(res);
//	String id=js.getString("status");
//	System.out.println(id);
	
	
	
//	String getResponse = given().log().all().header("Content-Type","application/json").when()
//	.get("https://petstore.swagger.io/v2/pet/findByStatus?status=sold").then().log().all().extract().response().asString();
//	
//	
//	PojoCatClass getresponse1 = given().log().all().header("Content-Type","application/json").when()
//			.get("https://petstore.swagger.io/v2/pet/findByStatus?status=sold").as(PojoCatClass.class);
//	
//	System.out.println(getresponse1.getStatus());
//	
	//System.out.println(getResponse);
	
	
    
	}

}
