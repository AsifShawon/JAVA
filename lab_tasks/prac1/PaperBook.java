package lab_tasks.prac1;

public class PaperBook extends Book{
    double shippingWeight;
    boolean inStock;

    PaperBook(String title, String author, double price,double shippingWeight, boolean inStock) {
        super(title, author, price);
        this.shippingWeight = shippingWeight;
        this.inStock = inStock;
    }

    @Override
    public String toString() {
        return super.toString() + " | " + shippingWeight + "gm | " + inStock;
    }
}
