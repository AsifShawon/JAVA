package Generics;
// if we want to make boundary like we just work with numbers, then we can extends <type> to number
// class genericClass<type extends Number>{ /*codes*/ } // through this we can work with Integer and Double

class genAvg<type extends Number>{
    type[] data;
    public genAvg(type[] data){
        this.data = data;
    }
   public double average(){
        double sum = 0;
        for(int i=0; i<data.length; i++){
            sum += data[i].doubleValue(); // ".doubleValue()" is to convert any type of number to double value
        }
        return (sum/data.length);
   }
}

public class Generic_AvgOfNumber {
    public static void main(String[] args) {
        Integer a[] = {1,2,3,4,5,6,7,8,9};
        Double d[] = {1.5,4.6,3.7,2.3,4.56};

        genAvg<Integer> avg1 = new genAvg<>(a);
        System.out.println("Average 1: "+avg1.average());
        genAvg<Double> avg2 = new genAvg<>(d);
        System.out.println("Average 2: "+avg2.average());
    }
}
