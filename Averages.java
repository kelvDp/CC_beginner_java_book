public class Averages {
    public static void main(String[] args) {

        double[] values = {75.2, 40.0, 89.52, 70.77, 56.6, 56.0, 80.20, 90.0, 91.23, 40.0};
        double avg = 0;

        for (int i = 0; i < values.length; i++) {
            avg += values[i];
        }

        avg = avg / values.length;

        System.out.println("The average of the ten values: " + avg);
    }
}
