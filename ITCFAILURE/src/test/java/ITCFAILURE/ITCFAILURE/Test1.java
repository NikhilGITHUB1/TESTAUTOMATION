package ITCFAILURE.ITCFAILURE;

class Abc{
	
    public int method1(int a) {
		return 1;
		
	}
	
	 public long method1(int a) {
		return 2;
		
	}
}


public class Test1 {
	
	public static void main(String[] args) {
		
		Abc a = new Abc();
		System.out.println(a.method1());
		
		
	}

}
