package GEEKFORGEEKS.GEEKFORGEEKS;

class SubsequenceString {

	public static boolean func(String str1, String str2) {
		
		int j=0;
		for(int i=0; i<str1.length() && j<str2.length();i++) {
			
			if(str1.charAt(i)==str2.charAt(j)) {
				j++;
			}
			
		}
			 
		return (j==str2.length());
		
	}
	


	
	public static void main(String[] args) {
		
		String str1="ABCDEF";
		String str2="AED";
		
		boolean state=func(str1,str2);
		System.out.println(state);
		
		
	}


	
}

	

	
