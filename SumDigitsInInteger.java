import java.util.Scanner;

public class SumDigitsInInteger {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int num = input.nextInt();
		int reverse = reverse(num);
		int sum = sumofDigits(num);
		System.out.printf("The reverse is %d and the sum is %d.", reverse, sum);
		input.close();
	}

	public static int reverse(int number) {
		int num = number;
		int backwards = 0;
		int digit = 0;
		while (num != 0) {
			digit = num % 10;
			backwards = backwards * 10 + digit;
			num /= 10;
		}
		return backwards;
	}

	public static int sumofDigits(int number) {
		int sum = 0;
		int num = number;
		for (int i = 0; num > 0; i++) {
			sum += num % 10;
			num /= 10;
		}
		return sum;
	}
}
