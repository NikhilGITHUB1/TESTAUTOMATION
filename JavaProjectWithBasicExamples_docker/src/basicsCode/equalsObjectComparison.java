package basicsCode;


class KingFisher{
	
String content;

KingFisher(String content){
this.content =content;
	
  }
	

	
public boolean equals(Object o) { // upcasted here 
	
	
	String s1=this.content;
	String s2=((KingFisher)o).content;   // downcasted here
	
	return s1.equals(s2);
	
}

}

public class equalsObjectComparison {

	public static void main(String[] args) {

		KingFisher kf=new KingFisher("beer");
		KingFisher kf1=new KingFisher("beer");

		System.out.println(kf.equals(kf1));
		
	}

}
