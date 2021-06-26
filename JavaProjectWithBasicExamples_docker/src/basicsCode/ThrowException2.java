package basicsCode;

class TestThrow {
	
	public void test() throws ArithmeticException{
		
		
		try {
		
		int i=10/0;
			
		//throw new ArithmeticException();
		}
		finally {
			System.out.println("this is finally");
		}
	}
	
}


public class ThrowException2 {

	public static void main(String[] args) throws ArithmeticException {
		
		TestThrow th= new TestThrow();
		
		try {
		th.test();
		}
		catch(Exception e) {
			System.out.println("caught the exception");
		}
	}

}
