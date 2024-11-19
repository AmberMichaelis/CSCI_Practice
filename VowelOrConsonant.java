import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter: ");
        String letter = input.nextLine();

        if (letter.length() != 1) {
            System.out.println("Invalid input. Please input a single character.");
        } else {
            char ch = letter.charAt(0);

            if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch);

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    System.out.println(ch + " is a vowel.");
                } else {
                    System.out.println(ch + " is a consonant");
                }
            } else {
                System.out.println("Invalid input. Please enter a letter.");
            }
        }
        input.close();

    }
    
}
