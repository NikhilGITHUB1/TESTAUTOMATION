
public class Reversenumber {
	
	public static void main(String[] args) {
		
		int num;
		int n=933;
		int rev=0;
		
		while(n!=0) {
		num = n%10;
		n=n/10;
		rev=rev*10+num;
		}
		
		System.out.println(rev);
		
	}

}
