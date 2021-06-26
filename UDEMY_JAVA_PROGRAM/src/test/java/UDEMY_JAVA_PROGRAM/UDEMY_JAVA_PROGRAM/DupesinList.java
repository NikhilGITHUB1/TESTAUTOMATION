package UDEMY_JAVA_PROGRAM.UDEMY_JAVA_PROGRAM;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DupesinList {
	
	
public static void main(String[] args) {
	
	ArrayList<String> names = new ArrayList<String>();
	names.add("Seetha");
	names.add("Sudhin");
	names.add("Swetha");
	names.add("Neethu");
	names.add("Ananya");
	names.add("Athira");
	names.add("Bala");
	names.add("Swetha");
	names.add("Karthika");
	names.add("Nithin");
	names.add("Vinod");
	names.add("Seetha");
	
	//dupes via set
	
	HashSet<String> hs =new HashSet<String>();
	
	for(String name : names) {
		if(hs.add(name)==false) {
			System.out.println(name);
		}
	}
	
	
	// dupes via map	
	
	HashMap<String,Integer> map = new HashMap<String,Integer>();
	//int count=0;
	
	for(String name:names) {
		
	 Integer count = map.get(name);
		
	 if(count==null) {
		 map.put(name, 1);
	 }
	 else 
		 map.put(name, ++count);
		 
	 }
	
	
    Set<Map.Entry<String,Integer>> entryset = map.entrySet();
	
    for (Map.Entry<String, Integer> entry: entryset)
    {
	     if(entry.getValue()>1) {
	    	 System.out.println(entry.getKey());
	     }
	   
    }
	
	
	
}

}
