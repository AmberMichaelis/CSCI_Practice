/* 
 * 5.43 (MATH: COMBINATIONS) Write a program that displays all possible combinations 
 * for picking two numbers from integers 1 to 7. 
 * Also display the total number of all combinations. 
 */

public class MathCombinations {
    public static void main(String[] args) {
        int count = 0;
        for ( int a = 1; a < 8; a++) {
            for (int b = 1; b < 8; b++) {
                System.out.println(a + " " + b);
                count++;
            }
        }
        System.out.println("There are " + count + "combinations.");
    }
}
