/*
 * 6.3 (PALINDROME INTEGER) Use the reverse method to implement isPalindrome. 
 * A number is a palindrome if its reversal is the same as itself. 
 * Write a test program that prompts the user to enter an integer and reports whether the integer is a palindrome.
 */

import java.util.Scanner;

public class checkPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a whole number: ");
        int number = scanner.nextInt();
        int reverse = reverse(number);
        boolean isPalindrome = isPalindrome(number, reverse);

        if (isPalindrome) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }

        scanner.close();
    }
    
    public static boolean isPalindrome(int num, int rev) {
        if (num == rev) {
            return true;
        } else {
            return false;
        }
    }

    public static int reverse(int num) {
        int reverse = 0;
        while (num != 0) {
            reverse = (reverse * 10) + num % 10;
            num /= 10;
        }
        return reverse;
    }
}
