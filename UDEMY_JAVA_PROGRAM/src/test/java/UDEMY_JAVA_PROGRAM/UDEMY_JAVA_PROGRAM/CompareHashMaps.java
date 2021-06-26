package UDEMY_JAVA_PROGRAM.UDEMY_JAVA_PROGRAM;

import java.util.HashMap;
import java.util.HashSet;

public class CompareHashMaps {
	
	public static void main(String[] args) {
		
		HashMap<String,Integer> map1 = new HashMap<String,Integer>();
		HashMap<String,Integer> map2 = new HashMap<String,Integer>();

		map1.put("abc", 123);
		map1.put("xyz", 456);
		
		map1.put("abc", 005);
		map1.put("xyz", 006);
		
		
        HashSet<Integer> set1 = new HashSet<>(map1.values());
		
        HashSet<Integer> set2 = new HashSet<>(map2.values());
        
        System.out.println("map1 values == map2 values : "
                + set1.equals(set2));

		
	}

}
