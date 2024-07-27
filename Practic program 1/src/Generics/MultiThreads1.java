package Generics;

public class MultiThreads1 implements Runnable { // thread
    String name;
    Thread t;
    public MultiThreads1(String s){
        name = s;
        t = new Thread(this, name);// this = thread
        System.out.println(t.getName()+" Thread Starts");
        t.start();
    }
    @Override
    public void run() {
        try{
            for(int i=5; i>0; i--){
//                synchronized (this){
                System.out.println(name+" "+i);
                Thread.sleep(1000);//}
            }
            System.out.println(name+" Thread Exits");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
