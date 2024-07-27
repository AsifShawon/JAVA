package Task5;

import java.lang.Math; 
public class Fraction{
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
 void addition(Fraction f1,Fraction f2){
     denominator = f1.denominator*f2.denominator;
     numerator = f1.numerator*f2.denominator + f2.numerator*f1.denominator;
 }

 void subtraction(Fraction f1, Fraction f2){
     x1 = (float)f1.numerator/f1.denominator;
     x2 = (float)f2.numerator/f2.denominator;
     denominator = f1.denominator*f2.denominator;
     numerator = f1.numerator* f2.denominator - f2.numerator* f1.denominator;
 }

 void multiplication(Fraction f1, Fraction f2){
     denominator = f1.denominator*f2.denominator;
     numerator = f1.numerator* f2.numerator;
 }

 void division(Fraction f1, Fraction f2){
     denominator = f1.denominator*f2.numerator;
     numerator = f1.numerator* f2.denominator;
 }
 static String ToString(Fraction f){
     String s = Integer.toString(f.numerator) +"/"+ Integer.toString(f.denominator);
     return s;
 }
}

