package lab16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {
        File file = new File("src\\lab16\\quiz_records.txt");
        ArrayList<Quiz> quizList = new ArrayList<>();

        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextInt()) {
                int id = sc.nextInt();
                int marks = sc.nextInt();
                quizList.add(new Quiz(id, marks));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
            return;
        }

        for (Quiz quiz : quizList) {
            System.out.println(quiz);
        }

        if (!quizList.isEmpty()) {
            Quiz highest = quizList.get(0);
            for (Quiz quiz : quizList) {
                if (quiz.getMarks() > highest.getMarks()) {
                    highest = quiz;
                }
            }
            System.out.println("Highest mark obtained by ID:" + highest.getId());
        }
    }
}
