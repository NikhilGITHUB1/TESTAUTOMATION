package basicsCode;

import java.util.HashMap;

public class Collection_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "one");
		hm.put(2,"two");
		
		System.out.println(hm.keySet());
		System.out.println(hm.values());	

	}

}
