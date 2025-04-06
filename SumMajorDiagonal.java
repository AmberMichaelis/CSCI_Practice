import java.util.Scanner;

public class SumMajorDiagonal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Define the size of the matrix
        final int SIZE = 4;
        double[][] matrix = new double[SIZE][SIZE];

        // Prompt user to enter the matrix
        System.out.println("Enter a 4-by-4 matrix row by row:");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }

        // Calculate the sum of the major diagonal
        double sum = sumMajorDiagonal(matrix);

        // Display the result
        System.out.printf("Sum of the elements in the major diagonal is %.2f%n", sum);

        input.close();
    }

    // Method to sum the major diagonal
    public static double sumMajorDiagonal(double[][] m) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][i];
        }
        return sum;
    }
}
