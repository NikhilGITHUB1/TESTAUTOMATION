package basicsCode;

class FoodPrep{
	
	String foodtype;
	String specialDish;
	String vessel;
	String type;
	
	FoodPrep(String foodtype){
		this.foodtype=foodtype;
	}
	

FoodPrep(String specialDish, String vessel, String type) {
this.specialDish=specialDish;
this.vessel=vessel;
this.type=type;


}




public String toString() {
	
return foodtype;
		
 }

public String toString1() {
	
return specialDish + " " + vessel + " " + type;
		
 }
//
}

public class ArrayOfObjects {

	public static void main(String[] args) {

		
		FoodPrep[] sample=new FoodPrep[7];
		
		sample[0]= new FoodPrep("Bhindi");
		sample[1]= new FoodPrep("Chicken");
		sample[2]= new FoodPrep("Dal");
		sample[3]= new FoodPrep("Rice");
		sample[4]= new FoodPrep("Mutton");
		
		
		sample[5]=new FoodPrep("ChickenBiriyani","Handi","Boneless");
		sample[6]=new FoodPrep("MuttonBiriyani","Korma","Bones");
        //System.out.println(sample.length);

    	for(FoodPrep s:sample) {
    		if(sample.length > 5) {
    			System.out.println(s.toString1());
    		}
    		
    		else {
        		System.out.println(s);
        	}
    		
    	}
    	
    	
    	
    	
}
}