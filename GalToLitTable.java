public class GalToLitTable {
    
    public static void main(String[] args) {
        
        double gallon, liters;
        int counter = 0;

        for (gallon = 1; gallon <= 100; gallon++) {
            liters = gallon * 3.7854;
            System.out.println(gallon + " gallon is equivalent to " + liters + " liters.");

            counter++;
            if (counter == 10) {
                System.out.println();
                counter = 0;
            }
        }
    }
}
