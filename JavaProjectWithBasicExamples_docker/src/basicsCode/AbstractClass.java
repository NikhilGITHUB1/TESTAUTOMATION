package basicsCode;

abstract class Manager{
	
	//have abstract methods
	abstract void shareFiles();
	abstract void shareFeedback();
	
	//have non abstract methods
	public void checkSkills() {
		System.out.println("check skills for Employees");
	}
	
	//have static methods
	public static void test() {
		System.out.println("check skills for test");
	}

}


class Employee1 extends Manager{

	@Override
	void shareFiles() {
		System.out.println("employee1 updates the file");
		
	}

	@Override
	void shareFeedback() {
		System.out.println("employee1 work on feedback");
	}
	
	//override the non abs method
	public void checkSkills() {
		System.out.println("check skills for junior emp");
	}
	
	
}


abstract class Employee2 extends Manager{
	
	 void shareFiles() {
		System.out.println("employee2 updates the file");
		
	}
	 
	 //create a static method, though we are thinking that it is overridden it is not, 
	 //this is called method hiding for static methods
	 public static void test() {
			System.out.println("check skills for test employee2");
		}

	
}



public class AbstractClass {

	public static void main(String[] args) {

		Employee1 emp=new Employee1();
		emp.shareFiles();
		emp.shareFeedback();
		emp.checkSkills();
		
		Employee2.test();
        
		
	}

}
