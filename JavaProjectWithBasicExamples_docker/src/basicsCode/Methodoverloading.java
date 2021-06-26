package basicsCode;

class PassedInTest{
	
	public void passed(){
		System.out.println("just passed");
	}
	
	public String passed(String grade) {
		
		//System.out.println("grade is "+);
		return grade;
		
	}
	
public String passed(String grade,String distinction) {
		
	System.out.print("distinction is "+distinction + ",");
	return grade;

	}
	
}



public class Methodoverloading {

	public static void main(String[] args) {
		
		PassedInTest exam=new PassedInTest();
		exam.passed();
		String b=exam.passed("B");
		System.out.println("passed with grade "+b);
		String s=exam.passed("A", "state level");
		System.out.println("passed with grade "+s);

		
		

	}

}
