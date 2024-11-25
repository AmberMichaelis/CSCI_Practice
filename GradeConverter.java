import java.util.Scanner;

public class GradeConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter grade (A, B, C, D, F): ");
        String letter = input.nextLine();

        if (letter.length() != 1) {
            System.out.println("Invalid input. Please enter a single letter.");
        } else {
            char grade = Character.toUpperCase(letter.charAt(0));
            switch (grade) {
                case 'A':
                    System.out.println("The numeric value for grade A is 4.");
                    break;
                case 'B':
                    System.out.println("The numeric value for grade B is 3.");
                    break;
                case 'C':
                    System.out.println("The numeric value for grade C is 2.");
                    break;
                case 'D':
                    System.out.println("The numeric value for grade D is 1.");
                    break;
                case 'F':
                    System.out.println("The numeric value for grade F is 0.");
                    break;
                default:
                    System.out.println("Invalid input. Please enter a valid letter grade, A B C D or F.");
            }
        }
        input.close();
    }
    
}
