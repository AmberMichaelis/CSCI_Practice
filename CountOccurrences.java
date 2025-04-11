/*
 * COUNT OCCURRENCES
 * Write a program that reads the integers between 1 and 100, 
 * then counts and displays the occurrences of each. 
 * Assume the input ends with 0. 
 * If a number occurs more than one time, the plural word “times” is used in the output. 
 * Numbers are displayed in increasing order.
 */

import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        
        // Create an array to store the counts for numbers 1 through 100
        // Index 0 is unused so that integers map directly to its corresponding index
        // Ex: count for number 1 maps to counts[1]
        int[] counts = new int[101];
        
        // Prompt user for numbers
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the integers between 1 and 100 (end with 0):");

        // Read numbers and count their occurrences
        while (true) {
            int number = input.nextInt();

            if (number == 0) { // Stop when input is 0
                break;
            }

            if (number >= 1 && number <= 100) {
                counts[number]++;
            }
        }

        // Display the results
        for (int i = 1; i <= 100; i++) {
            if (counts[i] > 0) {
                System.out.println(i + " occurs " + counts[i] + (counts[i] > 1 ? " times" : " time"));
            }
        }

        input.close();
    }
}
