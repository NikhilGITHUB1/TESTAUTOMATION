package jiratest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import java.io.File;


public class JiraTest {
	
	@Test
	public void addcomment() {
		
	RestAssured.baseURI = "http://localhost:8100/";
	SessionFilter session = new SessionFilter();
	
	//for login
	String response = given().relaxedHTTPSValidation().header("Content-Type","application/json").
	body("{ \"username\": \"kanojia.nikhil07@gmail.com\", \"password\": \"maya@786\" }").filter(session)
	.when().post("rest/auth/1/session").then().extract().response().asString();
	
	String expectedMessage = "MILKHA BAN GAYA INDIA3";
	
	// for adding the comment
	String commentDetails = given().pathParam("key", "10103").header("Content-Type","application/json")
	.body("{\n" + 
			"    \"body\": \""+expectedMessage+"\",\n" + 
			"    \"visibility\": {\n" + 
			"        \"type\": \"role\",\n" + 
			"        \"value\": \"Administrators\"\n" + 
			"    }\n" + 
			"}").filter(session).when().post("rest/api/2/issue/{key}/comment")
	        .then().assertThat().statusCode(201).extract().response().asString();
	
	JsonPath js = new JsonPath(commentDetails);
	String commentId = js.get("id");
	
	
	//curl -D- -u admin:admin -X POST -H "X-Atlassian-Token: no-check" -F "file=@myfile.txt" http://myhost/rest/api/2/issue/TEST-123/attachments
   //for adding attachment
	
	given().pathParam("key", "10103").header("X-Atlassian-Token", "no-check").filter(session).header("Content-Type", "multipart/form-data")
	.multiPart("file",new File("file.txt")).when().post("rest/api/2/issue/{key}/attachments")
	.then().assertThat().statusCode(200);
	

	//getIssue api
	//GET /rest/api/2/issue/{issueIdOrKey}
	
	String issueDetails = given().pathParam("key","10103")
	.queryParams("fields", "comment").filter(session).when().get("rest/api/2/issue/{key}").
	then().log().all().extract().response().asString();

	JsonPath js1 = new JsonPath(issueDetails);
	int commentcount = js1.getInt("fields.comment.comments.size()");
	
	for(int i=0; i < commentcount;i++) {
		
		String actualid = js1.getString("fields.comment.comments["+i+"].id");
		String actualMessage = js1.getString("fields.comment.comments["+i+"].body");

	if(expectedMessage.equals(actualMessage)) {
			System.out.println(actualMessage);
			System.out.println("MESSAGE MATCHED");
		}
		
		if(commentId.equals(actualid)) {
			System.out.println("ID MATCHED");
			
		}
		
		
		
		
	}

	
	
	
	
		
	}

}
