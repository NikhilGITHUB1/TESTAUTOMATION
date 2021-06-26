package JAVA_BOOK_EXAMPLES.JAVA_BOOK_EXAMPLES;

public class Increment {
	
	//pre-incrementation: increment is done first, and any other operation is done next eg ++x
	//post-incrementation : other operation is done first, and incrementation is done only at the end
	
	public static void main(String[] args) {
		
		int x=10,a=1,b=2,c=1;
		String s1="nikhil";
		String s2="kanojia";
		
		if(!s1.equals(s2)) {
			System.out.println("hwllos");
		}
		
		System.out.println(x++);   //here the value of 10 will be 10 only, as it is printed first, and then incremented
		System.out.println(++x);   //here it will be 12, as the value becomes 11 in the prev step, and further it becomes 12,
        System.out.println(x);                          // as it incremented first and then printed
		
		a=++b;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(--c);
		System.out.println(c--);
		System.out.println(c);
		
	}

}
