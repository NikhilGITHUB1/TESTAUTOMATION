package basicsCode;



class Maida{
	
	Maida(){
		System.out.println("boil water first");
	}
	
	public void prepareMomos(String water,String jeera) {
		System.out.println("grind the maida with " + water + " and " + "jeera");
}

}



class Momos extends Maida{
	
	Momos(){
		super();
		System.out.println("this is awesome");
	}

	
	public void prepareMomos(String veggies){
		System.out.println("fill "+veggies + " and boil");
	}
	
}

class Sauce extends Momos{
	
	//defining a static method and checking the overloading
	public static void prepareMomos() {
		System.out.println("serve with sauce");

}

}




public class MethodOverloadingWithInheritance {

	public static void main(String[] args) {
    
		Sauce s=new Sauce();
		s.prepareMomos("cabbage");
		Sauce.prepareMomos();
		s.prepareMomos("water", "jeera");
		
	}

}
