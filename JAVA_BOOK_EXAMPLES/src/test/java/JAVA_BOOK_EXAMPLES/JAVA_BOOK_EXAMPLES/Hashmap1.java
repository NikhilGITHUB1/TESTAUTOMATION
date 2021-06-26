package JAVA_BOOK_EXAMPLES.JAVA_BOOK_EXAMPLES;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//we define hashmap
//we apply the generics type
//to add values in hashmap, we use the put method (key,value)
//we use Set with hashmap to get the keys, using the keyset method
//we further use Iterator and apply on that
//and using the iterator, hasnext and next method, and map.get method, we are able to fetch the values


public class Hashmap1 {
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> map = new HashMap<>();
		map.put(1,"nikhil");
		map.put(2,"is");
		map.put(3,"a");
		map.put(4,"coder");
		
		
		Set<Integer> set=map.keySet();
		Iterator<Integer> it=set.iterator();
		
		while(it.hasNext()) {
			//System.out.println(it.next());
			System.out.println(map.get(it.next()));
		}
		
		
	}

}
