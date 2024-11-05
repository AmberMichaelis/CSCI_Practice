import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a monthly savings amount in USD: ");
        float investment = scanner.nextFloat();

        System.out.println("Enter a monthly interest rate: ");
        float rate = scanner.nextFloat() / 100;

        System.out.println("Enter number of months: ");
        float months = scanner.nextFloat();

        float interestEarned = (float) Math.pow((1 + rate), months);

        float total = Math.round(investment * interestEarned);

        System.out.printf("At %.3f interest, you will have %.2f after %.0f months.", rate, total, months);

        scanner.close();
    }
    
}
