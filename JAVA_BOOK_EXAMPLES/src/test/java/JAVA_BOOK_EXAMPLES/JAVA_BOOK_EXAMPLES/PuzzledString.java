package JAVA_BOOK_EXAMPLES.JAVA_BOOK_EXAMPLES;

import java.util.HashMap;

public class PuzzledString {
	 
	public static String c="";
	static int j;
	static int i;


	public static void main(String[] args) {
		
		String a="ram";  //  mar
		String b="laxman"; //namxal
		StringBuffer str=new StringBuffer("");
		
		
		
		StringBuffer sb=new StringBuffer(a).reverse();
		StringBuffer sb1=new StringBuffer(b).reverse();
		
		System.out.println(sb);
		System.out.println(sb1);
		
		HashMap<Character,Integer> map = new HashMap<>();
		
		for(int i=0;i<=sb.length()-1;i++) {
			
			for( j=i;j<sb1.length()-1;){
			    
				c+=Character.toString(sb.charAt(i))+Character.toString(sb1.charAt(j));
				break;
				
			}
			
		}
		
		for (int k=j+i; k >= 0; k--) {
			++j;
		    str.append(sb1.charAt(j));
		    
		}
		
	   System.out.println(c);
	   System.out.println(c+str);

		
	}

}
