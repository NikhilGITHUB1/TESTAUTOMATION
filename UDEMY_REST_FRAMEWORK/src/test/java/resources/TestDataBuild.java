package resources;

import java.util.ArrayList;
import java.util.List;

import pojo.AddPlace;
import pojo.Location;

public class TestDataBuild {
	
	
	public AddPlace addPlacePayload(String name, String language, String address) {
		
		AddPlace place = new AddPlace();
		 place.setAccuracy(50);
		 place.setAddress(address);
		 place.setLanguage(language);
		 place.setName(name);
		 place.setPhone_number("(+91) 983 893 3937");
		 place.setWebsite("https://www.google.com");

		 List<String> ls = new ArrayList<String>();
		 ls.add("test");
		 ls.add("test2");
		 
		 place.setTypes(ls);
		 
		 Location loc =new Location();
		 loc.setLat(33.2);
		 loc.setLng(22.7);
		 
		 place.setLocation(loc);
		 
		 return place;
		
	}
	
	public String deletePlacePayload(String placeid) {
		
		return "{\r\n    \"place_id\":\""+placeid+"\"\r\n}\r\n";
		//return "{\r\n    \"place_id\":\"cdb498e0a50c87feb921cd2adf6b2fc6\"\r\n}\r\n";
		
		
	}
	
	

}
