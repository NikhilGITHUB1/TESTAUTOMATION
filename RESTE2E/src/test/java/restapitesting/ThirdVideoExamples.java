package restapitesting;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import org.json.simple.JSONObject;

public class ThirdVideoExamples {

	//@Test
	@Test
	public void test_get() {

		baseURI = "http://localhost:3000";

		given().
		get("/users").
		then().statusCode(200).
		log().all();

	}



	//@Test
	@Test
	public void test_get02() {

		baseURI = "http://localhost:3000";

		given().
		params("name","Automation").    // filterng with name, it is similar to localhost:3000 ? name = "Automation" in url
		get("/subjects").
		then().statusCode(200).
		log().all();

	}


	//@Test
	@Test
	public void test_post() {

		baseURI = "http://localhost:3000";

		JSONObject request = new JSONObject();

		request.put("firstName", "raja");
		request.put("lastName", "rani");
		request.put("subjectId", 1); // no need to add id as it will be created automatically


		given().
		header("Content-Type","application/json")
		.contentType(ContentType.JSON).accept(ContentType.JSON).
		body(request.toJSONString()).when().
		post("/users").
		then().statusCode(201).
		log().all();

	}


	//@Test
	@Test
	public void test_patch() {

		baseURI = "http://localhost:3000";

		JSONObject request = new JSONObject();


		request.put("lastName", "salamat");



		given().
		header("Content-Type","application/json")
		.contentType(ContentType.JSON).accept(ContentType.JSON).
		body(request.toJSONString()).when().
		patch("/users/4").
		then().statusCode(200).
		log().all();

	}


	//@Test
	@Test
	public void test_put() {

		baseURI = "http://localhost:3000";

		JSONObject request = new JSONObject();


		request.put("firstName", "kanda");
		request.put("lastName", "aalo");
		request.put("subjectId", 5); // no need to add id as it will be created automatically


		given().
		header("Content-Type","application/json")
		.contentType(ContentType.JSON).accept(ContentType.JSON).
		body(request.toJSONString()).when().
		put("/users/4").
		then().statusCode(200).
		log().all();

	}


	//@Test
	@Test
	public void test_delete() {

		baseURI = "http://localhost:3000";


		when().
		delete("/users/4").
		then().statusCode(200).
		log().all();

	}







}
