package jsonTojava;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ExtractJson {
	
	public static void main(String[] args) throws IOException {
		
		ObjectMapper obj = new ObjectMapper();
		CustomerDetailsAppium c = obj.readValue(new File("/Users/nikhilkanojia/seleniumProject/UDEMY_SDET/customerInfo0.json"), CustomerDetailsAppium.class);
		System.out.println(c.getCourseName());
	}

}
