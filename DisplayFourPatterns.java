/*
 * 5.18 (DISPLAY FOUR PATTERNS USING LOOPS) Use nested loops that display the following patterns in four separate programs:
 */
public class DisplayFourPatterns {
    public static void main(String[] args) {
        System.out.println("Pattern A:");
        displayPatternA();

        System.out.println();

        System.out.println("Pattern B:");
        displayPatternB();

        System.out.println();

        System.out.println("Pattern C:");
        displayPatternC();

        System.out.println();

        System.out.println("Pattern D:");
        displayPatternD();
    }

    public static void displayPatternA() {
        for (int row = 1; row <= 6; row++) {
            for (int num = 1; num <= row; num++) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void displayPatternB() {
        for (int row = 6; row >= 1; row--) {
            for (int num = 1; num <= row; num++) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void displayPatternC() {
        for (int row = 1; row <= 6; row++) {
            for (int spaces = (6 - row); spaces >= 1; spaces--) {
                System.out.print(" ");
            }
            for (int num = row; num >= 1; num--) {
                System.out.print(num);
            }
            System.out.println();
        }
    }

    public static void displayPatternD() {
        for (int row = 1; row <= 6; row++) {
            for (int space = 1; space < row; space++) {
                System.out.print("  ");
            }
            for (int num = 1; num <= 6 - row + 1; num++) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
