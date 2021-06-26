package GEEKFORGEEKS.GEEKFORGEEKS;

import java.util.Arrays;
import java.util.Comparator;

class Point1{
	 
	 int x,y;
	 public Point1(int x, int y) {
		 
		 this.x=x;
		 this.y=y;		 
	 }
}
// class Point ends here

//here two objects of the Point class has to be passed
class MyCmp implements Comparator<Point1>{

	public int compare(Point1 p1, Point1 p2) {
		return p1.x-p2.x;
	}
}


//in the Arrays.sort, we are passing the array object, and the (new MyCmp) object, which implements the Comparator.
public class UsingComparator1{
	
	public static void main(String[] args) {
		
		Point1 arr[] = {new Point1(10,20),new Point1(3,22),new Point1(55,100)};
		Arrays.sort(arr,new MyCmp());
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i].x + " " + arr[i].y);
		}
		
		
		
	}
	
}


