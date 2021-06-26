package resources;

import java.io.IOException;

import io.cucumber.java.Before;
import stepdefinitions.StepDefinition;

public class Hooks {
	
@Before("@DeletePlace")
public void beforeDelete() throws IOException {
	
	
	StepDefinition s = new StepDefinition();
	if(StepDefinition.place_id==null) {
	
	s.add_place_payload_with_data("nik", "tamil", "chennai");
	s.user_calls_with_http_request("AddPlaceApi", "POST");
	s.verify_that_placeid_created_maps_to_in("nik", "GetPlaceApi");
	
	}
}

}
