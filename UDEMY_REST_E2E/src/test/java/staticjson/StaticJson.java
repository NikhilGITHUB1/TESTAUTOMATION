package staticjson;

import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import restassured_addbook.BookPayload;
import reusablemethods.ReusableMethods;

import java.io.IOException;
import java.nio.file.Files;

import java.nio.file.Paths;

import org.testng.annotations.Test;


public class StaticJson {
	
@Test	
public void addBook() throws IOException {
		
		
		RestAssured.baseURI = "http://216.10.245.166";
		
		String response = given().header("Content-Type", "application/json")
		.body(GenerateStringFromResources("/Users/nikhilkanojia/Downloads/DemoProject 2/src/files/data.json")).
		when().
		post("/Library/Addbook.php")
		.then()
		.assertThat().log().all().statusCode(200).extract().asString();
		
		JsonPath js = ReusableMethods.rawToJson(response);
		String bookID = js.getString("ID");
		System.out.println(bookID);
		
	}

//we are passing the json parameter in the file 
// this method convert the json to bytes and new String convert that to string and returned
public static String GenerateStringFromResources(String path) throws IOException {
	
    return new String(Files.readAllBytes(Paths.get(path)));

	
}





}
