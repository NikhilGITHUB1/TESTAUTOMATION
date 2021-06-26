package restassured_addbook;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import reusablemethods.ReusableMethods;

import static io.restassured.RestAssured.*;


public class AddBookApi_7thCode {
	
	@Test(dataProvider="getData")
	public void addBook(String isbn, String aisle) {
		
		
		RestAssured.baseURI = "http://216.10.245.166";
		
		String response = given().header("Content-Type", "application/json")
		.body(BookPayload.getBookApi(isbn,aisle)).
		when().
		post("/Library/Addbook.php")
		.then()
		.assertThat().log().all().statusCode(200).extract().asString();
		
		JsonPath js = ReusableMethods.rawToJson(response);
		String bookID = js.getString("ID");
		System.out.println(bookID);
		
	}
	
	
	@DataProvider // we can pass this data from excel , will look into that
	public Object[][] getData() {
		
		return new Object[][] {
			{"sds2","76667"},
			{"eere2","78667"},
			{"yyge2","7868678"}};
			
		}
		
	}
