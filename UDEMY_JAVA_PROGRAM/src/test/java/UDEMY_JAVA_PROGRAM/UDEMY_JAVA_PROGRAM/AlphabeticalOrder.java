package UDEMY_JAVA_PROGRAM.UDEMY_JAVA_PROGRAM;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Question : fetch the list of states, and if they are not in alphabetical order, then  fail the test cases

public class AlphabeticalOrder {
	
	public static void main(String[] args) {
		
	    ArrayList<Character> sample = new ArrayList<Character>();

		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Seetha");
		names.add("Sudhin");
		names.add("Swetha");
		names.add("Neethu");
		names.add("Ananya");
		names.add("Athira");
		names.add("Bala");
		names.add("Tony");
		names.add("Karthika");
		names.add("Nithin");
		names.add("Vinod");
		names.add("Jeena");
		
	
		//names.sort(String::compareToIgnoreCase);
		
     
	      for(String name : names) {
			
			//get the 1st char of the name , and store in another list
			sample.add(name.charAt(0));
			}
	      
		
		System.out.println(sample);
		
		
	   for(int i=0;i<sample.size();i++) {
		   if(i==sample.size()-1)
			  break;
		   
		   
		   if(sample.get(i) > sample.get(i+1)) {
			   System.out.println("not ordered");
			   break;
		   }
		   else  if(sample.get(i) < sample.get(i+1)) {
			  
			   System.out.println("ordered");
			   break;
		   }
		  
	   }
	   

		
		
		}
	
	
	
	
	


		
	}


