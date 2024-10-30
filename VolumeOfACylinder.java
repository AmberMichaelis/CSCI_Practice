import java.util.Scanner;

public class VolumeOfACylinder {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a radius in feet: ");
        double radius = scanner.nextDouble();
        
        System.out.println("Enter a length feet: ");
        double length = scanner.nextDouble();

        double area = radius * radius * Math.PI;
        double volume = Math.round(area * length * 100) / 100.0;

        System.out.println("The cylinder is " + volume + " cubic feet.");

        scanner.close();
    }

}
