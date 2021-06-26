package basicsCode;


class A{
	int i=11;
}

class B extends A {
	int j=12;
}

class C extends B{
	int k=13;
}



public class InheritanceConcept {

	public static void main(String[] args) {
		
		C c=new C();
		System.out.println("C can access C, B and A");
        System.out.println(c.k);
        System.out.println(c.j);
        System.out.println(c.i);
        
        B b=new B();
        System.out.println("B can access B and A");
        //System.out.println(b.k);
        System.out.println(b.j);
        System.out.println(b.i);
        
        A a=new A();
        System.out.println("a can access only A");
        //System.out.println(b.k);
        //System.out.println(a.j);
        System.out.println(a.i);
        
        
		
	}

}
