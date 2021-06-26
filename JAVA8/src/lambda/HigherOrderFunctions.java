package lambda;

class Test{
	
	ReturnService gs = n -> n.toUpperCase();
}


public class HigherOrderFunctions {

	public static void main(String[] args) {
		
		Test t = new Test();
		//test(t.gs);
		
		//...so t.gs is a reference to n -> n.toUpperCase();
		//so instead of passing t.gs we are passing directy n -> n.toUpperCase() to test
		//we can modify this as well
		test(n -> n.toUpperCase());
		test(n -> n.toUpperCase() + n.toLowerCase());
		
	}

	private static void test(ReturnService gs) {
		String returnedString = gs.greet("sdet");
		System.out.println(returnedString);
				
		
	}



}
