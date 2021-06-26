
public class CharsinString {
	
	public static void main(String[] args) {
		
		String s ="fdsfufruguersd";
		String m="";
		int count=0;
		
		for(int i=0;i<s.length();i++) {
			
			String k = m + s.charAt(i);
			
			if(k.contains("f"))
			count++;
		}
		
		System.out.println(count);
		
	}

}
