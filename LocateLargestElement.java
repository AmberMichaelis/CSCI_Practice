import java.util.Scanner;

public class LocateLargestElement {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the number of rows and columns of the array
        System.out.println("Enter the number of rows and columns of the array: ");
        int rows = input.nextInt(); // Number of rows
        int columns = input.nextInt(); // Number of columns

        // Create a 2D array with the specified size
        double[][] array = new double[rows][columns];

        // Prompt the user to enter the elements of the array
        System.out.println("Enter the array: ");
        for (int i = 0; i < rows; i++) { // Loop through each row
            for (int j = 0; j < columns; j++) { // Loop through each column
                array[i][j] = input.nextDouble(); // Read the element
            }
        }

        // Find the location of the largest element
        int[] largestLocation = locateLargest(array);

        // Display the location of the largest element
        System.out.println("The location of the largest element is at (" +
                           largestLocation[0] + ", " + largestLocation[1] + ")");

        input.close();
    }

    /**
     * This method locates the largest element in a 2D array.
     *
     * @param a The 2D array to search.
     * @return An array of size 2 containing the row and column indices
     *         of the largest element.
     */
    public static int[] locateLargest(double[][] a) {
        // Initialize the indices of the largest element to the first element
        int[] location = {0, 0};

        // Store the value of the largest element found so far
        double max = a[0][0];

        // Loop through the entire 2D array to find the largest element
        for (int i = 0; i < a.length; i++) { // Loop through each row
            for (int j = 0; j < a[i].length; j++) { // Loop through each column
                if (a[i][j] > max) { // If the current element is larger
                    max = a[i][j]; // Update the largest value
                    location[0] = i; // Update the row index
                    location[1] = j; // Update the column index
                }
            }
        }

        return location; // Return the location of the largest element
    }
}
