package basicsCode;


interface Notebook{
	 void pen();
}

interface Notebookcover{
	
	void brownPaper();
}

//multiple inheritance through interface
class Write implements Notebook,Notebookcover{

	@Override
	public void brownPaper() {
		System.out.println("cover the notebook");
		
	}

	@Override
	public void pen() {
		System.out.println("use the pen");

	}
	
}

class Book implements Notebookcover{
	
	Book(){
		super();// Interface cannot have constructors
	}

	@Override
	public void brownPaper() {
		System.out.println("cover the book");

		
	}
	
}


public class MultipleInheritance {

	public static void main(String[] args) {

		new Write().brownPaper();
		new Write().pen();
		new Book().brownPaper();
	}

}
