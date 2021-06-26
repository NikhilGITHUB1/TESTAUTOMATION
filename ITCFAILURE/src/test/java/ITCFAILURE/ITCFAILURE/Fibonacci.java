package ITCFAILURE.ITCFAILURE;

public class Fibonacci {

	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		int i=1;
		int sum=0;
		
		while(i<9) { // 0 1 1 2 3 5 8
			
			sum =a+b; //0,1= 1 : 
			System.out.println(sum);
			a=b;
			b=sum;
			i++;
			
			
			
		}

	}

}
