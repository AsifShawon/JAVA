package Task5;

import java.util.Scanner;

public class Main {
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
	     fr.addition(f1,f2);
	     int g = Fraction.gcd(fr.getNumerator(), fr.getDenominator());
	     fr.setNumerator(g);
	     fr.setDenominator(g);
	     String s = Fraction.ToString(fr);
	     System.out.println(s1+" + "+s2+" = "+s);

	     // Subtraction
	     fr.subtraction(f1,f2);
	     g = Fraction.gcd(fr.getNumerator(), fr.getDenominator());
	     fr.setDenominator(g);
	     fr.setNumerator(g);
	     s = Fraction.ToString(fr);
	     System.out.println(s1+" - "+s2+" = "+s);

	     // Multiplication
	     fr.multiplication(f1,f2);;
	     g = Fraction.gcd(fr.getNumerator(), fr.getDenominator());
	     fr.setDenominator(g);
	     fr.setNumerator(g);
	     s = Fraction.ToString(fr);
	     System.out.println(s1+" * "+s2+" = "+s);

	     // Division
	     fr.division(f1,f2);;
	     g = Fraction.gcd(fr.getNumerator(), fr.getDenominator());
	     fr.setDenominator(g);
	     fr.setNumerator(g);
	     s = Fraction.ToString(fr);
	     System.out.println(s1+" / "+s2+" = "+s);
	 }
	 
	}
