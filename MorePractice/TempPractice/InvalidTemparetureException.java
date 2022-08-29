package Practice;

public class InvalidTemparetureException extends Exception{
	double temp;
	
	public InvalidTemparetureException(double temp) {
		this.temp = temp;
	}
	
	public String toString() {
		return "InvalidTemparetureException: "+temp;
	}
}
