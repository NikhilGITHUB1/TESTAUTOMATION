package consumer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class TestMain {

	public static void main(String[] args) {

		List<String> ls = new ArrayList();
		
		ls.add("nikhil");
		ls.add("kanojia");
		
		Consumer<String> c1 = (s) -> System.out.println(s);
		//ls.forEach(c1);
		
		Consumer<String> c2 = (s) -> System.out.println("this is db:"+s);
		Consumer<String> c3= (s) -> System.out.println("this is log:"+s);
		
		
		//This is consumer chaining
		ls.forEach(c2.andThen(c3));
		
		Map<String, Consumer<String>> map = new HashMap();
		
		map.put("db", c2);
		map.put("log", c3);
		
		ls.forEach(map.get("db"));



		
		
	}

}
