package dockerusingbat;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class DockerStart {
	
	public void startDocker() throws IOException, InterruptedException {
		
		
//		String cmd1 = "chmod 777 dockerbat.sh";
//		Process p1 = Runtime.getRuntime().exec(cmd1);
//		ProcessBuilder pb = new ProcessBuilder("./dockerbat.sh");
//		Process p = pb.start();
		

		Process p = new ProcessBuilder("./dockerbat.sh").start();
		p.waitFor(10,TimeUnit.SECONDS);
		
		boolean flag=false;
	  
	    String file1 ="output.txt";
	    BufferedReader br = new BufferedReader(new FileReader(file1));
	    String currentLine = br.readLine();
	    
	    Calendar c = Calendar.getInstance(); // getting the calendar instance which gives the current time
	    c.add(Calendar.SECOND, 30); // adding 30 seconds to the current time
	    long stopnow = c.getTimeInMillis(); // storing the same time in milliseconds
	  
	    while(System.currentTimeMillis() < stopnow) {
	    	if(flag) {                               // if flag true break out of the loop
	    		break;
	    	}
	    
	    while(currentLine!=null && !flag)           //here the !flag makes the flag as true and user enters the loop
	    	{
	        if(currentLine.contains("The node is registered to the hub and ready to use"))
	        {
	            System.out.println("Found the register");
	            flag=true;
	            break;
	        }
	       
	        currentLine = br.readLine();
	    }
	    br.close();

	    }
	    
	    Assert.assertTrue(flag);
	    new ProcessBuilder("./scalechrome.sh").start();
	
	}
	

	}


