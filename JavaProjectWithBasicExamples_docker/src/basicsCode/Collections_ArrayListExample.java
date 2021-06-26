package basicsCode;

import java.util.ArrayList;

class Auto{

	public Auto() {
		
		System.out.println("This is a constructor, this will drive");
		
	}
	
	
public String toString() {
		return "hello";
	}
	
}




public class Collections_ArrayListExample {

	public static void main(String[] args) {

		ArrayList ls = new ArrayList();
		ls.add("help");
		ls.add(20);
		ls.add(1.11);
		ls.add(new Auto().toString());
		
		for(int i=0;i<ls.size();i++) {
			System.out.println(ls.get(i));
		}
		
		System.out.println();
		
		for(Object obj:ls) {
			System.out.println(obj);
		}
	
	}

}
