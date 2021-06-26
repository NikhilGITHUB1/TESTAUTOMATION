package basicsCode;


class Bath {
	
	String needWater = "yes";
	String needTowel = "yes";
	
	public void bath() {
		System.out.println("lets bath");
	}
	
}

//The super keyword can also be used to invoke parent class method. 
//It should be used if subclass contains the same method as parent class. In other words, it is used if method is overridden.

class Bathroom extends Bath {

	//super.bath();
	
}



public class superUsage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
