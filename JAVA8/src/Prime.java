import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {

		// create an object of Scanner
		Scanner input = new Scanner(System.in);

		// take input from the user
		int val = input.nextInt();
        System.out.println("You entered " + val);


		int n = 2;

		while (true) {

			if (val % n != 0) {
				n++;
			} else if (val % n == 0 && val == n) {
				System.out.println("a prime number:" + val);
				break;
			} else {
				System.out.println("not a prime number:" + val);
				break;
			}

		}

	}

}
