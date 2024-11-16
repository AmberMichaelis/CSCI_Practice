public class DivisibleBy5and6 {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 100; i <=1000; i++) {
            System.out.print(i + " ");
            count++;

            if (count == 10) {
                System.out.println();
                count = 0;
            }
        }
    }
    
}
