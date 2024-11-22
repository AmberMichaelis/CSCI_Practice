
/* 
 * 6.7 (FINANCIAL APPLICATION: COMPUTE THE FUTURE INVESTMENT VALUE) 
 * Write a method that computes future investment value at a given interest rate for a specified number of years.
 * For example, futureInvestmentValue(10000, 0.05/12, 5) returns 12833.59.
 * Write a test program that prompts the user to enter the investment amount (e.g., 1,000) and the interest rate (e.g., 9%) 
 * and prints a table that displays future value for the years from 1 to 30.
 */

import java.util.Scanner;

public class InvestmentValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an investment amount:  ");
        double investmentAmount = scanner.nextDouble();

        System.out.println("Enter annual interest rate (ex 9.5 for 9.5%): ");
        double annualRate = scanner.nextDouble();

        double monthlyRate = annualRate / 1200;

        System.out.printf("%-10s%-20s%n", "Years", "Future Value");

        for (int years = 1; years <= 30; years++) {
            double futureValue = futureInvestmentValue(investmentAmount, monthlyRate, years);
            System.out.printf("%-10d%-20.2f%n", years, futureValue);
        }

        scanner.close();
    }

    public static double futureInvestmentValue(double investmentAmount, double monthlyRate, int years) {
        return investmentAmount * Math.pow(1 + monthlyRate, years * 12);
    }

}
