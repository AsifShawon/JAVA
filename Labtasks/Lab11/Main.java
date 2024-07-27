
public class Main {
	public static void main(String[] args) {
		PercentageDiscount a = new PercentageDiscount(10);
		ThresholdDiscount b = new ThresholdDiscount(6000,400);
		
		
		System.out.println(a.discountedPrice(4500));
		System.out.println(b.discountedPrice(7000));
	}

}
