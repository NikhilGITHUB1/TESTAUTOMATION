package basicsCode;

//the process of hiding the implementation for an object and only providing the functionality is a concept of Abstraction.

interface Wood{
	
	public void willowWood();
	public void teakWood();
}

class Bat implements Wood{

	@Override
	public void willowWood() {
       System.out.println("prepare willowwood bats");
		
	}

	@Override
	public void teakWood() {
      System.out.println("prepare teakwood bats");
		
	}
	
}


class Chair implements Wood{

	@Override
	public void willowWood() {
     System.out.println("prepare willow wood chair");		
	}

	@Override
	public void teakWood() {
     System.out.println("prepare teakwood chair");		
	}
	
}

class Tree{
	
	public static Wood getWood() {
		
		return new Chair();
		
	}
}

public class Abstraction_Interfaces {

	public static void main(String[] args) {

		Wood d=Tree.getWood();
		d.teakWood();
		d.willowWood();   
		
	}

}
