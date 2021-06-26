package basicsCode;

class Sample2{
	
	int y=66;
	Sample2(){
		
	this(123);
	System.out.println("this will be 3rd");
		
	}
	
	
	Sample2(int j){
		
	this(456,786);
	System.out.println("this will be 2nd");
    System.out.println(j);
		
	}
	
	Sample2(int i, int k){
	
	System.out.println("this will be 1st");
	System.out.println(i+" and "+k);	
		
	}
	
	public void display() {
		System.out.println(this.y);
	}
	
}


public class thisinConstructor {

	public static void main(String[] args) {

		//new Sample2();
		new Sample2().display();		
		System.out.println("this is last");

		
		
		
	}

}
