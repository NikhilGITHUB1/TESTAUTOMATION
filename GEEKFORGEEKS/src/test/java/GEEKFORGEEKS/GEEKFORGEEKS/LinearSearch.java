package GEEKFORGEEKS.GEEKFORGEEKS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;



//using Arraylist, we are trying to find the index , even if there are duplicate index
//we tried using index of, but didn't worked for us
//then 

public class LinearSearch {
	
	public static List<Integer> test(int arr1[],int t) {
		
	
		 int len = arr1.length;
		 
		 ArrayList<Integer> kk = new  ArrayList<Integer>();
		 
		 for(int i:arr1) {
			 kk.add(i);
		 }
		 
		 
	        List<Integer> rrr= kk.stream().filter(i -> t==arr1[i]).collect(Collectors.toList());
	        //System.out.println(rrr);
	        		//findAny().
	        		//orElse(-1);
			return rrr;
	}
	
	
	//using Arraylist
	public static ArrayList<Integer> test1(int arr[],int t) {
	        
		    int count=-1;
		
	        ArrayList<Integer> clist = new ArrayList<>();
	        ArrayList<Integer> clistindex = new ArrayList<>();

	        
	        for (int i : arr) {
	            clist.add(i);
	            
	        }
	        
	        
	        
	            
	        for(int i=0;i<clist.size();i++) {
	        	
	        	if(!clist.contains(t)){
	    	        ArrayList<Integer> notpresent = new ArrayList<>();
	    	        notpresent.add(-1);
	    	        return notpresent;
	        	}
	        	
	           count++;
	           if(clist.get(i)==t)
	            clistindex.add(count);
	        }

	        
			return clistindex;
	    }
		
    
		
		
		
	
	
	public static void main(String[] args) {
		
		int arr[]= {10,40,20,30,10,40};
		int arr1[]= {10,40,20,30,10,40};

		int x=30;
		
		Arrays.sort(arr);
		
		for(int a:arr) {
			System.out.print(a + " ");
		}
		
		System.out.println();
		
		
		
		
		ArrayList<Integer> ar=test1(arr, x);
	
		for(int i:ar) {
			System.out.println(i);
		}
		
	

		
		
		
		
	}

}
