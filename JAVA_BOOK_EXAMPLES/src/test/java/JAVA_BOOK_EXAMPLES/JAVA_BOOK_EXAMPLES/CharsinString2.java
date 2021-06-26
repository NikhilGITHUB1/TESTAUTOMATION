package JAVA_BOOK_EXAMPLES.JAVA_BOOK_EXAMPLES;


//int endA = a.length() - 1;
//int endB = b.length() - 1;
//StringBuilder str = new StringBuilder();
//
////add values to str till both the strings are not covered
//while(endA>-1 && endB>-1){
//    str.append(a.charAt(endA--));
//    str.append(b.charAt(endB--));
//}
//
//add all chars of a if any is remaining
//while(endA>-1){
//   str.append(a.charAt(endA--));
//}
//
//add all chars of b if any is remaining
//while(endB>-1){
//   str.append(b.charAt(endB--));
//}
//System.out.println(str);

public class CharsinString2 {
	
	public static void main(String[] args) {
		
		String a="abra";  //arba
		String b="kadabra";//arbadak  // aarrbbaadak
		
		int endA=a.length()-1;
		int endB=b.length()-1;
		
		StringBuilder str=new StringBuilder();
		
		while(endA>-1 && endB>-1) {
			
			str.append(a.charAt(endA--));
			str.append(b.charAt(endB--));
			
		}
		
		
		while(endA>-1) {
			str.append(a.charAt(endA--));
		}
		
		while(endB>-1) {
			str.append(b.charAt(endB--));
		}
		
		System.out.println(str);
		
	}
	
	

}
