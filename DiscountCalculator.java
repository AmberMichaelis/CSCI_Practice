public class DiscountCalculator {

    public static void main(String[] arg) {
        double cost = 1293.42;
        double discountRate = 0.20;

        // Calculation 1
        double discount1 = cost * discountRate;
        System.out.println("discount = cost * discountRate: " + discount1);

        // Calculation 2
        double discount2 = cost * discountRate * 100;
        System.out.println("discount = cost * discountRate * 100: " + discount2);

        // Calculation 3
        int discount3 = (int) cost * (int) (discountRate * 100);
        System.out.println("discount = (int) cost * discountRate * 100: " + discount3);

        // Calculation 4
        int discount4 = (int) (cost * discountRate * 100);
        System.out.println("discount = (int) (cost * discountRate * 100): " + discount4);

        // Calculation 5
        int discount5 = (int) (cost * discountRate * 100) / 100;
        System.out.println("discount = (int) (cost * discountRate * 100) / 100: " + discount5);

         // Calculation 6
         double discount6 = (int) (cost * discountRate * 100) / 100.0;
         System.out.println("discount = (int) (cost * discountRate * 100) / 100.0: " + discount6);

          // Calculation 7
        double discount7 = (int) (cost * discountRate * 10) / 10.0;
        System.out.println("discount = (int) (cost * discountRate * 10) / 10.0: " + discount7);
    }
}
