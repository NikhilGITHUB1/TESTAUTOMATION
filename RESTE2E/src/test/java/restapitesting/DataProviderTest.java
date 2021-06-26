package restapitesting;

import org.testng.annotations.DataProvider;

public class DataProviderTest {

	@DataProvider(name="data")
	public Object[][] dataProvider() {
		
		Object[][] data =new Object[2][3];
		
		data[0][0]="kaliya";
		data[0][1]="kaliya";
		data[0][2]=6;
		
		data[1][0]="test";
		data[1][1]="karo";
		data[1][2]=7;
		
		
		return data;
				

	}

}
