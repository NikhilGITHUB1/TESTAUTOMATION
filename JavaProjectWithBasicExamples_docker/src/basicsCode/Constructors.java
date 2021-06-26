package basicsCode;

class Sample1{
	int k;
	
	Sample1(){
		
		System.out.println("This is constructor");
	    k=123;
		
	}
	
	public void display() {
		System.out.println(k);
	}
	
	
	Sample1(int i){
		System.out.println(i);
		
	}
	
}


public class Constructors {

	public static void main(String[] args) {

		new Sample1();
		new Sample1();
		
		Sample1 obj= new Sample1();
		obj.display();
		
		//call constructor with arg
		Sample1 obj1=new Sample1(786);
		
		
		
		
	}

}
