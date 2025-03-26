import java.util.Scanner;

public class SumDigits {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a whole number to sum the digits: ");
		int number = scanner.nextInt();

		int sum = getSum(number);
		System.out.println("The sum of the digits is " + sum);
		scanner.close();

	}

	public static int getSum(int number) {
		int sum = 0;
		while (number != 0) {
			sum += number % 10;
			number  /= 10;
		}
		return sum;
	}
}
