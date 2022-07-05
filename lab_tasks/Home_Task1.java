
import java.util.Scanner;
class Fraction{
    private int numerator,denominator;
    Fraction(){

    }
    Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public int getNumerator(){
        return numerator;
    }
    public int getDenominator(){
        return denominator;
    }
    public void setNumerator(int numerator){
        this.numerator = numerator;
    }
    public void setDenominator(int denominator){
        this.denominator = denominator;
    }
    public void add(Fraction f1,Fraction f2){
        denominator = f1.denominator*f2.denominator;
        numerator = f1.numerator*f2.denominator + f2.numerator*f1.denominator;
    }

    public void sub(Fraction f1, Fraction f2){
        denominator = f1.denominator*f2.denominator;
        numerator = f1.numerator* f2.denominator - f2.numerator* f1.denominator;
    }

    public void mul(Fraction f1, Fraction f2){
        denominator = f1.denominator*f2.denominator;
        numerator = f1.numerator* f2.numerator;
    }

    public void div(Fraction f1, Fraction f2){
        denominator = f1.denominator*f2.numerator;
        numerator = f1.numerator* f2.denominator;
    }
//    public String toString(){
//
//    }
}
public class Bonus {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter fraction1 Numerator and Denominator: ");
        int num1 = sc.nextInt();
        int den1 = sc.nextInt();
        Fraction fraction1 = new Fraction(num1,den1);
        System.out.print("Enter fraction2 Numerator and Denominator: ");
        Fraction fraction2 = new Fraction();
        int num2 = sc.nextInt();
        int den2 = sc.nextInt();
        fraction2.setNumerator(num2);
        fraction2.setDenominator(den2);

        Fraction fraction = new Fraction();

        // Addition
        fraction.add(fraction1,fraction2);
        int num = fraction.getNumerator();
        int den = fraction.getDenominator();
        System.out.println(num1+"/"+den1+" + "+num2+"/"+den2+" = "+num+"/"+den);

        // Subtraction
        fraction.sub(fraction1,fraction2);
        num = fraction.getNumerator();
        den = fraction.getDenominator();
        System.out.println(num1+"/"+den1+" - "+num2+"/"+den2+" = "+num+"/"+den);

        // Multiplication
        fraction.mul(fraction1,fraction2);
        num = fraction.getNumerator();
        den = fraction.getDenominator();
        System.out.println(num1+"/"+den1+" * "+num2+"/"+den2+" = = "+num+"/"+den);

        // Division
        fraction.div(fraction1,fraction2);;
        num = fraction.getNumerator();
        den = fraction.getDenominator();
        System.out.println(num1+"/"+den1+" / "+num2+"/"+den2+" = = "+num+"/"+den);
    }
}
