package GEEKFORGEEKS.GEEKFORGEEKS;

import java.util.ArrayList;
import java.util.List;

public class BinarySearch {

	public static ArrayList<Integer> searchBinary1stHalf(List<Integer> list, int x) {
		
		int count=-1;
        ArrayList<Integer> clistindex = new ArrayList<>();

		
		for(int i=0;i<list.size();i++) {
        	
        	if(!list.contains(x)){
    	        ArrayList<Integer> notpresent = new ArrayList<>();
    	        notpresent.add(-1);
    	        return notpresent;
        	}
        	
           count++;
           if(list.get(i)==x)
            clistindex.add(count);
        }

        
		return clistindex;
    }
	
	
	
	public static ArrayList<Integer> searchBinary2ndHalf(List<Integer> list, ArrayList<Integer> as, int x) {
		
		int count=(as.size()-1)/2;
		//System.out.println(count);
		
        ArrayList<Integer> clistindex = new ArrayList<>();

		
		for(int i=0;i<list.size();i++) {
        	
        	if(!list.contains(x)){
    	        ArrayList<Integer> notpresent = new ArrayList<>();
    	        notpresent.add(-1);
    	        return notpresent;
        	}
        	
           count++;
           if(list.get(i)==x)
            clistindex.add(count);
        }

        
		return clistindex;
    }
	


	
	

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 40, 50, 60, 70};
		
		
		ArrayList<Integer> as=new ArrayList<Integer>();
		
		for(int a:arr) {
			as.add(a);
		}
		

		int len = as.size();
		int x = 60;
		int mid=as.get(len/2);
		
		System.out.println(mid);
		System.out.println(as.subList((len+1)/2, len));
		System.out.println(as.subList(0,len/2));
		
		
				
		if(x==mid) {
			System.out.println("mid element found:"+x);
		}
		else if(x > mid) {
			ArrayList<Integer> searchedElementGreaterThanMid=searchBinary2ndHalf(as.subList((len+1)/2, len),as, x);
			System.out.println(searchedElementGreaterThanMid);
		}
		else if(x < mid) {
			ArrayList<Integer> searchedElementLessThanMid = searchBinary1stHalf(as.subList(0,len/2), x);
			System.out.println(searchedElementLessThanMid);


		}
		


		

	}



}
