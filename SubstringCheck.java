import java.util.Scanner;

public class SubstringCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String first = scanner.nextLine();

        System.out.println("Enter the second string: ");
        String second = scanner.nextLine();

        if (first.contains(second)) {
            System.out.println("Second string is a substring of first string.");
        } else {
            System.out.println("Second string is NOT a substring of first string.");
        }
        scanner.close();
    }
    
}
