import java.util.Scanner;

public class NumberStats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positives = 0;
        int negatives = 0;
        int sum = 0;
        int count = 0;

        System.out.println("Enter integers (input ends with 0): ");

        while (true) {
            // Read integers (grabs one at a time)
            int number = scanner.nextInt();

            // Break if 0
            if (number == 0) {
                break;
            }

            // Update counters and total
            if (number > 0) {
                positives++;
            } else {
                negatives++;
            }

            sum += number;
            count++;

        }
        // Display results
        if (count == 0) {
            System.out.println("No numbers were entered except 0.");
        } else {
            double average = (double) sum / count;
            System.out.println("Positives: " + positives);
            System.out.println("Negatives: " + negatives);
            System.out.println("Total: " + sum);
            System.out.println("Average: " + average);
        }
        scanner.close();
    }

}
