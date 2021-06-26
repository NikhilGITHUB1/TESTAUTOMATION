package polymorphism_inheritance;

public class PolymorphismInheritance {

	public static void main(String[] args) {

		Dog d = new Dog();
		test(d);
		
		
		Cat c = new Cat();
		test(c);
		
	}
	
	private static void test(Animal c) {
		c.makeSound();
		c.walk();
		
	}

}
