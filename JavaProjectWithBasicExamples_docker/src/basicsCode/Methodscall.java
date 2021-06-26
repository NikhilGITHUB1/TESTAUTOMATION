package basicsCode;

public class Methodscall {

	int i=1;
	
	public static void Sample() {
		System.out.println("This is Sample");
	}
	
	public static void Sample1(int i) {
		System.out.println("This is Sample1 " + i);
		//return i;
	}
	
	
	
	public static void main(String[] args) {

		Sample();
		Sample();
		
		Sample1(5);
		Sample1(600);

		
		
		
	}

}
