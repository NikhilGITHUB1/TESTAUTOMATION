package test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class Utils {
	
	public static RequestSpecification getRequestSpecification() {
		
		RequestSpecification req = (RequestSpecification) new RequestSpecBuilder().setContentType("application/json").build();
		return req;
		
	}

}
