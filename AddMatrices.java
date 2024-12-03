/*
 * SOLUTION:
 * Input Handling:
 * The program defines two 3×3 matrices (matrix1 and matrix2) 
 * and prompts the user to enter their elements row by row.
 * Matrix Addition:
 * The addMatrix method iterates through each element of the matrices 
 * and adds corresponding elements to create the resulting matrix.
 * Output Formatting:
 * The program prints the two matrices side by side, followed by their sum. 
 * It aligns the "+" and "=" symbols in the middle row for clarity.
 */

import java.util.Scanner;

public class AddMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define the size of the matrices
        final int ROWS = 3;
        final int COLUMNS = 3;

        // Create two matrices to store user input
        double[][] matrix1 = new double[ROWS][COLUMNS];
        double[][] matrix2 = new double[ROWS][COLUMNS];

        // Prompt the user to enter the first matrix
        System.out.println("Enter matrix1:");
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                matrix1[i][j] = scanner.nextDouble();
            }
        }

        // Prompt the user to enter the second matrix
        System.out.println("Enter matrix2:");
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                matrix2[i][j] = scanner.nextDouble();
            }
        }

        // Add the two matrices
        double[][] result = addMatrix(matrix1, matrix2);

        // Display the result
        System.out.println("The matrices are added as follows:");
        for (int i = 0; i < ROWS; i++) {
            // Print each row of matrix1
            for (int j = 0; j < COLUMNS; j++) {
                System.out.printf("%.1f ", matrix1[i][j]);
            }
            System.out.print((i == ROWS / 2) ? " +  " : "    "); // Print "+" in the middle row

            // Print each row of matrix2
            for (int j = 0; j < COLUMNS; j++) {
                System.out.printf("%.1f ", matrix2[i][j]);
            }
            System.out.print((i == ROWS / 2) ? " =  " : "    "); // Print "=" in the middle row

            // Print each row of the result matrix
            for (int j = 0; j < COLUMNS; j++) {
                System.out.printf("%.1f ", result[i][j]);
            }
            System.out.println();
        }

        scanner.close();
    }

    /**
     * Method to add two matrices.
     * 
     * @param a The first matrix.
     * @param b The second matrix.
     * @return The resulting matrix after addition.
     */
    public static double[][] addMatrix(double[][] a, double[][] b) {
        int rows = a.length;
        int columns = a[0].length;
        double[][] result = new double[rows][columns];

        // Add corresponding elements of a and b
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }

        return result;
    }
}
