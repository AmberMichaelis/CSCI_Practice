import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] arg) {
        // input from user in C
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature in Celcius: ");

        double celcius = scanner.nextDouble();

        // calculation of C to F
        double fahrenheit = (9.0 / 5) * celcius + 32;
        
        // output the F
        System.out.println(celcius + " degrees in Celcius is equal to " + fahrenheit + " degrees in Fahrenheit." );

        scanner.close();
    }
}
