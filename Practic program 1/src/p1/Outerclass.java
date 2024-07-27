package p1;

import java.util.Scanner;

/*
public class ict {
    static protected int c=1;
    static protected void r(){
        class a{
            static void run(){
                System.out.println("RUN");
            }
        }
    }

    public static void main(String[] args) {
        ict a1 = new ict();
        run();
    }
}
*/
class Outerclass {
    // instance method of the outer class
    void my_Method() {
        int num = 23;

        // method-local inner class
        /*public*/ class MethodInner_Demo {
            public void print() {
                System.out.println("This is method inner class "+num);
            }
        } // end of inner class

        // Accessing the inner class
        MethodInner_Demo inner = new MethodInner_Demo();
        inner.print();
    }

    public static void main(String args[]) {
        Outerclass outer = new Outerclass();
        outer.my_Method();
    }
}