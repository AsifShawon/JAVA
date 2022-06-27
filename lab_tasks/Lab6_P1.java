/*


******  NOT FINISHED YET ******


*/
package lab_tasks;
import java.util.Scanner;
class Fraction{
    int numerator,denomenator;
    int tempN = numerator,tempD = denomenator;
    Fraction(){
        numerator=0;
        denomenator=0;
    }
    Fraction(int n, int d){
        numerator = n;
        denomenator = d;
    }
    static int gcd(int a, int b){
        int gcd=0;
        for(int i=1; i<=a && i<=b; i++){
            if(a%i==0 && b%i==0){
                gcd = i;
            }
        }
        return gcd;
    }
    void setNumerator(int a){
        
        numerator = numerator/a;
    }
    void setDenomenator(int a){
        
        denomenator = denomenator/a;
    }
    void add(Fraction f1,Fraction f2){
        denomenator = f1.denomenator*f2.denomenator;
        numerator = f1.numerator*f2.denomenator + f2.numerator*f1.denomenator;
    }
    static String ToString(Fraction f){
        String s = Integer.toString(f.numerator) +"/"+ Integer.toString(f.denomenator);
        return s;
    }
}
public class Lab6_P1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter fraction1 Numerator and Denomenetor: ");
        int num1 = sc.nextInt();
        int den1 = sc.nextInt();
        Fraction f1 = new Fraction(num1,den1);
        String s1 = Fraction.ToString(f1);
        System.out.print("Enter fraction2 Numerator and Denomenetor: ");
        int num2 = sc.nextInt();
        int den2 = sc.nextInt();
        Fraction f2 = new Fraction(num2,den2);
        String s2 = Fraction.ToString(f2);
        
        Fraction fr = new Fraction();
        fr.add(f1,f2);
        int g = Fraction.gcd(fr.numerator, fr.denomenator);
        fr.setNumerator(g);
        fr.setDenomenator(g);
        String s = Fraction.ToString(fr);
        System.out.print(s1+"+"+s2+" = "+s);
    }
    
}

// for now
// input/output
/*
Enter fraction1 Numerator and Denomenetor: 2 5
Enter fraction2 Numerator and Denomenetor: 3 9
2/5+3/9 = 11/15
*/