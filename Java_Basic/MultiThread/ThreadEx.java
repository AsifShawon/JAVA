
public class ThreadEx {
public static void main(String[] args) {
	
	 new MultiThread("child");
	 
	/*MultiThread ch = new MultiThread("Child");
	Thread childThread = new Thread(ch,"Child");
	childThread.start();*/
	
	Thread t = Thread.currentThread();
	System.out.println("Main Thread: "+t);
	try{
	for(int i=5;i>0;i--){
		System.out.println(t.getName()+": "+i);
		Thread.sleep(2000);
	}
	}catch(InterruptedException e){
		System.out.println("Interrupted Exception in Main");
	}
	System.out.println("Main thread exiting.");
}
}
