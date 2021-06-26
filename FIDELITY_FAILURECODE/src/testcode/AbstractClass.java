package testcode;

//you cannot create object of an abstract class
//abstract class can have static methods for the concrete class

public abstract class AbstractClass {
	
	static public void test() {
		
	}
	
	abstract void test1();
	
}

class A extends AbstractClass{

	void test1() {
		
	}
	
}

class Test{
	public static void main(String[] args) {
		
		AbstractClass t = new AbstractClass();
		
	}
}
