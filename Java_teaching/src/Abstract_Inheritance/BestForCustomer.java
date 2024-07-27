package Abstract_Inheritance;

public class BestForCustomer implements Discountable{
	private double percentage, threshold, discount;
	
	public BestForCustomer(double percentage, double threshold, double discount) {
		this.percentage = percentage;
		this.threshold = threshold;
		this.discount = discount;
	}

	public double getPercentage() {
		return percentage;
	}


	public void setPercentage(double percentage) {
		this.percentage = percentage;
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
		if(price>=threshold) { 
		if((price-price*(percentage/100))>(price-discount)) return (price-discount);
		}
		return (price-price*(percentage/100)); 
	}

}
