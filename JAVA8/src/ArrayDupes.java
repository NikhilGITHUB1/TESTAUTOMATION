import java.util.ArrayList;

public class ArrayDupes {
	
	public static void main(String[] args) {
		
		int a[]= {11,2,3,2,7,3};
        ArrayList<Integer> k = new ArrayList<>();
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]!=a[j]) {
					break;
				}
				if(!k.contains(a)) {
					k.add(a[i]);
				}
				else {
					continue;
				}	
				
			}
			
			
		}
		System.out.println(k);
		
	}

}
