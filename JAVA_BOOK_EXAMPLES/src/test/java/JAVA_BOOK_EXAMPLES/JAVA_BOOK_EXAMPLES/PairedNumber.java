package JAVA_BOOK_EXAMPLES.JAVA_BOOK_EXAMPLES;

//How to find all pairs of elements in an array whose sum is equal to given number?

public class PairedNumber {

	public static void main(String[] args) {

		int[] arr = { 4, 5, 7, 11, 9, 13, 8, 12 };
		int givenNo = 20;
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {

			for (int j = 1; j < arr.length; j++) {

				sum = arr[i] + arr[j];
				if (sum == givenNo) {
					System.out.println("pairs are:" + arr[i] + "," + arr[j]);
				}

			}
		}

	}

}
