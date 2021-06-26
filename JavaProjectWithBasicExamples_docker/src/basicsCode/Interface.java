package basicsCode;

 interface Maggi{
	 
	static String moreMasala="Yes";
	final String moreWater="Yes";
	abstract void maggiMasala();
	abstract void water();
	
}


class Cooking implements Maggi{

	@Override
	public void maggiMasala() {
		System.out.println("add more masala:" + Maggi.moreMasala );
	}

	@Override
	public void water() {
		System.out.println("add more water:" + Maggi.moreWater );

	}
	
}
 
 
 
public class Interface {

	public static void main(String[] args) {
       
		Cooking c=new Cooking();
		c.maggiMasala();
		c.water();
		
	}

}
