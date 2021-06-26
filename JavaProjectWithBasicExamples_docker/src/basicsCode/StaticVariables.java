package basicsCode;

class Employee{
	
	static int empID=11;
	
	static void getEmpID() {
		System.out.println(empID);
	}
	
}



public class StaticVariables {

	public static void main(String[] args) {

		//Employee emp = new Employee();
		System.out.println(Employee.empID);
		Employee.getEmpID();

		
	}

}
