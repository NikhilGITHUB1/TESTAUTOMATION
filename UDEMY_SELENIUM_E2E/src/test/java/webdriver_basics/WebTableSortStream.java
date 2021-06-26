package webdriver_basics;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTableSortStream {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "/Users/nikhilkanojia/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		List<String> price;

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		driver.findElement(By.xpath("//tr/th[1]")).click();

		List<WebElement> ls = driver.findElements(By.xpath("//tr/td[1]"));

		List<String> newlist = ls.stream().map(s -> s.getText()).collect(Collectors.toList());

		List<String> sortedlist = newlist.stream().sorted().collect(Collectors.toList());

		Assert.assertEquals(newlist, sortedlist);

		// get price of beans

		// tr/td[1]/following-sibling::td[1]

		// logic here is use the ls webelement rather than the driver webelement, such
		// that it will print 38

		for (int i = 0; i < ls.size(); i++) {

			if (ls.get(i).getText().contentEquals("Rice")) {

				System.out.println(ls.get(i).findElement(By.xpath("following-sibling::td[1]")).getText());
			}

		}

		//by using Streams
		do {
		List<WebElement> ls1 = driver.findElements(By.xpath("//tr/td[1]"));
		price =ls1.stream().filter(s -> s.getText().contains("Rice")).map(s -> verifyPrice(s)).collect(Collectors.toList());
		price.forEach(s -> System.out.println(s));
		
		if(price.size()<1) {
			driver.findElement(By.xpath("//*[@aria-label='Next']")).click();
		}
		
		}
		
		while(price.size() < 1);
		
		
		

	}

	private static String verifyPrice(WebElement s) {
		// TODO Auto-generated method stub
		return s.findElement(By.xpath("following-sibling::td[1]")).getText();
	}

}
