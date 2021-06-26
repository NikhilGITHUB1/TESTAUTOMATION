package invocationandthreadpool;

import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Testinvocationcount extends Basetest{
	
@Test(invocationCount=5)
public void test() {
	
//System.out.println("run browser");
driver = getDriver("chrome");	
driver.get("http://www.google.com");

  }

@AfterMethod
public void tearDown(){

	Set<String> handles=driver.getWindowHandles(); 
	//System.out.println(handles);
	Iterator<String> iterate=handles.iterator();

	while(iterate.hasNext()) { 
	//System.out.println("hello");	
	String second_window=iterate.next();
	driver.switchTo().window(second_window);
	//System.out.println(driver.getTitle()); 
	driver.close();
 }

//driver.quit();

}

}
