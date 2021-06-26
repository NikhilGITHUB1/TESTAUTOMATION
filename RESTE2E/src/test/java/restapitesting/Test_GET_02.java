package restapitesting;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.hamcrest.collection.HasItemInArray;
import org.testng.annotations.Test;

import static io.restassured.matcher.ResponseAwareMatcher.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Test_GET_02 {

	@Test
	public void test_02() {
		//given().get("https://reqres.in/api/users?page=2").then().statusCode(200);

		given()
		.get("https://reqres.in/api/users?page=2")
		.then()
		.statusCode(200)
		.body("data.first_name", hasItems("Lindsay","Tobias"));
		//.log().all(); // everything will be logged to the console
		


	}

}
