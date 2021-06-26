package basicsCode;

interface Cooler{
	
	public void hotair();
	public void coolair();
}

class Blades implements Cooler{

	
	public void hotair() {
		System.out.println("blades down, hot air");		
	}

	
	public void coolair() {
		System.out.println("blades up, cool air");
	}
	
}

class Electricity {
	
	public static void haveElectricity(Cooler c) {
	c.hotair();
	c.coolair();	
	}
}


public class Polymorphism_Interface {

	public static void main(String[] args) {

		Blades b=new Blades();
		Electricity.haveElectricity(b);
		
	}
	
	// this is a concept of runtime polymorphism
	//at runtime it is decided ,which object will be assigned to the interface
	// the runtime polymorphism is better achieved via Interfaces

}
