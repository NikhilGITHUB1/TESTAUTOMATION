package functioninterface;

import java.util.function.Function;

public class TestFunctionInterface {
	
	public static void main(String[] args) {
		
		Function<String,Integer> strlen = (s) -> s.length();
		Function<Integer,Integer> square = (s) -> s * s;
		
		
		Function<Integer,Integer> plus2 = (s) -> s + 2;

		
		
		System.out.println(
		//strlen.apply("test is best")
		strlen.andThen(square).apply("kanojia"));
		
		
		//function  -> compose method
		System.out.println(plus2.andThen(square).apply(10));
		System.out.println(plus2.compose(square).apply(10));

		
		
		

		
		
	}

}
