package UDEMY_JAVA_PROGRAM.UDEMY_JAVA_PROGRAM;

import protecteddemo.Fruit;

public class Banana extends Fruit {
public static void main(String[] args) {

    Banana banana = new Banana();
    System.out.println(banana.i);   // 5
    banana.sayHello();              // hello Fruit
    
//    Fruit fruit = new Fruit();
//    System.out.println(fruit.i);    // compile error
//    fruit.sayHello();               // compile error
//
//    Fruit fb = new Banana();
//    System.out.println(fb.i);       // compile error
//    fb.sayHello();                  // compile error
    

}

	
}
