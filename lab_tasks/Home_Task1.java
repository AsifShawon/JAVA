// Solution>>>>>>>>>

package lab_tasks;
import java.util.Scanner;
import java.lang.Math; //to use math functions
class Fraction{
    private int numerator,denominator;

    Fraction(){

    }
    int getNumerator(){
        return numerator;
    }
    int getDenominator(){
        return denominator;
    }
    void setNumerator(int numerator){
        this.numerator = numerator;
    }
    void setDenominator(int denominator){
        this.denominator = denominator;
    }
    void add(Fraction f1,Fraction f2){
        denominator = f1.denominator*f2.denominator;
        numerator = f1.numerator*f2.denominator + f2.numerator*f1.denominator;
    }

    void sub(Fraction f1, Fraction f2){
        denominator = f1.denominator*f2.denominator;
        numerator = f1.numerator* f2.denominator - f2.numerator* f1.denominator;
    }

    void mul(Fraction f1, Fraction f2){
        denominator = f1.denominator*f2.denominator;
        numerator = f1.numerator* f2.numerator;
    }

    void div(Fraction f1, Fraction f2){
        denominator = f1.denominator*f2.numerator;
        numerator = f1.numerator* f2.denominator;
    }
    public String toString(){
        return numerator +"/"+ denominator;

    }
}
public class Home_Task1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter fraction1 Numerator and Denominator: ");
        int num1 = sc.nextInt();
        int den1 = sc.nextInt();
        Fraction f1 = new Fraction();
        f1.setNumerator(num1);
        f1.setDenominator(den1);
        System.out.print("Enter fraction2 Numerator and Denominator: ");
        int num2 = sc.nextInt();
        int den2 = sc.nextInt();
        Fraction f2 = new Fraction();
        f2.setNumerator(num2);
        f2.setDenominator(den2);

        Fraction fr = new Fraction();

        // Addition
        fr.add(f1,f2);
        int num = fr.getNumerator();
        int den = fr.getDenominator();
        System.out.println(f1+" + "+f2+" = "+num+"/"+den);

        // Subtraction
        fr.sub(f1,f2);
        num = fr.getNumerator();
        den = fr.getDenominator();
        System.out.println(f1+" - "+f2+" = "+num+"/"+den);

        // Multiplication
        fr.mul(f1,f2);
        num = fr.getNumerator();
        den = fr.getDenominator();
        System.out.println(f1+" * "+f2+" = "+num+"/"+den);

        // Division
        fr.div(f1,f2);;
        num = fr.getNumerator();
        den = fr.getDenominator();
        System.out.println(f1+" / "+f2+" = "+num+"/"+den);
    }
}