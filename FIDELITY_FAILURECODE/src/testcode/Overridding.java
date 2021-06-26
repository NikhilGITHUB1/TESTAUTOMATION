package testcode;

//static methods cannot be overridden

public class Overridding {
	
	 static public void method1() {
		 System.out.println("nikhil");
		
	}
	
class A extends Overridding{
	
	public  void method1() {
		
		System.out.println("kanojia");
		
	}
	
}




}
