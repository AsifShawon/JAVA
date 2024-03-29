
public class ThresholdDiscount implements Discountable{

	private double threshold, discount;

	ThresholdDiscount(double threshold, double discount){
		this.threshold = threshold;
		this.discount = discount;
	}
	
	public double getThreshold() {
		return threshold;
	}

	public void setThreshold(double threshold) {
		this.threshold = threshold;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	
	@Override
	public double discountedPrice(double price) {
		if(threshold<=price) return (price-discount);
		else return price;
	}

}
