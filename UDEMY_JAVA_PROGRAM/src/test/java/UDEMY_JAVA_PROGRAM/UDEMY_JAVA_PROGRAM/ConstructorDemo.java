package UDEMY_JAVA_PROGRAM.UDEMY_JAVA_PROGRAM;

class Temple {
	
	
	//no return types
	//default constructor is called if no constructor defined.
	//if defined parameterized constructor, and not the default cons, and you have created an object to call the default constructor,
	//then compiler will not call the default constructor for u, and you have to explicitly define the default constructor.
	
	protected int var=1;
	
	public Temple() {
		System.out.println("temple cons");
	}
	
	public Temple(String s) {
		System.out.println(s);
	}
	

	public void test() {
		System.out.println("temple runs");
	}

}

public class ConstructorDemo {

	public static void main(String[] args) {

		Temple t = new Temple();
		Temple t1 = new Temple("nikhil temple");
		System.out.println(t.var);
		

	}

}
