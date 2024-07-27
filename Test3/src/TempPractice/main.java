package TempPractice;

import java.util.Scanner;

public class main {
	public static void main(String[] args) throws InvalidTemparetureException{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter temp in celsius and fahrenheight: ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		try {
			if(a<-273) throw new InvalidTemparetureException(a);
			if(b<-460) throw new InvalidTemparetureException(b);
			
			celcius c = new celcius(a);
			fahrenheight f =new fahrenheight(b);
			
			c.afterConvert();
			f.afterConvert();
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
