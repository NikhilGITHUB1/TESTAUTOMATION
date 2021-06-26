package restapitesting;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*; // static import of the rest assured library

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.RestAssured.*;
import static io.restassured.matcher.ResponseAwareMatcher.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Test_01_GET {

	@Test
	public void test_01(){
		
		//Response response = RestAssured.get("https://reqres.in/api/users?page=2");
		
		Response response = get("https://reqres.in/api/users?page=2"); //since we used static imports, we commented the 1st line
		
		System.out.println(response.asString());
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusCode());

		System.out.println(response.getStatusLine());

		System.out.println(response.getHeader("content-type"));

		System.out.println(response.getTime());
		
		AssertJUnit.assertEquals(response.getStatusCode(), 200);
		
	}
	
	
	@Test
	public void test_02() {
		//given().get("https://reqres.in/api/users?page=2").then().statusCode(200);
		
		given()
		.get("https://reqres.in/api/users?page=2")
		.then()
		.statusCode(200)
		.body("data.id[0]",equalTo(7));
		
		
		
		
	}





}
