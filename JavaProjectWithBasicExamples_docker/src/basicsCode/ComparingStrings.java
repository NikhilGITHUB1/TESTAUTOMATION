package basicsCode;

public class ComparingStrings {

	public static void main(String[] args) {
		
		String s="kutta";
		String s1="kutta";
		
		System.out.println(s==s1); //same reference
		
		String s2=new String("kutta");
		System.out.println(s==s2); //different reference

		
	}

}
