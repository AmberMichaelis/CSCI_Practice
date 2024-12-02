/*
 * Write a program that reads student scores, gets the best score, 
 * and then assigns grades based on the following scheme:
 * Grade is A if score is ≥ best − 10;
 * Grade is B if score is ≥ best − 20;
 * Grade is C if score is ≥ best − 30;
 * Grade is D if score is ≥ best − 40;
 * Grade is F otherwise.
 * The program prompts the user to enter the total number of students, 
 * then prompts the user to enter all of the scores, and concludes by displaying the grades.
 */

import java.util.Scanner;

public class AssignGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

        // Create an array to store the scores
        int[] scores = new int[numStudents];

        // Prompt the user to enter all the scores
        System.out.print("Enter " + numStudents + " scores: ");
        for (int i = 0; i < numStudents; i++) {
            scores[i] = input.nextInt();
        }

        // Find the best score
        int best = scores[0];
        for (int score : scores) {
            if (score > best) {
                best = score;
            }
        }

        // Assign and display grades
        for (int i = 0; i < scores.length; i++) {
            int score = scores[i];
            char grade;

            if (score >= best - 10) {
                grade = 'A';
            } else if (score >= best - 20) {
                grade = 'B';
            } else if (score >= best - 30) {
                grade = 'C';
            } else if (score >= best - 40) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            System.out.println("Student " + i + " score is " + score + " and grade is " + grade);
        }

        input.close();
    }
}

