package restapitesting;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;


import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class RESTParameterization extends DataProviderTest {

	@SuppressWarnings("unchecked")
	@Test(dataProvider="data")
	void test_POST_01(String name, String last, int id) {

		JSONObject request = new JSONObject();

		request.put("firstName", name);
		request.put("lastName", last);
		request.put("subjectId", id);

		System.out.println(request);
		System.out.println(request.toJSONString()); //to prevent serialization error

		// so we have our body created, so we have to test this
		//for post we have 201
		
		baseURI = "http://localhost:3000";
		
		given().
		header("Content-Type","application/json")
		.contentType(ContentType.JSON).accept(ContentType.JSON).
		body(request.toJSONString())
		.when()
		.post("/users").then()
		.statusCode(201);

	}


}
