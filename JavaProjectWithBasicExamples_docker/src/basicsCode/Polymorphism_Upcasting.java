package basicsCode;

class Boy1{
	public void test1() {
		System.out.println("test1");
	}
}

class Boy2 extends Boy1{
	public void test2() {
		System.out.println("test2");
	}
}

class Boy3 extends Boy2{
	public void test3() {
		System.out.println("test3");
	}
}



public class Polymorphism_Upcasting {

	public static void main(String[] args) {
		
		Boy3 b3=new Boy3();
		b3.test1();
		b3.test2();
		b3.test3();
		
		System.out.println();
		Boy2 b2=new Boy3(); //auto upcasting
		b2.test1();
		b2.test2();
		//b2.test3() is not possible, as parent cannot call the child methods
		
		System.out.println();
		Boy3 boy3=(Boy3)b2; // explicit downcasting, so one thing many forms is polymorphism
		boy3.test1();
		boy3.test2();
		boy3.test3();
		
	}
	
	

}
