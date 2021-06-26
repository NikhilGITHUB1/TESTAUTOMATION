package basicsCode;

class Granddad{
	
	Granddad(){
		
		//super();

		System.out.println("this is GrandDad construtor, will be printed 1st");

	}
	
	public void grandDadDisplay() {
		
	}
	
}

class Dad extends Granddad{
	
	
	Dad(){
		
		super();

		System.out.println("this is Dad construtor, will be printed 2nd");

	}
	
	public void dadDisplay() {
		
	}
	
}

class Son extends Dad{
	
	Son(){
		super();
		System.out.println("this is Son construtor, will be printed last");
	}
	
	public void sonDisplay() {
		
		
	}
	
}



public class superwithInheritanceandConstructor {

	public static void main(String[] args) {
		
		Son s=new Son();
		
	}
}
