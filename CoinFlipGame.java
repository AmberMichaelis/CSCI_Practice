import java.util.Scanner;
import java.util.Random;

public class CoinFlipGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generate a random integer, 0 or 1 (0 = heads, 1 = tails)
        int coinFlip = random.nextInt(2); 

        // Prompt the user to enter a guess
        System.out.print("Guess the coin flip result (0 for heads, 1 for tails): ");
        int userGuess = scanner.nextInt();

        // Check if the guess is correct
        if (userGuess == coinFlip) {
            System.out.println("Correct! You guessed it.");
        } else {
            System.out.println("Incorrect. Better luck next time!");
        }

        // Display the result of the coin flip
        System.out.println("The coin flip was: " + (coinFlip == 0 ? "heads" : "tails"));

        scanner.close();
    }
}
