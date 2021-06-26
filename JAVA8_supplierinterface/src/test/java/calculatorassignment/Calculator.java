package calculatorassignment;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
	
	private static final Map<String,MathOperation> map = new HashMap<>();
	
	static {
	map.put("+",(a,b) -> a+b);
	map.put("-",(a,b) -> a-b);
	map.put("*", (a,b) -> a*b);
	map.put("/",(a,b) -> a/b);
	}
	
	public static void newOperation(String key,MathOperation operation) {
		map.put(key, operation);
	}
	
	public static int calculate(String expression) {
		
		String[] str = expression.split(" ");
		int firstNumber = Integer.parseInt(str[0]);

		
		for(int i=1;i<str.length;i=i+2) {
			MathOperation operand = map.get(str[i]);
			int secondNumber = Integer.parseInt(str[i+1]);
			firstNumber = calculate(firstNumber,operand,secondNumber);
			
		}
		return firstNumber;
	}

	private static int calculate(int firstNumber, MathOperation operand, int secondNumber) {
		return operand.operate(firstNumber, secondNumber);
	}
	
	
	}


