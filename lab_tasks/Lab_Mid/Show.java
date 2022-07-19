package Lab_Mid;

public class Show {
    public static void main(String[] args) {
        Complex c1 = new Complex(7,-6);
        Complex c2 = new Complex(2,-3);
        System.out.println(c1+" "+c2);
        System.out.println("Summation: "+c1.add(c2));
        System.out.println("Subtraction: "+c1.subtract(c2));
        System.out.println("Multiplication: "+c1.multiplication(c2));
        System.out.println("Division: "+c1.divide(c2));
    }
}
