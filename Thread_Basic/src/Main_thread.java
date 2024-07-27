
public class Main_thread {
    public static void main(String[] args) {
        Thread_1 t1 = new Thread_1(1);
        Thread_1 t2 = new Thread_1(2);

        try {
            t1.t.join();
            t2.t.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}