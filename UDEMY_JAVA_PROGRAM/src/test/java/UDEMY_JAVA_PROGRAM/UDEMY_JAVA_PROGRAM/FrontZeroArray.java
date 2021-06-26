package UDEMY_JAVA_PROGRAM.UDEMY_JAVA_PROGRAM;

import java.util.ArrayList;

public class FrontZeroArray {
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,0,3,7,5,0,22,0,11};
		
		ArrayList<Integer> ls1= new ArrayList<Integer>();
		ArrayList<Integer> ls2= new ArrayList<Integer>();

		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==0) {
				ls1.add(arr[i]);
			}
			else
				ls2.add(arr[i]);
			
		}
		
		
		System.out.println(ls1);
		System.out.println(ls2);
		
		ls1.addAll(ls2);
		
		System.out.println(ls1);

		
		
		
	}

}
