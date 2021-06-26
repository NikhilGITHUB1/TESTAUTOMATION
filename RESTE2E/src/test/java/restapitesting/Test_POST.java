package restapitesting;

import org.testng.annotations.Test;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Test_POST {
	
	//@Test
	@Test
	void test_POST_01() {
		
		//we know that json is key value pair , so we will create a MAP to create a key value pair
		// then we can import the json library via maven like gson, jackson, json, simple json
		// here we will use simple json to convert map to json
		
		Map<String,Object> map =new HashMap<String,Object>();
		
		map.put("name","nikhil");
		map.put("job", "engineer");
		
		System.out.println(map);
		
		JSONObject request = new JSONObject(map);
		
		System.out.println(request);
		System.out.println(request.toJSONString()); //to prevent serialization error
		
		// so we have our body created, so we have to tes	t this
		//for post we have 201
		
		given().
		header("Content-Type","application/json")
		.contentType(ContentType.JSON).accept(ContentType.JSON).
		body(request.toJSONString())
		.when()
		.post("https://reqres.in/api/users").then()
		.statusCode(201);
	
	}
	
	
	
	@Test
	void test_PUT() {
		
		//we know that json is key value pair , so we will create a MAP to create a key value pair
		// then we can import the json library via maven like gson, jackson, json, simple json
		// here we will use simple json to convert map to json
		
		Map<String,Object> map =new HashMap<String,Object>();
		
		map.put("name","nikhil");
		map.put("job", "engineer");
		
		System.out.println(map);
		
		JSONObject request = new JSONObject(map);
		
		System.out.println(request);
		System.out.println(request.toJSONString()); //to prevent serialization error
		
		// so we have our body created, so we have to test this
		//for post we have 201
		
		given().
		header("Content-Type","application/json")
		.contentType(ContentType.JSON).accept(ContentType.JSON).
		body(request.toJSONString())
		.when()
		.put("https://reqres.in/api/users/2").then()
		.statusCode(200).log().all();
	
	}
	
	
	//@Test
	@Test
	void test_DELETE() {
		

		when()
		.delete("https://reqres.in/api/users/2").then()
		.statusCode(204).log().all();
	
	}
	
	
	
	
	
	

}
