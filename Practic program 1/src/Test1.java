import java.io.File;
import java.util.Scanner;

class s1 extends Thread{
    public void run(){
        for(int i=0; i<3; i++){
            System.out.println("A");
            System.out.println("B");
        }
    }
}
class s2 extends Thread{
    public void run(){
        for(int i=0; i<3; i++){
            System.out.println("C");
            System.out.println("D");
        }
    }
    public static void main(String args[]){
        s1 t1 = new s1();
        s2 t2 = new s2();
        t1.start();
        t2.start();
    }
}




/*interface Figure1{
    public double area();
}

class triangle1 implements Figure1{
    double a,b,c;
    public triangle1(){}
    public triangle1(double a,double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        return 0;
    }
}

public class Test1{
    public static void main(String[] args) {
        String a = null;
        Number[] i = new Integer[3];
        try{
            System.out.println(a.length());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        try{
//            System.out.println(a.length());
            i[0] = 2.3;
        }
        catch (ArrayStoreException e){
            System.out.println(e);
        }
        try{
            Object o = new int[3];
            String s = (String) o;
        }
        catch (ClassCastException e){
            System.out.println(e);
        }

    }
}*/



/*
public class Test {
    public static void main(String[] args) {
        try{
            badMethod();
            System.out.print("A");
        }
        catch (RuntimeException e){
            System.out.print("B");
        }
        catch (Exception e){
            System.out.print("C");
        }
        finally {
            System.out.print("D");
        }
        System.out.print("E");
    }
    public static void badMethod(){
        throw new RuntimeException();
    }
}
*/







/*
public class Test {
    public static void main(String[] args) {
        int a =0;

        String name[] = {"a","b","c"};

        while(a<4){
            try{
                System.out.println(name[a]);
                a++;
            }
            catch (Exception e){
                System.out.println("NOthing");
            }
            finally {
                System.out.println("Must ex");
                if(a<3);
                else {
                    System.out.println("Wrong");
                    break;}
            }
        }
    }
}
*/
