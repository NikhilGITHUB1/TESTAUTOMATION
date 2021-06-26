package dataproviders;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataproviders {

@DataProvider(name="dp1")
public static Object[][] getData(Method m){
	Object data[][]	= null;	
if(m.getName().equals("login")) {	

data=new Object[2][2];

data[0][0]= "nikhil";
data[0][1]="nikhil1";

data[1][0]="nikhi2";
data[1][1]="nikhi3";
}

else if(m.getName().equals("userReg")) {		
	data=new Object[2][3];

	data[0][0]= "nik";
	data[0][1]="kan";
	data[0][2]="33234323443";

	data[1][0]="kal";
	data[1][1]="kum";
	data[1][2]="23453434";

	}
return data;
}
}



