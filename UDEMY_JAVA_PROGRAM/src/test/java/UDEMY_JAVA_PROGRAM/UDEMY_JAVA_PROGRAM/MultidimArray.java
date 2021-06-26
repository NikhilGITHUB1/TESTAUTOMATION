package UDEMY_JAVA_PROGRAM.UDEMY_JAVA_PROGRAM;

import java.util.ArrayList;

public class MultidimArray {
	
	//yahoo question .. for a given min value find the max value in the same column
	
	//find the smallest number
	//find the column for the smallest number
	//then fetch the max value in that column
	
	public static void main(String[] args) {		
		
	
		int b[][]= {{5,6,7},{8,9,4},{1,2,3}};
		int min=b[0][0];
		int max=b[0][0];
		int col=0;
		int mincolumn = 0;
		//int j = 0;
		
		ArrayList<Integer> l= new ArrayList<Integer>();
		ArrayList<Integer> l1= new ArrayList<Integer>();

		//System.out.println(b.length);
		
		for(int i=0;i<=b.length-1;i++) {
			
			for(int j=0;j<=b.length-1;j++) {
				
				//System.out.print(b[i][j]+ " ");
				if(b[i][j] <= min) {
					min = b[i][j];
					mincolumn=j;
					l.add(min);
				}
		
			}	
			
			    //System.out.println(i);
			    //System.out.println(b[i][mincolumn]);
				//System.out.println(b[i][mincolumn]);
			
		
			System.out.println();
			
		}
		
		for(int i=0;i<=b.length-1;i++) {
			System.out.println(b[i][mincolumn]);
			if(b[i][mincolumn] > max) {
				max=b[i][mincolumn];
			}
		}
		
		System.out.println(l);
		//System.out.println(l1);

		System.out.println("min is:"+min);
		System.out.println("max for min value in the specified column is:"+max);

		System.out.println(mincolumn);		
		
	}

}
