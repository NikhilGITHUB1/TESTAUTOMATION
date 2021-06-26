package UDEMY_JAVA_PROGRAM.UDEMY_JAVA_PROGRAM;


class AccessSpecifier1 {
	
	public void method1() {
		System.out.println("method1 parent");
	}
	
	protected void method2() {
		System.out.println("method2 parent");
	}

}


class A extends AccessSpecifier1{

	public void method1() {
		System.out.println("method1 sub");
	}
	
	public void method3() {
		System.out.println("method3 sub");
	}
	
}


public class AccessSpecifier{
	
	public static void main(String[] args) {
		
		AccessSpecifier1 as1=new AccessSpecifier1();
		A as = new A();
		
//		as.method1();
//		as1.method1();
		
		AccessSpecifier1 a = new A();
		a.method2();
		
		
		
		
		
	}
	
}
