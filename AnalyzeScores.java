/*
 * ANALYZE SCORES
 * Write a program that reads an unspecified number of scores 
 * and determines how many scores are above or equal to the average, 
 * and how many scores are below the average. 
 * Enter a negative number to signify the end of the input. 
 * Assume the maximum number of scores is 100.
 */

import java.util.Scanner;

public class AnalyzeScores {
    public static void main(String[] args) {
        
        // Array to hold the scores (maximum 100)
        int[] scores = new int[100];
        int count = 0; // To track the number of valid scores
        
        // Prompt user to input scores
        Scanner input = new Scanner(System.in);
        System.out.println("Enter scores (enter a negative number to end):");

        // Read scores until a negative number is entered or the array is full
        while (true) {
            int score = input.nextInt();

            if (score < 0) { // End of input
                break;
            }

            if (count < 100) { // Only accept scores if there is space left in the array
                scores[count++] = score;
            } else {
                System.out.println("Maximum number of scores reached. Ignoring further inputs.");
                break;
            }
        }

        // Calculate the average
        double sum = 0;
        for (int i = 0; i < count; i++) {
            sum += scores[i];
        }
        double average = sum / count;

        // Count scores above or equal to the average and below the average
        int aboveOrEqual = 0;
        int below = 0;

        for (int i = 0; i < count; i++) {
            if (scores[i] >= average) {
                aboveOrEqual++;
            } else {
                below++;
            }
        }

        // Display the results
        System.out.printf("The average score is %.2f%n", average);
        System.out.println("Number of scores above or equal to the average: " + aboveOrEqual);
        System.out.println("Number of scores below the average: " + below);

        input.close();
    }
}
