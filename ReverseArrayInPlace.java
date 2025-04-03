/*
 * (REVERSE AN ARRAY) 
 * The reverse method in Section 7.7 reverses an array by copying it to a new array. 
 * Rewrite the method that reverses the array passed in the argument and returns this array. 
 * Write a test program that prompts the user to enter 10 numbers, 
 * invokes the method to reverse the numbers, and displays the numbers.
 */

import java.util.Scanner;

public class ReverseArrayInPlace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array to store 10 numbers
        int[] numbers = new int[10];

        // Prompt the user to enter 10 numbers
        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Reverse the array in place
        reverse(numbers);

        // Display the reversed array
        System.out.print("Reversed array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        scanner.close();
    }

    /**
     * Method to reverse an array in place.
     * Nothing needs to be returned because arrays are passed by reference
     * 
     * @param array The array to be reversed.
     */
    public static void reverse(int[] array) {
        int start = 0; // pointer at beginning of array
        int end = array.length - 1; // pointer at end of array

        // Swap elements from the start and end of the array
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }
    }
}
