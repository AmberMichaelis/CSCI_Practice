/*
 * 5.12 (Find the smallest n such that n^2 > 12,000) 
 * Use a while loop to find the smallest integer n such that n^2 is greater than 12,000.
 */

public class SmallestNValue {
    public static void main(String[] args) {
        int n = 1;
        while (Math.pow(n, 2) <= 12000) {
            n++;
        }
        System.out.println(n + " is the smallest integer in which the squared value is greater than 12,000 ");
    }
    
}
