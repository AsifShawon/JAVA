package Abstract_Inheritance;

public class PercentageDiscount implements Discountable{
    private double percentage;

    public PercentageDiscount(double percentage){
        this.percentage = percentage;
    }

    public Object getPercentage() {
        return this.percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public double discountedPrice(double price) {
        return price-price*(percentage/100.0);
    }
}
