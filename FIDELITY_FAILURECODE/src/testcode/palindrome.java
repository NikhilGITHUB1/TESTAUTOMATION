package testcode;

import java.util.Scanner;

public class palindrome {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int input1=input;
		int rev=0;
		
		while(input>0) {
			
			int lastval = input%10; //3,2,3

			input= input/10; //32,2,0
			rev = rev*10+lastval; //3,30+2=32

		}
			if(rev==input1) {
				System.out.println("reversed");
				
			}
			else{
				System.out.println("not reversed");
			}
	 
		
		
	}

}
