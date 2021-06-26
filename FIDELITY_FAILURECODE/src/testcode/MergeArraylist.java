package testcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeArraylist {
	
	public static void main(String[] args) {
		
	    int arr1[] = {4,5,10};
		int arr2[] = {8,6,9};
		
        List<Integer> list = new ArrayList<>(); 
        List<Integer> list1 = new ArrayList<>(); 

        
        for(int ls:arr1) {
        	list.add(ls);
        }
        
        
        for(int ls:arr2) {
        	list1.add(ls);
        }
        
        System.out.println(list);
        System.out.println(list1);
        
        list.addAll(list1);
        System.out.println(list);
        
        
     Collections.sort(list);
     System.out.println(list);

        	
        }
        

}
	 



