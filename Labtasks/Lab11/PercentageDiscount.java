
public class PercentageDiscount implements Discountable{
	private double percentage;
	public PercentageDiscount(double percentage) {
		this.setPercentage(percentage);
	}
	
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
	@Override
	public double discountedPrice(double price) {
		return price - price*(percentage/100);
	}
}
