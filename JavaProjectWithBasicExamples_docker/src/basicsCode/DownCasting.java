package basicsCode;



	class VP1{
		
		public void haveFeedbackAccess(){
			System.out.println("vp feedback");
		}
		
		
		public void haveTerminationAccess() {
			System.out.println("vp termination access");

		}
		
	}


	class SeniorEngg1 extends VP1{
		
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


	class JuniorEngg1 extends SeniorEngg1{
		
		 public void haveCodingAccess(){
				System.out.println("je coding access");

			}
		 
		 
		 public void haveTestingAccess(){
				System.out.println("je testing access");

			}
	}



	public class DownCasting {

		public static void main(String[] args) {
			
			//to do downcasting , we have to do upcasting first,as we are doing here
			// downcasting adv is it will have access to all the methods
			
			VP1 vp1=new SeniorEngg1();

		    SeniorEngg1 se=(SeniorEngg1) vp1;
			se.haveFeedbackAccess();
			se.haveMergeAccess();
			se.haveMergeAccess1();
			se.haveTerminationAccess();
			
			System.out.println();
			
			SeniorEngg1 see1=new JuniorEngg1();
			
			JuniorEngg1 jee=(JuniorEngg1) see1;
			jee.haveCodingAccess();
			jee.haveFeedbackAccess();
			jee.haveMergeAccess();
			jee.haveMergeAccess1();
			jee.haveTerminationAccess();
			jee.haveTestingAccess();
			
		}


}
