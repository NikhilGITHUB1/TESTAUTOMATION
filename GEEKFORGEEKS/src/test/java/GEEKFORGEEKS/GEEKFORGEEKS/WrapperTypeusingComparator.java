package GEEKFORGEEKS.GEEKFORGEEKS;

import java.util.Arrays;
import java.util.Comparator;

class WrapperTypeusingComparatorTest implements Comparator<Integer>{


	public int compare(Integer o1, Integer o2) {

		return o1%2 - o2%2;
	}
	
	

}



public class WrapperTypeusingComparator{
	
	public static void main(String[] args) {
		
		Integer arr[] = {5,20,10,3,12};
		
		Arrays.sort(arr,new WrapperTypeusingComparatorTest());
	    
		System.out.println(Arrays.toString(arr));
		
	}
	
}