package Generics;

public class GenericMethod {

    // creating a generic method
    // type = class type like Integer, String, Double
    static <type> void display(type[] data){
        for(int i=0; i< data.length; i++)
            System.out.print(data[i]+" ");
        System.out.println("");
    }
    public static void main(String[] args) {
        Integer[] I = {1,2,3,4,5};
        Double[] D = {2.3,8.66,4.0,5.0};
        String[] S = {"Dhaka","Noakhali","Rajshahi","Barishal","Khulna"};

        display(I);
        display(D);
        display(S);
    }
}
