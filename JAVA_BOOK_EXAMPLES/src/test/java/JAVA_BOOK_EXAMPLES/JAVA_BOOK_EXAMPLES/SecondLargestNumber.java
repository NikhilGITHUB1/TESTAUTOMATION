package JAVA_BOOK_EXAMPLES.JAVA_BOOK_EXAMPLES;

public class SecondLargestNumber {

	public static void main(String[] args) {

		int arr[] = { 1, 3, 554, 665, 43, 3, 422 };
		int max = arr[0];
		int secondmax=arr[1];

		for (int i = 0; i < arr.length - 1; i++) {

			if (arr[i] > max) {
				
				secondmax=max;
				max = arr[i];

			}
		}

		System.out.println(max);
		System.out.println(secondmax);


	}
}
