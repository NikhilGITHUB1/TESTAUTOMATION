package basicsCode;

abstract class Gym{
	
	Gym(){
		System.out.println("this is gym constructor");
	}
	
	public void dumbell() {
		System.out.println("dumbell present");
	}
	
}

class Treadmill extends Gym{
	
	//here the subclass becomes concrete without providing any definition 
	//hence abstract class is not 100 % abstract
	
	
	Treadmill(){
		
		super();
		System.out.println("this is Treadmill constructor");
	}
	
}



public class AbstractClass2 {

	public static void main(String[] args) {

		new Treadmill();
		
	}

}
