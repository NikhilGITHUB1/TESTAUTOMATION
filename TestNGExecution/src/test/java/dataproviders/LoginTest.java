package dataproviders;

import org.testng.annotations.Test;

public class LoginTest {

	@Test(dataProviderClass=Dataproviders.class,dataProvider="dp1")
	public void login(String uname,String pwd) {
	System.out.println(uname + "---------"+pwd);	
	}
	
	
	@Test(dataProviderClass=Dataproviders.class,dataProvider="dp1")
	public void userReg(String fname,String lname,String email) {
	System.out.println(fname + "---------"+lname+"--------"+email);	
	}
	
}
