import java.util.Scanner;

public class SumDigitsInInteger {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a whole number: ");
        int digit = scanner.nextInt();

        int sum = 0;

        while (digit > 0) {
            System.out.println(digit);
            sum += digit % 10;
            digit /= 10;
        }

        System.out.println("The sum of the digits is " + sum + ".");
        
        scanner.close();
    }
}
