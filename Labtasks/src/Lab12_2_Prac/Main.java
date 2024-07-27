package Lab12_2_Prac;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		BestForCustomer ob = new BestForCustomer(20, 2000, 200);

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the price: ");
		double price = s.nextDouble();
		
		System.out.println("Best price for customer: "+ob.discountedPrice(price));
	}

}
