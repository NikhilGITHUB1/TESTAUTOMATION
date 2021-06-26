package basicsCode;


// final and static methods cannot be overridden

class PrepareSawai{

	public  void prepsawai() {
		
		System.out.println("sawai without milk");
	}
		
}

class PrepareSawaiwithMilk extends PrepareSawai{
	
	
	public void prepsawai() {
		System.out.println("sawai with hot milk");

	}
}


public class MethodOveridding {

	public static void main(String[] args) {
		
		PrepareSawaiwithMilk ps=new PrepareSawaiwithMilk();
		ps.prepsawai();

	}

}
