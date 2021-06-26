package GEEKFORGEEKS.GEEKFORGEEKS;

import java.util.Scanner;

//this program does constant work , represented by C1
//it does not depends upon the value of n , whatever value u pass, say n=100 or 10000,
//then the no of operations remains constant, it doesn't change with the value of n
//here we are doing 3 operations

public class SumOfFirstNNaturalNumbers2 {
	static int n;
	
	public static int funcSumOfFirstNNaturalNumbers2(int n){
		
		
		return n*(n+1)/2;
		
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter a number:");
		n = s.nextInt();
		System.out.println(funcSumOfFirstNNaturalNumbers2(n));

	}
	
	

}
