package UDEMY_JAVA_PROGRAM.UDEMY_JAVA_PROGRAM;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {
	
	public static void main(String[] args) {
		
		Date d=new Date();
		
		SimpleDateFormat sdf=new SimpleDateFormat("M/dd/yyyy");
		System.out.println(sdf.format(d));
		
		System.out.println(d.toString());
		
		//Calendar
		
		Calendar c=Calendar.getInstance();
		SimpleDateFormat sf=new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");
		System.out.println(sf.format(c.getTime()));
		
		System.out.println(Calendar.DAY_OF_WEEK);

		
		
	}

}
