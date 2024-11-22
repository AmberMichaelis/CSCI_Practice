/*
 * 5.13 (Find the largest n such that n^3 < 12,000) 
 * Use a while loop to find the largest integer n such that n^3 is less than 12,000.
 */

public class LargestNValue {
    public static void main(String[] args) {
        int n = 1;
        while (Math.pow(n, 3) < 12000) {
            n++;
        }
        n -= 1;
        System.out.println(n + " is the largest integer such that n cubed is less than 12,000.");
    }
}
