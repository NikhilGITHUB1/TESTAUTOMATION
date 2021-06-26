package basicsCode;

class Drinks {
	
	public static void drink(String[] args) {
		
		for(String d:args) {
			System.out.println(d);
			
		}
		
	}
}


public class StringArgs {

	public static void main(String[] args) {
		
		String[] drinks=new String[2];
		drinks[0]="mcdowells";
		drinks[1]="beer";
		
		Drinks.drink(drinks);

	}

}
