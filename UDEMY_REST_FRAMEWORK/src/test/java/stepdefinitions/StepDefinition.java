package stepdefinitions;

import static io.restassured.RestAssured.given;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import enum_.APIResources;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import pojo.AddPlace;
import pojo.Location;
import resources.TestDataBuild;
import resources.Utils;

import static org.junit.Assert.*;


public class StepDefinition extends Utils{
	TestDataBuild testdata = new TestDataBuild();
	RequestSpecification res;
	ResponseSpecification resspec;
	Response response;
	public static String place_id;

	
	@Given("Add place payload with data {string} {string} {string}")
	public void add_place_payload_with_data(String name, String language, String address) throws IOException {

		  res = given().spec(getRequestSpecification()).body(testdata.addPlacePayload(name, language, address));
		  resspec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		
	}
	
	@When("user calls {string} with {string} http request")
	public void user_calls_with_http_request(String resource, String method) {
    	
    	APIResources apiresources = APIResources.valueOf(resource);
    	//apiresources.getResource()
    	
    	if(method.equalsIgnoreCase("POST")) {
    		response = res.when().post(apiresources.getResource());
    	}
    	else if(method.equalsIgnoreCase("GET")) {
    		response = res.when().get(apiresources.getResource());
    		
    	}
    	
		 // response = response.then().log().all().spec(resspec).extract().response();
		//  System.out.println(response);

				 
		
	}
	@Then("the Api call is success with status code {int}")
	public void the_api_call_is_success_with_status_code(Integer int1) {
		
		assertEquals(response.getStatusCode(),200);
	    
		
		
	}
	
	@And("^\"([^\"]*)\" in the response body is \"([^\"]*)\"$")
	public void in_the_response_body_is(String key, String expectedvalue) {
	   
	    String  actualvalue= getJsonPath( response, key);
		assertEquals(actualvalue,expectedvalue);
		
	}
	
	
	@Then("verify that placeid created maps to {string} in {string}")
	public void verify_that_placeid_created_maps_to_in(String expectedname, String resource) throws IOException {
	    
		place_id = getJsonPath( response, "place_id");
		res = given().spec(getRequestSpecification()).queryParam("place_id", place_id);
		user_calls_with_http_request(resource,"GET");
	    String  actualname= getJsonPath(response, "name");
	    assertEquals(actualname,expectedname);
		
	}


	@Given("Delete place payload")
	public void delete_place_payload() throws IOException {
	 
		res = given().spec(getRequestSpecification()).body(testdata.deletePlacePayload(place_id));
		
	}
	

}
