package oauth2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

public class OAuthTest_code2_deserialization {

	@Test
	public void test_Oauth() throws InterruptedException{

//https://accounts.google.com/o/oauth2/v2/auth?scope=https://www.googleapis.com/auth/userinfo.email&auth_url=https://accounts.google.com/o/oauth2/v2/auth&client_id=692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com&response_type=code&redirect_uri=https://rahulshettyacademy.com/getCourse.php
		
		String url = "https://rahulshettyacademy.com/getCourse.php?code=4%2F0AY0e-g5m3QMAyOO_kRW3ASryiTNk0rnodk91wwE1laqrN7WA7lwJjc22rmcPHq3vdk4a-A&scope=email+https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.email+openid&authuser=0&prompt=none";
		String partialcode=url.split("code=")[1];

		String code=partialcode.split("&scope")[0];

		System.out.println(code);



		//code to get the access token
        //we will pass the url encoding enabled as False, other restassured will convert special chars to numeric code
        
		String accessTokenResponse = given().urlEncodingEnabled(false).queryParam("code", code	)
				.queryParams("client_id", "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
				.queryParams("client_secret","erZOWM9g3UtwNRj340YYaK_W")
				.queryParams("redirect_uri","https://rahulshettyacademy.com/getCourse.php")
				.queryParams("grant_type","authorization_code")
				.when().log().all()
				.post("https://www.googleapis.com/oauth2/v4/token")
				.asString();
		
		
		

		//we have to extract the token
		JsonPath js = new JsonPath(accessTokenResponse);
		String accessToken = js.getString("access_token");


		//send the response,to extract the courses
		//here we are extracting the response and storing that in a POJO class
		
		Pojo_getCourse response = given().queryParam("access_token", accessToken).expect().defaultParser(Parser.JSON).when()
				.get("https://rahulshettyacademy.com/getCourse.php")
			.as(Pojo_getCourse.class);
		
		System.out.println(response.getLinkedIn());
		
		//String courses=response.getCourses().getApi().get(index);
		
		
		
     	//System.out.println(response);
		
		
		
        	
        }
   


	}


