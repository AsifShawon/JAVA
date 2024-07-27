package Fraction_prob;

public class Main {
	public static void main(String[] args) {
		Fraction f1 = new Fraction(3, 4);
		Fraction f2 = new Fraction(5, 7);
		
		System.out.print(f1 + " + " + f2 + "= ");
		f1.add(f2);
		System.out.println(f1);
		
	}
}
