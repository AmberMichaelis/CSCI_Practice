import java.util.Scanner;

public class MultiplyMatrices {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the first 3x3 matrix
        System.out.println("Enter matrix1 (row by row): ");
        double[][] matrix1 = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix1[i][j] = input.nextDouble();
            }
        }

        // Prompt the user to enter the second 3x3 matrix
        System.out.println("Enter matrix2 (row by row): ");
        double[][] matrix2 = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix2[i][j] = input.nextDouble();
            }
        }

        // Multiply the two matrices and store the result
        double[][] resultMatrix = multiplyMatrix(matrix1, matrix2);

        // Display the result with formatted output
        System.out.println("The multiplication of the matrices is: ");
        displayMatrix(matrix1); // Display the first matrix
        System.out.println("*");
        displayMatrix(matrix2); // Display the second matrix
        System.out.println("=");
        displayMatrix(resultMatrix); // Display the result of the multiplication

        input.close();
    }

    /**
     * Multiplies two matrices and returns the resulting matrix.
     *
     * @param a The first matrix.
     * @param b The second matrix.
     * @return The resulting matrix after multiplication.
     */
    public static double[][] multiplyMatrix(double[][] a, double[][] b) {
        // Create a new matrix to store the result
        double[][] result = new double[a.length][b[0].length];

        // Iterate through each row of the first matrix
        for (int i = 0; i < a.length; i++) {
            // Iterate through each column of the second matrix
            for (int j = 0; j < b[0].length; j++) {
                // Initialize the current cell in the result matrix
                result[i][j] = 0;

                // Perform the dot product of the row in 'a' and the column in 'b'
                for (int k = 0; k < a[0].length; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return result; // Return the resulting matrix
    }

    /**
     * Displays a matrix in a formatted way.
     *
     * @param matrix The matrix to display.
     */
    public static void displayMatrix(double[][] matrix) {
        // Loop through each row in the matrix
        for (double[] row : matrix) {
            // Loop through each element in the row
            for (double value : row) {
                // Print each value with one decimal place for readability
                System.out.printf("%6.1f ", value);
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
