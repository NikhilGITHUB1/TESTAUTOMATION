package JAVA_BOOK_EXAMPLES.JAVA_BOOK_EXAMPLES;

public class ContinueLabelled {
	
	public static void main(String[] args) {
		int i=1;
		lp1 : while(i<=3) {
			
			System.out.println(i);
			
			lp2 : for(int j=1;j<=5;j++) {
				System.out.println("\t"+j);
				if(j==3) {
					i++;
					continue lp1;
				}
			}
			
		}
	}

}
