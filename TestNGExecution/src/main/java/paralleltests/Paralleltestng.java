package paralleltests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Paralleltestng {
	
@Parameters({"browsers"})
@Test
public void testBrowsers(String browser){
	
System.out.println(browser);	
	
}

}
