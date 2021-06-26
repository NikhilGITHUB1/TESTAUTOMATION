package UDEMY_JAVA_PROGRAM.UDEMY_JAVA_PROGRAM;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeWithParallelStream {
	
	public static void main(String[] args) {
		
		long count=Stream.iterate(0,n -> n+1).limit(10).
				   	filter(PrimeWithParallelStream::isPrime).
				   	peek(x -> System.out.println(x)).count();
        System.out.println("hi");
		System.out.println("total "+count);
	}
	
	
	public static boolean isPrime(int number) {
		
		if(number <= 1) 
			return false;
		else 
		  return !IntStream.rangeClosed(2,number/2).anyMatch(x -> number%x==0);
	
		
		
		
	}

}
