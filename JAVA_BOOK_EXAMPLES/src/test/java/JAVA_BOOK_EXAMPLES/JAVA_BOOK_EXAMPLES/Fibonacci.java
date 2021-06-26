package JAVA_BOOK_EXAMPLES.JAVA_BOOK_EXAMPLES;

//declare 2 variables say 0 and 1

//will add a+b and assign to c
//assign c to b, and assign b to a
//0 1 1 2 3 5 8 13

public class Fibonacci {

	public static void main(String[] args) {

		int a = 0;
		int b = 1;

		for (int i = 0; i < 10; i++) {

			int c = a + b;
			System.out.println(c);
			a = b;
			b = c;

		}

	    }

        }
