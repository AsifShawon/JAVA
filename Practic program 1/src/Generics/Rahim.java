package Generics;

public class Rahim implements Runnable{
    int a,b;
    @Override
    public void run() {
        for(int p=0; p<5; p++)
            /*synchronized (this)*/{
            a=21;b=20;
            System.out.println(a);
            System.out.println(b);
            }

    }

    public static void main(String[] args) {
        Rahim run = new Rahim();
        Thread j1 = new Thread(run,"j1");
        Thread j2 = new Thread(run,"j2");
        j1.start();
        j2.start();
    }
}
