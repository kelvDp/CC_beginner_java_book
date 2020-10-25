package generics;

// Demonstrate the generic Queue class

public class GenQDemo {
    public static void main(String[] args) {

        // Create an Integer Q
        Integer[] iStore = new Integer[10];
        GenQ<Integer> q = new GenQ<>(iStore);

        Integer iVal;

        System.out.println("Demonstrate a queue of Integers.");

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Adding " + i + " to q.");
                q.put(i);
            }
        } catch (QfullExc e) {
            System.out.println(e);
        }

        System.out.println();

        try {
            for (int i = 0; i < 5; i++) {
                System.out.print("Getting next Integer from q: ");
                iVal = q.get();
                System.out.println(iVal);
            }
        } catch (QemptyExc e) {
            System.out.println(e);
        }

        System.out.println();

        // Create a Double Q
        Double[] dStore = new Double[10];
        GenQ<Double> d = new GenQ<>(dStore);

        Double dVal;

        System.out.println("Demonstrate a queue of Doubles.");

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Adding " + (double) i / 2 + " to d.");
                d.put((double) i / 2);
            }
        } catch (QfullExc e) {
            System.out.println(e);
        }

        System.out.println();

        try {
            for (int i = 0; i < 5; i++) {
                System.out.print("Gettin next value from d: ");
                dVal = d.get();
                System.out.println(dVal);
            }
        } catch (QemptyExc e) {
            System.out.println(e);
        }
    }
}
