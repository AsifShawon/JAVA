// Question
/*
Implement the following class and test its methods:
_________________________________________________________
Fraction
- numerator: int
- denominator: int
---------------------------------------------
+ Fraction(numerator. int, denominator: int)
+ getNumerator(): int
+ getDenominator(): int
+ setNumerator(numerator: int): void
+ setDenominator(denominator: int): void
---------------------------------------------
+ toString (): String
+ add(fraction: Fraction): void
+ sub(fraction: Fraction): void
+ multiplication(fraction: Fraction): void
+ division(fraction: Fraction): void
_________________________________________________________

void add(Fraction fraction)
>> Adds two Fraction objects and stores the result into calling object. This is how addition is performed for fractions:
1/4+3/5= 1*5+3*4/4*5=17/20

String toString()
>> Returns the value of the fraction in 1 / 2 format where 1 is numerator and 2 is denominator.

>>> Now write a test program, take two Fraction objects. Print both of them. Test add, sub,
multiplication and division methods. Print calling object after each method call.
*/

// Solution>>>>>>>>>

package lab_tasks;
import java.util.Scanner;
import java.lang.Math; //to use math functions
class Fraction{
    private int numerator,denominator;
    int tempN = numerator,tempD = denominator;
    static float x1,x2;
    Fraction(){
        numerator=0;
        denominator=0;
    }
    Fraction(int n, int d){
        numerator = n;
        denominator = d;
    }
    static int gcd(int a, int b){
        int gcd=0;
        if(x1<x2){
            double t = a;
            t = t*t;
            a = (int)Math.sqrt(t);
        }
        for(int i=1; i<=a && i<=b; i++){
            if(a%i==0 && b%i==0){
                gcd = i;
            }
        }
        return gcd;
    }
    int getNumerator(){
        return numerator;
    }
    int getDenominator(){
        return denominator;
    }
    void setNumerator(int a){
        numerator = numerator/a;
    }
    void setDenominator(int a){
        denominator = denominator/a;
    }
    void add(Fraction f1,Fraction f2){
        denominator = f1.denominator*f2.denominator;
        numerator = f1.numerator*f2.denominator + f2.numerator*f1.denominator;
    }

    void sub(Fraction f1, Fraction f2){
        x1 = (float)f1.numerator/f1.denominator;
        x2 = (float)f2.numerator/f2.denominator;
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
    static String ToString(Fraction f){
        String s = Integer.toString(f.numerator) +"/"+ Integer.toString(f.denominator);
        return s;
    }
}
public class Lab6_P1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter fraction1 Numerator and Denominator: ");
        int num1 = sc.nextInt();
        int den1 = sc.nextInt();
        Fraction f1 = new Fraction(num1,den1);
        String s1 = Fraction.ToString(f1);
        System.out.print("Enter fraction2 Numerator and Denominator: ");
        int num2 = sc.nextInt();
        int den2 = sc.nextInt();
        Fraction f2 = new Fraction(num2,den2);
        String s2 = Fraction.ToString(f2);
        
        Fraction fr = new Fraction();

        // Addition
        fr.add(f1,f2);
        int g = Fraction.gcd(fr.getNumerator(), fr.getDenominator());
        fr.setNumerator(g);
        fr.setDenominator(g);
        String s = Fraction.ToString(fr);
        System.out.println(s1+" + "+s2+" = "+s);

        // Subtraction
        fr.sub(f1,f2);
        g = Fraction.gcd(fr.getNumerator(), fr.getDenominator());
        fr.setDenominator(g);
        fr.setNumerator(g);
        s = Fraction.ToString(fr);
        System.out.println(s1+" - "+s2+" = "+s);

        // Multiplication
        fr.mul(f1,f2);;
        g = Fraction.gcd(fr.getNumerator(), fr.getDenominator());
        fr.setDenominator(g);
        fr.setNumerator(g);
        s = Fraction.ToString(fr);
        System.out.println(s1+" * "+s2+" = "+s);

        // Division
        fr.div(f1,f2);;
        g = Fraction.gcd(fr.getNumerator(), fr.getDenominator());
        fr.setDenominator(g);
        fr.setNumerator(g);
        s = Fraction.ToString(fr);
        System.out.println(s1+" / "+s2+" = "+s);
    }
    
}


// input/output
/*
Enter fraction1 Numerator and Denominator: 2 9
Enter fraction2 Numerator and Denominator: 3 8
2/9 + 3/8 = 43/72
2/9 - 3/8 = -11/72
2/9 * 3/8 = 1/12
2/9 / 3/8 = 16/27
*/