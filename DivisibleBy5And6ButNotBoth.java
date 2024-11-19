/* 
 * 5.11 (FIND NUMBERS DIVISIBLE BY 5 OR 6, BUT NOT BOTH) 
 * Write a program that displays all the numbers from 100 to 200 (10 per line) that are divisible by 5 or 6, but not both.
 * Numbers are separated by exactly one space.
 */ 

public class DivisibleBy5And6ButNotBoth {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100; i <= 200; i++) {
            System.out.print(i  + " ");
            count++;

            if (count == 10) {
                System.out.println();
                count = 0;
            }
        }
    }
    
}
