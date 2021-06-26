package paralleltests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Paralleldataproviders {
	
@Test(dataProvider="getdata")
public void test(String browser) throws InterruptedException {
	
System.out.println(browser);
Thread.sleep(2000);	
}


@DataProvider(parallel=true)
public Object[][] getdata(){
	
Object[][] data=new Object[2][1];	

data[0][0]="Chrome";
data[1][0]="FF";

return data;

}

}
