package test;

import java.util.Scanner;

class Result {

	public static void fizzBuzz(int n) {
		
		//if i is a multiple of both 3 and 5, print fizzbuzz
		
		for(int i=1;i<=n;i++) {
			
			if(i%3==0 && i%5==0) {
				System.out.println("fizzbuzz");
				}
			else if(i%3==0) {
				System.out.println("fizz");
			}
			else if(i%5==0) {
				System.out.println("buzz");
			}
			else {
				System.out.println(i);
			}
			
		}
	    
	    

	    }

	}

	public class Solution {
	    
	    public static void main(String args[]){
	    	
	    	Scanner sc =new Scanner(System.in);
	    	System.out.println("enter a number");
	    	int res = sc.nextInt();
	    	Result.fizzBuzz(res);
	    }
	        
	    }

		


