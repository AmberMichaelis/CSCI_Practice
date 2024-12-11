/*
 * Write a test program that prompts the user to enter 10 numbers, 
 * invokes this method to return the minimum value, and displays the minimum value.
 */

import java.util.Scanner;

public class FindSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array to store 10 numbers
        double[] numbers = new double[10];

        // Prompt the user to enter 10 numbers
        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextDouble();
        }

        // Find the smallest number using the min method
        double minimum = min(numbers);

        // Display the smallest number
        System.out.printf("The minimum number is %.1f%n", minimum);

        scanner.close();
    }

    /**
     * Method to find the smallest element in an array of doubles.
     * 
     * @param array The array of double values.
     * @return The smallest value in the array.
     */
    public static double min(double[] array) {
        double min = array[0]; // Assume the first element is the smallest
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i]; // Update min if a smaller value is found
            }
        }
        return min;
    }
}
