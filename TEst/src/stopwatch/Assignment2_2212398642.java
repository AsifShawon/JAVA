package stopwatch;

import java.util.Scanner;

class InvalidEmailException extends Exception {
	String email;
	public InvalidEmailException(String email) {
		this.email = email;
	}
	
	public String toString() {
		return "InvalidEmailException: "+email;
	}
}

public class Assignment2_2212398642{
	static void checkEmail(String email) throws InvalidEmailException{
		if(email.endsWith("@gmail.com") || email.endsWith("@northsouth.edu")) {
			System.out.println("Your email is ok!");
		}
		else {
			throw new InvalidEmailException(email);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your mail: ");
		String email = sc.next();
		
		try {
			checkEmail(email);
		}
		catch (InvalidEmailException e) {
			System.out.println(e);
		}
	}
}


