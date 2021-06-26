package basicsCode;

class Emp{
	int empid=17;
	String name="nikhil";
	
	public void method1() {
		System.out.println("this is emp method");
	}
}


public class EmployeeOO {

	public static void main(String[] args) {
		
	Emp e=new Emp();	
    System.out.println(e.name);
    e.method1();
		
	}

}
