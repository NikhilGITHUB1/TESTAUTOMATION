package predicate;

import java.util.function.Predicate;

public class TestMain {

	public static void main(String[] args) {
		
		Predicate<Integer> p1 = n -> (n > 2);
		Predicate<Integer> p2 = n -> (n < 10);
		
		System.out.println(p1.test(5));
		System.out.println(p1.and(p2).test(5));
		
		System.out.println(p1.negate().test(5));

		
		
	}
	
}
