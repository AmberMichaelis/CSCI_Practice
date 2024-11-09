import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 0 for scissors, 1 for paper, 2 for rock: ");
        int player = input.nextInt();

        int computer = (int) (Math.random() * 3);

        switch (computer) {
            case 0:
                if (player == 0) {
                    System.out.print("Scissors vs Scissors. Draw.");
                } else if (player == 1) {
                    System.out.print("Scissors vs Paper. You Lose.");
                } else if (player == 2) {
                    System.out.print("Scissors vs Rock. You Win.");
                }
                break;
            case 1:
                if (player == 0) {
                    System.out.print("Paper vs Scissors. You Win.");
                } else if (player == 1) {
                    System.out.print("Paper vs Paper. Draw.");
                } else if (player == 2) {
                    System.out.print("Paper vs Rock. You Lose.");
                }
                break;
        }
        input.close();
    }
}
