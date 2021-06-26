package callable;

import java.util.concurrent.Callable;
import java.util.function.Supplier;

public class CallableInterface {
	
	public static void main(String[] args) throws Exception {
		
		Supplier<Double> supplier = () -> Math.random();
		Callable<Double> callable = () -> Math.random();
		
		test(callable);

		
		
	}

	private static void test(Callable c) throws Exception {

		System.out.println(c.call());
		
	}

}
