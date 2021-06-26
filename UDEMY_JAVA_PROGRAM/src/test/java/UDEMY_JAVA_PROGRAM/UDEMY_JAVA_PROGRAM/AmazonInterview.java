package UDEMY_JAVA_PROGRAM.UDEMY_JAVA_PROGRAM;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AmazonInterview {
	
	//static int count=0;

	public static void main(String[] args) {
		
		int[] arr = {4,5,5,5,4,6,6,6,9};
		ArrayList<Integer> ls = new ArrayList<Integer>();
		HashMap<Integer,Integer> m=new HashMap<Integer,Integer>();
		int count=0;
		
		//use a for loop
		//use arraylist
		//use contains method
		
		for(int i : arr) {
			
			if(ls.contains(i)) {
				count++;
				//m.put(i,count);
				
			}
			else {
			
				ls.add(i);
			    count++;
			    m.put(i, count);
			}
				
		}
		System.out.println(m);
	
			
		}
		
	}
	


