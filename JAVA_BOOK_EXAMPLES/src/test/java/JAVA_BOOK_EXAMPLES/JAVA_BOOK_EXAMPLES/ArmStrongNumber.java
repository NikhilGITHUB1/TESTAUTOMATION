package JAVA_BOOK_EXAMPLES.JAVA_BOOK_EXAMPLES;

import java.util.ArrayList;


//take any number,say 153
//2nd is - you want to extract each values of a num 
//use modulo to extract each number
//extracted number , can be multiplied 3 times and added to the total
//divide the 153, to get the 1st 2 digits
//repeat the loop, until num is 0

public class ArmStrongNumber {
	
	
	public static void main(String[] args) {
		
		int num=153;
		int temp=num;
		ArrayList<Integer> ls=new ArrayList<Integer>();
		int total=0;

		
		while(num!=0) {
			
			int r=num%10;
			total=total + r*r*r;

			num=num/10;
			//ls.add(r);
			
			
			
		}

		System.out.println(total);
		
		if(total==temp) {
			System.out.println("armstrong no");
		}
		
		
		
	}

}
