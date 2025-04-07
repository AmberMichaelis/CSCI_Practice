import java.util.Arrays;
import java.util.Scanner;

public class Sort2DArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the number of rows and columns
        System.out.println("Enter the number of rows and columns for the array: ");
        int rows = input.nextInt();
        int columns = input.nextInt();

        // Initialize a two-dimensional array
        int[][] array = new int[rows][columns];

        // Prompt the user to enter the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) { // Loop through rows
            for (int j = 0; j < columns; j++) { // Loop through columns
                array[i][j] = input.nextInt();
            }
        }

        // Close the scanner to prevent resource leaks
        input.close();

        // Sort the two-dimensional array
        sort(array);

        // Display the sorted array
        System.out.println("The sorted array is:");
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }

    /**
     * Sorts a two-dimensional array.
     * The method performs a primary sort on rows and a secondary sort on columns.
     *
     * @param m The two-dimensional array to be sorted.
     */
    public static void sort(int[][] m) {
        // Use Arrays.sort with a custom comparator to sort rows and then columns
        Arrays.sort(m, (row1, row2) -> {
            // Compare the first elements of the rows for primary sorting
            if (row1[0] != row2[0]) {
                return Integer.compare(row1[0], row2[0]);
            }

            // If the first elements are the same, compare the second elements
            for (int i = 1; i < Math.min(row1.length, row2.length); i++) {
                if (row1[i] != row2[i]) {
                    return Integer.compare(row1[i], row2[i]);
                }
            }

            // Rows are equal if all elements are the same
            return 0;
        });
    }
}
