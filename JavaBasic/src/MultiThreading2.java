
// multithread class implementing runnable

class myThread3 implements Runnable{

	@Override
	public void run() {
		int i = 0;
		while(++i!=1000) {
		System.out.println("I'm thread 1");
		}
	}
}

class myThread4 implements Runnable{
	
	@Override
	public void run() {
		int i = 0;
		while(++i!=1000) {
		System.out.println("I'm thread 2");
		}
	}
}

public class MultiThreading2 {
	public static void main(String[] args) {
		myThread3 runThread1 = new myThread3();
		Thread t1 = new Thread(runThread1); // passing runnable thread and creating thread object
		
		myThread4 runThread2 = new myThread4();
		Thread t2 = new Thread(runThread2);
		
		t1.start();
		t2.start();
		
	}
}
