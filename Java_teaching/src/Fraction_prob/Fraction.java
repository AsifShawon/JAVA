package Fraction_prob;

public class Fraction {
	private int numerator;
	private int denominator;
	
	public Fraction (int numerator , int denominator) {
		this.numerator =numerator;
		this.denominator = denominator;
	}
	public int getNumerator() {
		return numerator;
	}
	public int getDenominator() {
		return denominator;
	}
	
	public void setNumerator (int numerator) {
		this.numerator = numerator;
	}
	public void setDenominator (int denominator ) {
		this.denominator = denominator;
	}
	
	public String toString() {
		return numerator +"/"+denominator;
	}
	
	public void add(Fraction fraction) {
		int n,d;
		n = numerator*fraction.getDenominator() + denominator*fraction.getNumerator();
		d = denominator*fraction.getDenominator();
		
		numerator = n;
		denominator = d;
	}
}
