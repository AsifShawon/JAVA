package Generics;

public class MultiThread_Main3 {
    public static void main(String[] args) {
        Thread t1 = Thread.currentThread();
        System.out.println(t1.getName()+" Thread Starts");
        MultiThreads1 thread1 = new MultiThreads1("Child1");
        MultiThreads1 thread2 = new MultiThreads1("Child2");
        MultiThreads1 thread3 = new MultiThreads1("Child3");
        System.out.println("Is thread 1 is alive: "+thread1.t.isAlive());

        System.out.println("Is thread 2 is alive: "+thread2.t.isAlive());
        System.out.println("Is thread 3 is alive: "+thread3.t.isAlive());
    int i=0;
        try{
           /* if(i!=1){
                thread1.t.wait();
            }*/
            thread1.t.join();
            thread2.t.join();
            thread3.t.join();

        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }

//        if(++i==1) thread1.t.notify();

//        System.out.println("Running....");
//
//        try{
//
//        }
//        catch (InterruptedException e){
//            System.out.println(e.getMessage());
//        }

        System.out.println("Is thread 1 is alive: "+thread1.t.isAlive());
        System.out.println("Is thread 2 is alive: "+thread2.t.isAlive());
        System.out.println("Is thread 3 is alive: "+thread3.t.isAlive());
        System.out.println(t1.getName()+" Thread Exits");
    }
}
