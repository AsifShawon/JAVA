package Quiz;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<Quiz> quizes = new ArrayList<Quiz>();
//		System.out.println(quizes.size());
		int ID;
		double Mark;
		File file = new File("quiz.txt");
		try {
			Scanner scanner = new Scanner(file);
			
			while(scanner.hasNext()) {
				ID = scanner.nextInt();
				Mark = scanner.nextDouble();
				Quiz quiz = new Quiz(ID, Mark);
				quizes.add(quiz);
			}
			scanner.close();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		double highestMark = 0;
		int hmID=0;
		for(int i=0; i<quizes.size(); i++) {
			Quiz quiz = quizes.get(i);
			System.out.println(quiz);
			
			if(quiz.getMark() > highestMark) {
				highestMark = quiz.getMark();
				hmID = quiz.getID();
			}
			
		}
		
		System.out.println("Highest mark obtained by ID: "+hmID);
		
	}
}
