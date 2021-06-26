package testcode;

import java.util.Scanner;

public class primeNumbers {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int n=2;
		
		while(true) {
			n++;
			if(input%n==0 && input==n) {
				System.out.println("prime");
			break;
			}
			else if(input%n==0){
				System.out.println("not prime");
				break;
			}
			}
			
		}
		
	}


