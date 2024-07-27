package Generics;

public class MultiThread_Main2 {
    public static void main(String[] args) {
        Thread t1 = Thread.currentThread();
        new MultiThreads1("Child 1");
        new MultiThreads1("Child 2");
        new MultiThreads1("Child 3");

        try{ // if we use sleep we have to bound it by try catch block
//            t1.start();
            for (int i=0; i<5; i++) {
                System.out.println(t1.getName()+" "+i);
                Thread.sleep(2500);
            }
            System.out.println(t1.getName()+" Thread Exits");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
