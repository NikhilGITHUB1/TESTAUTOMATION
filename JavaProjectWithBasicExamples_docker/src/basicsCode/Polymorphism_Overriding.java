package basicsCode;

class WestBengal{
	public void eat() {
		System.out.println("eat phuckas");
	}
}

class Mumbai extends WestBengal{
	public void eat() {
		System.out.println("eat golgappa");
	}
}


class Chennai extends Mumbai{
	public void eat() {
		System.out.println("eat dosa");
	}
}




public class Polymorphism_Overriding {

	public static void main(String[] args) {
		
		Mumbai m=new Chennai(); // when method overriding is happening and subclass object to superclass reference is assigned,
		                        //then it will call the subclass method as it's modified version.
		m.eat();

	}

}
