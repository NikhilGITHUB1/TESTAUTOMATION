package JAVA_BOOK_EXAMPLES.JAVA_BOOK_EXAMPLES;

// How to separate zeros from non-zeros in an array

public class SeparateZeroNonZero {
	static int arr[]={14, 0, 5, 2, 0, 3, 0};

	public static void main(String[] args) {
		
		int temp;
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr.length;j++) {
				
				if(arr[i] < arr[j]) {
					
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
					
					
				}
				
			}
			
			
		}
		
		for(int i:arr) {
			System.out.println(i);
		}
		
	}

}
