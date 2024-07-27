
public class MultiThreadEx {
public static void main(String[] args) {
	
	new MultiThread("One");
	new MultiThread("Two");
	new MultiThread("Three");
	
	try{
			
		Thread.sleep(15000);
			
	}catch(InterruptedException e){
		System.out.println("Exception:");
	}
	
	System.out.println("Main thread exiting.");
	
}
}
