package parameterization;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class TestParameterization {
	
@Test(dataProvider="setData")
public void getData(String un,String pwd) {
System.out.println("username:"+un);	
System.out.println("password:"+pwd);	
}



@DataProvider
public Object[][] setData(){
	
Object[][] data=new Object[3][2];
data[0][0]="abc";
data[0][1]="pass1";

data[1][0]="abc";
data[1][1]="pass1";

data[2][0]="abc";
data[2][1]="pass1";


return data;	
	
	
	
}


}