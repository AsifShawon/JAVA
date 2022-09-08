package Generics;

public class MultiThread_Main {
    public static void main(String[] args) {
        Thread t1 = Thread.currentThread();
        System.out.println(t1.getName()+" Thread Starts");


       /*MultiThreads1 m1 = */new MultiThreads1("Child");
       /*Thread t2 = new Thread(m1);
       t2.start();*/

        try{ // if we use sleep we have to bound it by try catch block
//            t1.start();
            for (int i=0; i<5; i++) {
                System.out.println(t1.getName()+" "+i);//
                Thread.sleep(1500);
            }
            System.out.println(t1.getName()+" Thread Exits");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
