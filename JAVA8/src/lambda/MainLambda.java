package lambda;


class TestLambda{
	
	// implementing the interface
	GreetingService hiService = new GreetingService() {
		
		public void greet(String name) {
			System.out.println("Hi "+name);
			
		}
		
	}; //semicolon is required
	

	//hello Service
	GreetingService helloService = (String name) -> System.out.println("Hello "+name);
	
	//text service - Multi line LAMBDA
	GreetingService textService = (String name) -> {
	System.out.println("Hello ");
	System.out.println("text me at" + name);
	};
	
	//hello Service, the parameter type and the braces are optional
		GreetingService helloService1 = name1 -> System.out.println("Holuu "+name1);
		
		
	
		ReturnService returnservice = name1 -> {
			return name1.toUpperCase();
			
		};
		
		//similar as above
		ReturnService returnservice1 =  name1 -> name1.toUpperCase();
			
	
		
		// return string via lambda, return stmt is not required, also curly braces are not required
		ReturnService fname = name2 -> name2.concat("kanojia");
			
			

}

public class MainLambda {

	public static void main(String[] args) {
		
      TestLambda ts = new TestLambda();
      ts.hiService.greet("nikhil");
      ts.helloService.greet("kanojia");
      ts.textService.greet("8884325937");
      ts.helloService1.greet("kanojia1");
      System.out.println(ts.returnservice.greet("kk"));
      System.out.println(ts.fname.greet("kk"));

		
		
	}
	
}
