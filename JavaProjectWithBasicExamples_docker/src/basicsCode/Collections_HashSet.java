package basicsCode;

import java.util.HashSet;

class Hash{
	 
public String test() {
	System.out.println("anybody can stop me");
	return "bye";
}
	
	
}



public class Collections_HashSet {

	public static void main(String[] args) {

		HashSet hashset=new HashSet();
		hashset.add("test1");
		hashset.add("test1");
		hashset.add(18);
		hashset.add(18);
		hashset.add(new Hash().test());
		
		for(Object obj:hashset) {
			System.out.println(obj);
			
		}
		
	}

	
	
	
}
