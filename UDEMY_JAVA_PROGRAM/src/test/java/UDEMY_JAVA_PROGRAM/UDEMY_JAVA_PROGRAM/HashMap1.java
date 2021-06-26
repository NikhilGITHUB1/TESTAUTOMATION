package UDEMY_JAVA_PROGRAM.UDEMY_JAVA_PROGRAM;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {
		
		HashMap<Integer,String> m= new HashMap<Integer,String>();
		m.put(0, "a");
		m.put(1, "b");
		m.put(2, "c");
		
		System.out.println(m.get(1));
		//m.remove(2);
		System.out.println(m);
		
		Set<Entry<Integer, String>> set= m.entrySet();
		Iterator<Entry<Integer, String>> it= set.iterator();
		
		while(it.hasNext()) {
			
			//System.out.println(it.next());
			Map.Entry entry = (Map.Entry)it.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());

			
			
			
		}
		
		
		
		
		
		
	}
	
}
	