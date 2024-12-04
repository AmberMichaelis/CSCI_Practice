/*
 * PROBLEM:
 * (COUNT SINGLE DIGITS) Write a program that generates 100 random integers between 0 and 9 and displays the count for each number.
 * (HINT: Use an array of 10 integers, say counts, to store the counts for the number of 0s, 1s, . . . , 9s.)
 * 
 * SOLUTION:
 * Array for Counts:
 * An array counts of size 10 is used to store the occurrences of each digit (0 through 9). 
 * Each index corresponds to a digit, e.g., counts[0] for digit 0.
 * Random Number Generation:
 * A Random object generates 100 random integers using nextInt(10) to produce numbers between 0 and 9.
 * Counting Digits:
 * For each random number, the corresponding index in the counts array is incremented.
 * Display Results:
 * The program iterates through the counts array and displays the count of each digit.
 */

import java.util.Random;

public class CountSingleDigits {
    public static void main(String[] args) {
        // Create an array to store the counts of digits 0 through 9
        int[] counts = new int[10];

        // Create a Random object to generate random integers
        Random random = new Random();

        // Generate 100 random integers between 0 and 9
        for (int i = 0; i < 100; i++) {
            int randomNumber = random.nextInt(10); // Generates a number between 0 and 9
            counts[randomNumber]++; // Increment the count for the generated number
        }

        // Display the counts for each digit
        System.out.println("Counts of digits from 0 to 9:");
        for (int i = 0; i < counts.length; i++) {
            System.out.println(i + " occurs " + counts[i] + " times.");
        }
    }
}
