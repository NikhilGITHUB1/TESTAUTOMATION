package oauth2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

public class OAuthTest {

	@Test
	public void test_Oauth() throws InterruptedException{

//		//we have to use selenium, as we have to get the token from the browser
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://accounts.google.com/o/oauth2/v2/auth?scope=https://www.googleapis.com/auth/userinfo.email&auth_url=https://accounts.google.com/o/oauth2/v2/auth&client_id=692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com&response_type=code&redirect_uri=https://rahulshettyacademy.com/getCourse.php");
//		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("kanojia.nikhil07@gmail.com");
//		driver.findElement(By.cssSelector("input[type='email']")).sendKeys(Keys.ENTER);
//		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("frjkjf");
//		driver.findElement(By.cssSelector("input[type='password']")).sendKeys(Keys.ENTER);
//        Thread.sleep(4000);
//        String url = driver.getCurrentUrl();	
		String url = "https://rahulshettyacademy.com/getCourse.php?code=4%2F1AEKdUvqhF2Zw4wDyT0h8Ov09fd1IuqmWoHWn4yrSokEsOMtFzb20bGnKJP2QGhetp9gpWKGCT8k7Avz-qguXC8&scope=email+openid+https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.email&authuser=0&prompt=none";
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
		
		//String response = given().queryParam("access_token", accessToken).when().get("https://rahulshettyacademy.com/getCourse.php")
			//	.asString();
		
     	//System.out.println(response);
		
		
		//we are performing deserialization here, so we are extracting the response in the JAVA object
		//We are explicitly telling the response type is json, with the help of parser json class
				
		Pojo_getCourse gc = given().queryParam("access_token", accessToken).expect().defaultParser(Parser.JSON)
		.when().get("https://rahulshettyacademy.com/getCourse.php")
		.as(Pojo_getCourse.class);
		
		System.out.println(gc.getLinkedIn());
		System.out.println(gc.getInstructor());
		System.out.println(gc.getCourses().getApi().get(1).getCourseTitle());
		
        // gc.getCourses().getApi() - returns total number of api's, can be used in for loop 

        for(int i=0;i<gc.getCourses().getApi().size();i++) {
        	
        	if(gc.getCourses().getApi().get(i).getCourseTitle().equals("SoapUI Webservices testing")) {
        		System.out.println(gc.getCourses().getApi().get(i).getPrice());
        	}
        	
        }
   


	}

}
