/*
 * (SORT STUDENTS) 
 * Write a program that prompts the user to enter the number of students, 
 * the students’ names, and their scores and prints student names in decreasing order of their scores. 
 * Assume the name is a string without spaces, use the Scanner’s next() method to read a name.
 */

import java.util.Scanner;

public class SortStudents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Create arrays to store students' names and scores
        String[] names = new String[numberOfStudents];
        double[] scores = new double[numberOfStudents];

        // Read the students' names and scores
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            names[i] = scanner.next(); // Read a name without spaces

            System.out.print("Enter the score of " + names[i] + ": ");
            scores[i] = scanner.nextDouble();
        }

        // Sort the students by their scores in decreasing order
        for (int i = 0; i < scores.length - 1; i++) {
            for (int j = i + 1; j < scores.length; j++) {
                if (scores[i] < scores[j]) { // Swap if current score is less than the next score
                    // Swap scores
                    double tempScore = scores[i];
                    scores[i] = scores[j];
                    scores[j] = tempScore;

                    // Swap corresponding names
                    String tempName = names[i];
                    names[i] = names[j];
                    names[j] = tempName;
                }
            }
        }

        // Display the students' names and scores in decreasing order
        System.out.println("\nStudents in decreasing order of their scores:");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println(names[i] + ": " + scores[i]);
        }

        scanner.close();
    }
}
