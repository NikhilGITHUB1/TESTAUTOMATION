package resources;
//enum is special class in java which has collection of constants or  methods
public enum APIResources {
	
	AddPlaceAPI("/maps/api/place/add/json"),  // enum treats this as a method, separate methods with comma
	getPlaceAPI("/maps/api/place/get/json"),
	deletePlaceAPI("/maps/api/place/delete/json");
	private String resource;
	
	APIResources(String resource)  //you have to declare a constructor like this when you declare an enum. this will accept argument., 
	{                              //as we have defined a method which accepts an argument
		this.resource=resource;
	}
	
	public String getResource()
	{
		return resource;
	}
	

}
