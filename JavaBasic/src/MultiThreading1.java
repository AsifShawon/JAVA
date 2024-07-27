/*
 * Multithreading is a Java feature that allows concurrent execution of two or more 
 * parts of a program for maximum utilization of CPU
 */

/**
**Threads can be created by using two mechanisms : 
 1. Extending the Thread class 
 2.	Implementing the Runnable Interface
 */

// creating a thread extending "Thread"
class myThread1 extends Thread{
	
	@Override
	public void run() {
		int i= 0;
		while(++i!=1000) {
			System.out.println("My thread 1 is running");
		}
	}
}

class myThread2 extends Thread{
	
	@Override
	public void run() {
		int i= 0;
		while(++i!=1000) {
			System.out.println("My thread 2 is running");
		}
	}
}

public class MultiThreading1 {
	public static void main(String[] args) {
		myThread1 t1 = new myThread1();
		myThread2 t2 = new myThread2();
		
		t1.start(); // to start the threads
		t2.start();
	}
}
