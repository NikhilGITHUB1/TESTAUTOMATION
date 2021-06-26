package JAVA_BOOK_EXAMPLES.JAVA_BOOK_EXAMPLES;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;



public class StringTokenizer1 {

public static void main(String[] args) throws IOException {
	
	ArrayList<String> list=new ArrayList<String>();
	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the string");

	String str=bf.readLine();
	
	
	StringTokenizer token=new StringTokenizer(str,",");
	
	while(token.hasMoreTokens()) {
		list.add(token.nextToken());
		
	}
	
	
	
	for(Object ls:list) {
		System.out.println(ls);

	}
	
	
	
}

}
