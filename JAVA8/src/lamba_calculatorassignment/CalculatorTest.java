package lamba_calculatorassignment;

public class CalculatorTest {
	
	public static void main(String[] args) {
		
//		MathOperation add = new MathOperation() {
//
//			public int operate(int a, int b) {
//				return a+b;
//		}
//			
//	};

	
	MathOperation add1 = (a,b) ->  a+b;
	int add2= calculate(add1);
	//System.out.println(add2);
	
	MathOperation sub1 = (a,b) ->  a-b;
	int sub2 = calculate(sub1);
	//System.out.println(sub2);
	
	MathOperation mul1 = (a,b) ->  a*b;
	MathOperation div1 = (a,b) ->  a/b;

	//MathOperation calculation = (a,b) ->  a+b;
	int onScreenNumber=0;
	
	onScreenNumber= calculate(5,add1,2);
	onScreenNumber=calculate(onScreenNumber,sub1,3);
	onScreenNumber=calculate(onScreenNumber,mul1,7);
	onScreenNumber=calculate(onScreenNumber,add1,2);
	onScreenNumber=calculate(onScreenNumber,div1,3);



	System.out.println(onScreenNumber);
//	    int addition = add.operate(10, 20);
//	    System.out.println(addition);
//	    
//	    System.out.println(add1.operate(90,3));
//	    System.out.println(sub1.operate(90,3));
//	    System.out.println(mul1.operate(90,3));
//	    System.out.println(div1.operate(90,3));
	    
	}
	
	private static int calculate(MathOperation math) {
		return math.operate(75, 20);
		
	}
	
	
	private static int calculate(int onScreenNumber, MathOperation math, int enteredNumber) {
		return math.operate(onScreenNumber, enteredNumber);
		
	}

}
