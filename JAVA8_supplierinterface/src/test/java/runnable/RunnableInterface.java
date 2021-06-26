package runnable;

import java.util.concurrent.TimeUnit;

import com.google.common.util.concurrent.Uninterruptibles;

public class RunnableInterface {
	
	public static void main(String[] args) {
		
		Runnable r = () -> {
				Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
				System.out.println("hello world");				
		};
		
		new Thread(r).start();
		System.out.println("hi");

		
	}

}
