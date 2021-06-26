package JAVA_BOOK_EXAMPLES.JAVA_BOOK_EXAMPLES;

import java.util.HashMap;

//java code to count each chars from a string

public class CharsInString {
	
	public static void main(String[] args) {
		
	String str="abrakadabra";
	
	HashMap<Character,Integer> map = new HashMap<>();
	
	for(int i=str.length()-1;i>=0;i--) {
		
		if(map.containsKey(str.charAt(i))) {
			
			int count=map.get(str.charAt(i));
			map.put(str.charAt(i),++count);
			System.out.println(map);
		}
		else {
			map.put(str.charAt(i),1);
		}
	    }
			System.out.println(map);
		}
	
		
	
	
}
	


