package predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.openqa.selenium.WebElement;

public class Rules {
	
	private static Predicate<WebElement> isBlank = (e) -> e.getText().trim().length() == 0;
	private  static Predicate<WebElement> isS= (e) -> e.getText().toLowerCase().contains("s");
	
	public static List<Predicate<WebElement>> get(){
	
	List<Predicate<WebElement>> rules = new ArrayList<>();
	rules.add(isBlank);
	rules.add(isS);
	return rules;
	
	
	}

}
