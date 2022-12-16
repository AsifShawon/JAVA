
public class MultiThread implements Runnable{
	Thread th;
	String name;
	MultiThread(String s){
		name = s;
		th = new Thread(this,name);
		System.out.println("Child Thread: "+name);
		th.start();
		}
	public void run(){
		int i;
		try{
		for(i=5;i>0;i--){
			System.out.println(th.getName()+": "+i);
			//System.out.println(Thread.currentThread().getName()+": "+i);
			Thread.sleep(1000);
		}
	}catch(InterruptedException e){
		System.out.println("Exception:");
	}
		System.out.println("Exiting from Child Thread: "+name);
	}
		
}