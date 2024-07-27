package p2;
import p1.*;

import java.util.Scanner;

class thread1 extends Thread {
    int x, y;
    String s;
    thread2 t2;
    public thread1(String s1) {
        s = s1;
        this.start();
        new thread2();
        // t2.start();
    }

    @Override
    public void run() {
        Scanner a = new Scanner(s);
        while (a.hasNextInt()) {
            int x = a.nextInt();
            int y = a.nextInt();
            t2.add(x,y);
        }

    }
}

class thread2 extends Thread{
        int add;
       public thread2(){
//           add = x+y;
           this.start();
       }
void add(int x, int y){
           add= x+y;
}
    @Override
    public void run() {

           System.out.println(add);
    }
}


public class Cse {
    public static void main(String[] args) {
        thread1 t1 = new thread1("1 2 3 4 5 6");

    }
}
