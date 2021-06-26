package JAVA_BOOK_EXAMPLES.JAVA_BOOK_EXAMPLES;

import java.util.Arrays;

public class Anagram {
	
	//mother in law
	//hitler woman
	
	//we are removing the white spaces via by replaceAll method, where we are giving "//s"
	//next we are checking the length if the length of the array matches, via status 
	//next we are converting it to char array with tochararray method
	//apply array.sort
	//apply array.equals, and storing the value in the boolean variable
	//Since "\\s" means s single space in unicode hence it replaces every single space with "" 
	
	
	public static void main(String[] args) {
		
		String s="mother in law";
		String s2="hitler woman";
		
		String s_updated=s.replaceAll("\\s", "");
		String s2_updated=s2.replaceAll("\\s", "");
		
		System.out.println(s_updated);
		System.out.println(s2_updated);
		
		boolean status=true;
		
		if(s_updated.length()!=s2_updated.length()) {
			status=false;
		}
		else {
			char[] arr1=s_updated.toCharArray();
			char[] arr2=s2_updated.toCharArray();

			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			status=Arrays.equals(arr1, arr2);	
			
			System.out.println(arr1);
			System.out.println(arr2);

		}
		
		if(status) {
			System.out.println("it's an anagram");
		}
		else {
			System.out.println("not an anagram");
		}
		
		
		
		

		

		
		
		
		
		
	
		
		
		
		
		
				
		
		
		
	}
	

}
