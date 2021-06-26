package UDEMY_JAVA_PROGRAM.UDEMY_JAVA_PROGRAM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//import java.util.List;

public class CompareIntegerList {
	
	public static void main(String[] args) {
		
		
		ArrayList<Integer> ls1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));
		ArrayList<Integer> ls2 = new ArrayList<Integer>(Arrays.asList(11,12,13,14,15,16,17,18,19,20,21,22,23,24,25));
		
		List<Integer> difference = ls1.stream()
			    .filter(aObject -> ls2.contains(aObject))
			    .collect(Collectors.toList());
		
		System.out.println(difference);
		
		List<Integer> difference1 = ls1.stream()
			    .filter(aObject -> !ls2.contains(aObject))
			    .collect(Collectors.toList());

		System.out.println(difference1);

		
	}

}
