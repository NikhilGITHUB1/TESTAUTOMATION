package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class StreamFilter {
	
		//stream is collection of strings
		//stream has method called filter, filter will filter based on the condition, so we have to tell on which condition we
		//want to filter
		//filter we wll pass lambda expression, left side is the parameter, right side is the action you want to perform on the parameter
		//before using filter methods, you have to convert your arraylist to stream
		//streams are powerful and they wll scan your whole arraylist collection parallely.
		//steps are : create a stream, intermediate operation , followed by terminal operation which is count here.
		//there is no life of intermediate operation if there is no terminal operation
		//intermediate operation will execute only if the terminal operation returns True.
		//if more than one line u can add code in body in curly braces
		//we will use foreach (which will also use lambda expression) along with filter to print all the names 
		// map will help to modify our stream filter results
	    // sorted method will be used to sort the stream
		//concat method will be used to concat 2 streams
		// anymatch method will help to match anything which is present on the stream or list, it will return the condition is either true or false
		// collect method will convert the stream back to the new list
		// distinct method will help to print distinct numbers
	
	
	

    @Test
	public void streamFilter() {
    	
    	ArrayList<String> names = new ArrayList<String>();
    	names.add("Ak ganguly");
    	names.add("GK");
    	names.add("kanojia");
    	names.add("Aakura");
    	names.add("gan");
    	
    	Long count = names.stream().filter(s -> s.startsWith("A")).count();
    	System.out.println(count);
    	
    	Long d = names.stream().filter(s -> {
    		s.startsWith("A");
    		return false;
    	
    	}).count();
    	System.out.println(d);  //this will return 0, as the intermediate operation returns false
    	
    	
    	Stream.of("nikihl","nik").filter(s -> s.startsWith("n")).count(); // for practice you can create stream via Stream pkg this, instead of creating a list
		
    	names.stream().filter(s -> s.length()>4).forEach(s -> System.out.println(s));
    	names.stream().filter(s -> s.length()>4).limit(1).forEach(s -> System.out.println(s));
    	
    	//MAPS
    	//print the names having last letter as "a" with uppercase
    	
    	//Stream.of("nikhil","kanojia","babla","genda","monu").filter(s -> s)
    	System.out.println();
    	names.stream().filter(s -> s.endsWith("a")).map(s->s.toUpperCase()).forEach(s -> System.out.println(s));
    	
    	//print names which have first letter as "A" to uppercase and sorted
    	System.out.println();
    	names.stream().filter(s -> s.startsWith("A")).sorted().map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
    	
    	//merge or concat streams
    	
    	ArrayList<String> names1 = new ArrayList<String>();
    	names1.add("Ak ganguly7");
    	names1.add("GK7");
    	names1.add("kanojia7");
    	names1.add("Aakura7");
    	names1.add("gan7");
    	
    	
    	System.out.println();
    	Stream<String> newstream = Stream.concat(names.stream(),names1.stream());
    	//newstream.sorted().forEach(s -> System.out.println(s));
    	
    	//match streams
    	boolean flag = newstream.anyMatch(s -> s.equalsIgnoreCase("Aakura7"));
    	System.out.println(flag);
    	
    	//collect
    	System.out.println();
    	List<String> student = Stream.of("nik","kala","samson","uthhapa","aila").filter(s -> s.endsWith("a")).map(s -> s.toUpperCase())
    			               .collect(Collectors.toList());
    	
    	student.stream().forEach(s->System.out.println(s));
    	
    	//sort the number and print distict or unique number
    	
    	List<Integer> value = Arrays.asList(1,3,5,7,5,4);
    	value.stream().sorted().distinct().forEach(s -> System.out.println(s));
    	
    	//sort the number and print distict number, and print othe 3rd number
    	System.out.println();
    	List<Integer> ls = value.stream().sorted().distinct().collect(Collectors.toList());
    	System.out.println(ls.get(3));
    	

    	
    	
    	
    	
    			               
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	

    	
    	

    	
    	
	}
	
	
}
