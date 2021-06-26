package JAVA_BOOK_EXAMPLES.JAVA_BOOK_EXAMPLES;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadvsReadline {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter id");
		int id=Integer.parseInt(br.readLine());
		
		System.out.println("enter sex:M/F");
		char sex=(char) br.read();
		
		System.out.println("enter name");
		String name=br.readLine();
		
		System.out.println("-----------------");
		System.out.println(id);
		System.out.println(sex);
		System.out.println(name);
		
		System.out.println("-----------------");
		
		//fix for the above issue
		System.out.println("Enter id1");
		int id1=Integer.parseInt(br.readLine());
		
		System.out.println("enter sex1:M/F");
		char sex1=(char) br.readLine().charAt(0);
		
		System.out.println("enter name1");
		String name1=br.readLine();
		
		System.out.println("-----------------");
		System.out.println(id1);
		System.out.println(sex1);
		System.out.println(name1);
		

		
		
	}

}
