/*
 * 6.4 (DISPLAY AN INTEGER REVERSED) Write a method to ­display an integer in reverse order. 
 * For example, reverse(3456) displays 6543. 
 * Write a test program that prompts the user to enter an integer then displays its reversal.
 */

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a whole number: ");
        int num = scanner.nextInt();
        reverse(num);
        scanner.close();
    }

    public static void reverse(int number) {
        int reverse = 0;
        int num = number;
        while (num != 0) {
            reverse = (reverse * 10) + (num % 10);
            num /= 10;
        }
        System.out.println(reverse + " is the reverse of " + number);
    }
}
