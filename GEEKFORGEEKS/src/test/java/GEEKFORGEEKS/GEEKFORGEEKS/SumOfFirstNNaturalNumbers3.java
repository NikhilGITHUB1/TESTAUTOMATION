package GEEKFORGEEKS.GEEKFORGEEKS;

import java.util.Scanner;

//here the inner loop runs n(n+1)/2 times , ie for i=1, the inner loop would run 1 time
//for i=2, 2times , i=n, n n times, which is the sum of 1st n natural nos
//and also we have constants, 
//so time complexity = c4n2 + c5n + c6


public class SumOfFirstNNaturalNumbers3 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number:");
		int n = s.nextInt();
		int sum=0;
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=i;j++) {
				sum++;
			}
			
		}
		
		System.out.println(sum);

	}

}
