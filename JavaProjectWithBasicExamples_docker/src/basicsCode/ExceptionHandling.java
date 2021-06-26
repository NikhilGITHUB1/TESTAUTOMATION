package basicsCode;

class ThrowException{
	
	public void test() {
		int i=10/0;
	}
	
}


public class ExceptionHandling {

 public static void main(String[] args) {
	
	 ThrowException th = new ThrowException();
	 
	 
	 try {
		 th.test();
	 }
	 catch(ArithmeticException e) {
		 System.out.println("this is error");
	 }
	 
}
	
}
