package GenPractic;

import java.util.ArrayList;

public class GenPracMain {
    public static void main(String[] args) {
        /*ArrayList<Double> a1 = new ArrayList<>();
        a1.add(12.5);
        a1.add(12.5);
        a1.add(12.5);*/

        Double[] a1 ={12.5,12.5,12.5};

        triangle<Double> t1 = new triangle<>(a1);
        System.out.println(t1.area());
    }
}
