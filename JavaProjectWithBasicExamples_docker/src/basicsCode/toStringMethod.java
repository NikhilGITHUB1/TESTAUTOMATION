package basicsCode;

class ShoeSize{
	
	int size;
	String s;
	
	ShoeSize(int size){
		
		this.size=size;	
	}
	
	

	ShoeSize(String s){
		
		this.s=s;	
	}
	
	public String toString() {
		
		return size + "";		
	}
	
	
}


public class toStringMethod {

	public static void main(String[] args) {
		
		
		ShoeSize bata=new ShoeSize(10);
		System.out.println(bata);
		
		//ShoeSize hrx=new ShoeSize("hrx");
		
		//System.out.println(hrx);

	}

}
