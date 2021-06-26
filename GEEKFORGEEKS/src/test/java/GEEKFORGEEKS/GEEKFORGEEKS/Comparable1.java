package GEEKFORGEEKS.GEEKFORGEEKS;

import java.util.Arrays;

class Point implements Comparable<Point>{
	 
	 int x,y;
	 public Point(int x, int y) {
		 
		 this.x=x;
		 this.y=y;		 
	 }
	

	public int compareTo(Point p) {
		return this.x-p.x;
	}
}

	public class Comparable1{
		
	public static void main(String[] args) {
		
		Point arr[] = {new Point(10,20),new Point(3,22),new Point(55,100)};
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i].x + " " + arr[i].y);
		}
		
	
	}
	
}



