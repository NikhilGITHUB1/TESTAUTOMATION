package biconsumer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class TestMain {
	
	public static void main(String[] args) {
		
		Consumer<String> consumer1=(s) -> System.out.println(s);
		Consumer<String> consumer2=(s) -> System.out.println(s);
		
		BiConsumer<String,Integer> bc = (b,c) -> {
			System.out.println(b);
			System.out.println(c);
		};
		
		bc.accept("nikhil", 33);
		
		Map<String,Consumer<String>> map = new HashMap<>();
		map.put("string", consumer1);
		map.put("integer", consumer2);
		
		map.forEach((k,v) -> System.out.println(k));
		
		
		
	}

}
