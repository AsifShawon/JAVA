

class myThread5 extends Thread{
	public myThread5(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		int i=0;
		while(++i!=100) {
			System.out.println("This is a Thread");
		}
	}
}

public class MultiTreading3 {
	public static void main(String[] args) {
		myThread5 t = new myThread5("Thread 5");
		
		t.start();
		System.out.println("id of the thread is "+t.getId());
		System.out.println("name of the thread is "+t.getName());
	}
}
