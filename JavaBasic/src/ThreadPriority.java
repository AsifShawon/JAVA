

class myThread6 extends Thread{
	public myThread6(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		int i=0;
		while(++i!=1000) {
			System.out.println("This is a Thread "+this.getName());
		}
	}
}

public class ThreadPriority {
	public static void main(String[] args) {
		myThread6 mt1 = new myThread6("Shawon 1");
		myThread6 mt2 = new myThread6("Shawon 2");
		myThread6 mt3 = new myThread6("Shawon 3");
		myThread6 mt4 = new myThread6("Shawon 4");
		myThread6 mt5 = new myThread6("Shawon 5 most important");
		
		// setting priority
		mt5.setPriority(Thread.MAX_PRIORITY);
		mt4.setPriority(Thread.MIN_PRIORITY);
		mt3.setPriority(Thread.MIN_PRIORITY);
		mt2.setPriority(Thread.MIN_PRIORITY);
		mt1.setPriority(Thread.MIN_PRIORITY);
		
		mt1.start();
		mt2.start();
		mt3.start();
		mt4.start();
		mt5.start();
	}
}
