package GEEKFORGEEKS.GEEKFORGEEKS;

public class ReverseEfficientMethod {
	
	public static boolean newFunction(String str){
		
		int begin=0;
		int end=str.length()-1;
		//boolean flag;
		
		
		while(begin < end) {
			
			if(str.charAt(begin)!=str.charAt(end)) {
				
				return false;
			}
			begin++;
			end--;
			
		}
		
		
		return true;
		
	}
	
	
	
	public static void main(String[] args) {
		
		String str = "ABCBA";
		boolean flag = newFunction(str);
		
		if(flag==true) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
		
		
		
		
		
		


		
		
		
	}

}
