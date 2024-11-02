import java.util.Scanner;

public class MinutesToYears {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter minutes: ");

        int minutes = scanner.nextInt();

        float hours = minutes / 60;

        float days = hours / 24;

        int years = (int) Math.floor(days / 365);

        int daysRemaining = Math.round(days - (years * 365));

        System.out.printf("%d minutes is %d year(s) and %d day(s).", minutes, years, daysRemaining);

        scanner.close();

    }
}
