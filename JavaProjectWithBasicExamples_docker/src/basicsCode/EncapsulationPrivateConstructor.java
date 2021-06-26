package basicsCode;


class PrivateRoom{
	
	private static int count;
	private static PrivateRoom rm=null;
	
	private PrivateRoom() {
		System.out.println("This is private");
		count++;
	}
	

static PrivateRoom getInstance() {
	
	if(count==0) {
	rm=new PrivateRoom();
	}
	return rm;
	
}

public void test() {
	System.out.println("test object call");
}


}


public class EncapsulationPrivateConstructor {

	public static void main(String[] args) {
		
		PrivateRoom rm = PrivateRoom.getInstance();
		rm.test();
		PrivateRoom rm1 = PrivateRoom.getInstance();
        rm1.test();
	}

}
