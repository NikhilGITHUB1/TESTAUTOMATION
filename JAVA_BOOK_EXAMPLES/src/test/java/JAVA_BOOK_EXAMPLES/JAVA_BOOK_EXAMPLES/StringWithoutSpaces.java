package JAVA_BOOK_EXAMPLES.JAVA_BOOK_EXAMPLES;

public class StringWithoutSpaces {
	
	public static void main(String[] args) {
		
		String str="fdf dfd fdf rerer  opoo";
		
		String nospace="";
		
		//int i=0;
		
		for(int i=0;i<str.length();i++){
			
			if(str.charAt(i)!=' ' && str.charAt(i)!='\t') {
			nospace=nospace + str.charAt(i);
			
		}
		}
			
		System.out.println(nospace);
		
	}

}
