import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Practice1 {

	
	public static void main(String[] args) 
		 { 
		
		Consumer<String> c1 = (s) -> System.out.println(s.length());

		  String str = "geeksforgeeks"; 
		  
		  List<String> ls = new ArrayList<>();
		  ls.add(str);
		  
		  ls.forEach(c1);
		  
		  //int index = firstNonRepeating(str); 
		  


		
	}


}
