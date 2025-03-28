/*
 * Write a program that reads in 10 numbers and displays the number of distinct numbers 
 * and the distinct numbers in their input order and separated by exactly one space 
 * (i.e., if a number appears multiple times, it is displayed only once). 
 * (HINT: Read a number and store it to an array if it is new. 
 * If the number is already in the array, ignore it.) 
 * After the input, the array contains the distinct numbers.
 */

import java.util.Scanner;

public class PrintDistinctNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Array to hold up to 10 distinct numbers
        int[] distinctNumbers = new int[10];
        int count = 0; // To track the number of distinct numbers

        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            int number = input.nextInt();

            // Check if the number is already in the array
            boolean isDistinct = true;
            for (int j = 0; j < count; j++) {
                if (distinctNumbers[j] == number) {
                    isDistinct = false;
                    break;
                }
            }

            // If the number is distinct, add it to the array
            if (isDistinct) {
                distinctNumbers[count++] = number;
            }
        }

        // Output the results
        System.out.println("The number of distinct numbers is " + count);
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < count; i++) {
            System.out.print(distinctNumbers[i] + " ");
        }

        input.close();
    }
}
