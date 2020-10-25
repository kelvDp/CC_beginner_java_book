public class InchesToMeters {
    public static void main(String[] args) {
        
        double meters, inches;
        int counter = 0;

        // 1 foot = 12 inches --> 12 feet = 144 inches
        for (inches = 1; inches <= 144; inches++) {
            meters = inches / 39.37;
            System.out.println(inches + " inche(s) equals " + meters + " meters");

            counter++;
            if (counter == 12) {
                System.out.println();
                counter = 0;
            }
        }
    }
}
