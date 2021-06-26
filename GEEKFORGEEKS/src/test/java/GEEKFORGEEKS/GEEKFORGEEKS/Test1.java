package GEEKFORGEEKS.GEEKFORGEEKS;
 
class Test {
	
	int x,y;

	public Test(int x, int y) {
		this.x=x;
		this.y=y;
	}
	

}

public class Test1{
	public static void main(String[] args) {
		
		Test t[] = {new Test(10,20),new Test(11,20)};
		
		for(int i=0;i<t.length;i++) {
			
			System.out.println(t[i].x + " " + t[i].y);
			
		}
		
		
//		System.out.println(t.x);
//		System.out.println(t.y);

		
	}
}
