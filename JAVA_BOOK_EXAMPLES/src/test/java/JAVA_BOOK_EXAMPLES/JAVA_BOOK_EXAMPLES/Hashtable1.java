package JAVA_BOOK_EXAMPLES.JAVA_BOOK_EXAMPLES;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Hashtable1 {
	
	//hashtable does not preserve the order, use LinkedHashMap instead
	
	public static void main(String[] args) {
		
		//Hashtable<Integer,String> ht=new Hashtable<>();
		LinkedHashMap<Integer,String> ht=new LinkedHashMap<>();

		
		ht.put(1, "abc");
		ht.put(2, "sdfds");
		ht.put(3, "sdfdsd22");
		ht.put(4, "ncvnvlo");

		Set<Integer> st=ht.keySet();
		
		Iterator<Integer> it= st.iterator();
		
		while(it.hasNext()) {
			System.out.println(ht.get(it.next()));
			
			
		}
		
		
		
		
		
		//=======================================================//
		//for TreeMap, it will print the data in sorted order
		//better to use Map.entry for this.
		
		TreeMap<Integer, String> tm= new TreeMap<Integer, String>();
	      tm.put(10, "Chaitanya");
	      tm.put(1, "Ajeet");
	      tm.put(11, "Test");
	      tm.put(9, "Demo");
	      tm.put(3, "Anuj");
	      
	      for(Map.Entry m:tm.entrySet()){    
	          System.out.println(m.getKey()+" "+m.getValue());    
	         }    
	   
	}
	
}	
		
	      
		
	


