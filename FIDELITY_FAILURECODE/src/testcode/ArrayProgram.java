package testcode;

public class ArrayProgram {
	
	//merge and sort an array
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,334,3434};
		int[] arr2= {2323,55,4545};
		int pos=0;
		int temp=0;
		
	    int mergedarraylength = arr.length + arr2.length;
		int[] mergedarray = new int[mergedarraylength];

	    
	    //System.out.println(mergedarraylength);
	    
	    for(int element:arr) {
	    	mergedarray[pos]=element;
	    	pos++;
	    }
	    
	    
	    for(int element:arr2) {
	    	mergedarray[pos]=element;
	    	pos++;
	    }
	    
	   for(int element:mergedarray) {
		//   System.out.println(element);
	
	   }
	   
	   for(int i=0;i<mergedarray.length-1;i++) {
		   
		   for(int j=i+1;j<mergedarray.length-1;j++) {
		   
		   if(mergedarray[i] > mergedarray[j]) {
			   
			   temp = mergedarray[i];
			   mergedarray[i] = mergedarray[j];
			   mergedarray[j] = temp;
			   
		   }
		   
	   }
	   
	  
	   
	   }
	   
	   for(int element:mergedarray) {
		   System.out.println(element);
	
	   }
		
	}

}
