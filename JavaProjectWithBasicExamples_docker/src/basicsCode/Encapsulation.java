package basicsCode;


class Aggregator{
	
 private String apigw_app;
 private String auth_app;
	
 public String getApiGW(){
	 
	 apigw_app="Mint";
	 return apigw_app;
	 
 }
 
 public String getAuth(){
	 
	 auth_app="Ttax";
	 return auth_app;
	 
	 
 }
 
 public void setApiGw() {
	 
	 
	 
	 
 }
 
 
}




public class Encapsulation {

	public static void main(String[] args) {

		Aggregator agg=new Aggregator();
		String apiGwapp=agg.getApiGW();
		String authapp=agg.getAuth();
		
		
	    System.out.println(apiGwapp);
	    System.out.println(authapp);
	    


	}

}
