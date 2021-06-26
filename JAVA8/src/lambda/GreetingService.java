package lambda;

@FunctionalInterface
public interface GreetingService {
void greet(String name);	
}

@FunctionalInterface
interface ReturnService {
String greet(String name);	
}

