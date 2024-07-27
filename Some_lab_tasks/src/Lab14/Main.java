package Lab14;

public class Main {
    public static void main(String[] args) {
        BestForCustomer customerDiscount = new BestForCustomer(10, 100, 5);

        double originalPrice = 120;
        double discountedPrice = customerDiscount.discountedPrice(originalPrice);

        System.out.println("Original Price: $" + originalPrice);
        System.out.println("Discounted Price: $" + discountedPrice);
    }
}

