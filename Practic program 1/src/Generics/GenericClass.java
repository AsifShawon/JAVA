package Generics;

// creating a generics class
class myGenerics<type>{ // type = class type like Integer, String, Double
    type data;
    public myGenerics(type data){
        this.data = data;
    }

    public type getData(){
        return data;
    }
    public void showType(){
        System.out.println("This class is "+data.getClass().getName()); // to see class details
    }
}

public class GenericClass {
    public static void main(String[] args) {

        // creating an object of Integer generics
        myGenerics<Integer> ob1 = new myGenerics<>(10);
        System.out.println(ob1.getData());
        ob1.showType();

        // creating an object of Double generics
        myGenerics<Double> ob2 = new myGenerics<>(18.45);
        System.out.println(ob2.getData());
        ob2.showType();

        // creating an object of String generics
        myGenerics<String> ob3 = new myGenerics<>("hehe");
        System.out.println(ob3.getData());
        ob3.showType();
    }
}
