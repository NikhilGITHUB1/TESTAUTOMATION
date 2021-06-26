package GEEKFORGEEKS.GEEKFORGEEKS;

import java.util.Scanner;

//here we have some work which takes constant time , and some does depend upon n
//so the time complexity = c2n + c3

public class SumOfFirstNNaturalNumbers {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number:");
		int n = s.nextInt();
		int sum=0;
		
	    for(int i=1;i<=n;i++) {
	      
	    	sum =sum +i;
	    
	    }
	    
	    System.out.println(sum);

		
		//we needed 3 variables to compute this, sum, i and n
	    
	
		
		
		
		
	}

}
