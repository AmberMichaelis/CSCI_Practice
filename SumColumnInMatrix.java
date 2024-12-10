import java.util.Scanner;

public class SumColumnInMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Define the size of the matrix
        final int ROWS = 3;
        final int COLUMNS = 4;
        double[][] matrix = new double[ROWS][COLUMNS];

        // Prompt user to enter the matrix
        System.out.println("Enter a 3-by-4 matrix row by row:");
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }

        // Display the sum of each column
        for (int j = 0; j < COLUMNS; j++) {
            double sum = sumColumn(matrix, j);
            System.out.printf("Sum of the elements at column %d is %.1f%n", j, sum);
        }

        input.close();
    }

    // Method to calculate the sum of a specified column
    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][columnIndex];
        }
        return sum;
    }
}
