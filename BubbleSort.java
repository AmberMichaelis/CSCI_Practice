/*
 * (BUBBLE SORT) Write a sort method that uses the bubble-sort algorithm. 
 * The bubble-sort algorithm makes several passes through the array. 
 * On each pass, successive neighboring pairs are compared. 
 * If a pair is not in order, its values are swapped; otherwise, the values remain unchanged. 
 * The technique is called a bubble sort or sinking sort because the smaller values gradually “bubble” their way to the top, 
 * and the larger values “sink” to the bottom. 
 * Write a test program that reads in 10 double numbers, invokes the method, and displays the sorted numbers.
 */

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store 10 double numbers
        double[] numbers = new double[10];

        // Prompt the user to enter 10 numbers
        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextDouble();
        }

        // Sort the array using bubble sort
        bubbleSort(numbers);

        // Display the sorted array
        System.out.print("Sorted numbers: ");
        for (double num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }

    /**
     * Sorts an array using the bubble sort algorithm.
     * 
     * @param array The array to be sorted.
     */
    public static void bubbleSort(double[] array) {
        boolean swapped;

        // Loop through the array multiple times
        do {
            swapped = false; // Reset swapped flag at the start of each pass

            // Compare successive pairs of elements
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    // Swap elements if they are out of order
                    double temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                    swapped = true; // Indicate that a swap has occurred
                }
            }
        } while (swapped); // Continue looping until no swaps are made
    }
}
