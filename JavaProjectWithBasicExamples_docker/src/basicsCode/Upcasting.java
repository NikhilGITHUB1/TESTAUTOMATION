 package basicsCode;


class VP{
	
	public void haveFeedbackAccess(){
		System.out.println("vp feedback");
	}
	
	
	public void haveTerminationAccess() {
		System.out.println("vp termination access");

	}
	
}


class SeniorEngg extends VP{
	
    public void haveFeedbackAccess(){
		System.out.println("se feedback");

	}
    
    public void haveMergeAccess(){
		System.out.println("se merge access");

	}
	
    public void haveMergeAccess1(){
		System.out.println("se1 merge access");

	}
    
}


class JuniorEngg extends SeniorEngg{
	
	 public void haveCodingAccess(){
			System.out.println("je coding access");

		}
	 
	 
	 public void haveTestingAccess(){
			System.out.println("je testing access");

		}
}



public class Upcasting {

	public static void main(String[] args) {

	    //Upcasting -while upcasting,we cannot access the subclass method
		SeniorEngg se=new JuniorEngg();
		
		se.haveFeedbackAccess();
		se.haveMergeAccess();
		se.haveTerminationAccess();
		
		System.out.println();
		
		VP vp=new JuniorEngg();
		
		vp.haveFeedbackAccess(); // this is SE feedback, which is an overridden method
		vp.haveTerminationAccess();
		
		System.out.println();

		
		VP vp1=new SeniorEngg();
        vp1.haveFeedbackAccess();
		vp1.haveTerminationAccess();
		
		
	}

}
