import java.util.Scanner;

public class ShowCurrentTime {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the timezone offset to GMT (e.g., -5 for EST, 1 for CET): ");
        int offset = scanner.nextInt();

        long totalMilliseconds = System.currentTimeMillis();

        long totalSeconds = totalMilliseconds / 1000;

        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;

        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;

        long currentHourGMT = totalHours % 24;

        long currentHourAdjusted = (currentHourGMT + offset) % 24;

        if (currentHourAdjusted < 0) {
            currentHourAdjusted += 24;
        }

        System.out.printf("The current time is %02d:%02d:%02d%n", currentHourAdjusted, currentMinute, currentSecond);

        scanner.close();

    }

}
