package basic_multithreading;

public class Thread_1 implements Runnable{
    Thread t;
    private int threadNo;
    public Thread_1(int threadNo){
        t = new Thread("myThread");
        this.threadNo = threadNo;
        t.start();
    }
    @Override
    public void run() {
        for(int i=0; i<10; i++){
            System.out.println(threadNo+" Thread running "+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(threadNo+" Thread ended");
    }
}
