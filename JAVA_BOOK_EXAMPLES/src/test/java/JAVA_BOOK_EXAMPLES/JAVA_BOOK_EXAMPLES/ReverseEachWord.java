package JAVA_BOOK_EXAMPLES.JAVA_BOOK_EXAMPLES;

import java.util.ArrayList;

//we took a string which has spaces
//we split the string, such that it gave an string array of words
//we took each word and reversed it
//at the end of the loop add it to reverse string variable
//run this loop multiple times, to create an array of string


public class ReverseEachWord {

	public static void main(String[] args) {

		String s = "Java Concept Of The Day";
		String reverseString = "";
        

			String[] words = s.split(" ");
			
            ArrayList<String> ls=new ArrayList<String>();
			
		    for(int i=0;i<words.length;i++) {
		    	
		    	String word=words[i];
		        String reverseword="";
		    	
		    	for(int j=word.length()-1;j>=0;j--) {
		    		
		    		reverseword=reverseword + word.charAt(j);
		    	}
		    	
		    	reverseString = reverseString + reverseword + " ";
		    	
		    }
				
			System.out.println(reverseString);
			
			
			


	}
}
