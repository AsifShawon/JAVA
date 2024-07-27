
public class MultiThreadJoinDemo {
public static void main(String[] args) {
	
	MultiThread thread1 = new MultiThread("One");
	MultiThread thread2 = new MultiThread("Two");
	MultiThread thread3 = new MultiThread("Three");
	
	System.out.println("Thread One is alive: "+thread1.th.isAlive());
	System.out.println("Thread Two is alive: "+thread2.th.isAlive());
	System.out.println("Thread Three is alive: "+thread3.th.isAlive());
	
	try{
		thread1.th.join();
		thread2.th.join();
		thread3.th.join();
		
	}catch(InterruptedException e){
		System.out.println("Exception:");
	}
	
	System.out.println("Thread One is alive: "+thread1.th.isAlive());
	System.out.println("Thread Two is alive: "+thread2.th.isAlive());
	System.out.println("Thread Three is alive: "+thread3.th.isAlive());
	
	System.out.println("Main thread exiting.");
	
}
}
