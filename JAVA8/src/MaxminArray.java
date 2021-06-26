
public class MaxminArray {

	public static void main(String[] args) {

		int arr[] = { 111, 2, 5, 6, 777, 33, 55, 9, 12, 72 };

		int max = arr[0], min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] > max) {
				max = arr[i];
			}
			else if(arr[i] < min) {
				min = arr[i];
			}
			
		}
      System.out.println(max);
      System.out.println(min);

	}
	

}
