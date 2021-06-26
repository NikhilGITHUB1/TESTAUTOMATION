package basicsCode;

class IceCreamParlour{
	
	public void taste() {
	
	String[] icecream=new String[5];
	icecream[0]="vanilla";
	icecream[1]="choco";
    icecream[2]="mango";
    
    for (int i=0;i<icecream.length;i++) {
    	
    	if(icecream[i]==null) {
    		break;
    	}
    	System.out.println(icecream[i]);
    }
	
  }
	
}	



public class StringArray {

	public static void main(String[] args) {
		
		IceCreamParlour ice=new IceCreamParlour();
		ice.taste();
		

	}

}
