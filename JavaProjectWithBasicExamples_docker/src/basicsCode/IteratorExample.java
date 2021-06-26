package basicsCode;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorExample {

	public static void main(String[] args) {
		

		HashSet hashset=new HashSet();
		hashset.add("test1");
		hashset.add("test1");
		hashset.add(18);
		hashset.add(18);
		//hashset.add(new Hash().test());
		
		Iterator itr=hashset.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
