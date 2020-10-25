public class EnumDemo4 {
    public static void main(String[] args) {
        TransportType t1, t2, t3;

        // get ordinal values using ordinal()
        System.out.println("Here are all the transport constants and their ordinal values: ");
        for (TransportType t : TransportType.values()) {
            System.out.println(t + " " + t.ordinal());
        }

        t1 = TransportType.AIRPLANE;
        t2 = TransportType.TRAIN;
        t3 = TransportType.AIRPLANE;

        System.out.println();

        // demonstrate compareTo()
        if (t1.compareTo(t2) < 0) {
            System.out.println(t1 + " comes before " + t2);
        }

        if (t1.compareTo(t2) > 0) {
            System.out.println(t1 + " comes after " + t2);
        }

        if (t1.compareTo(t3) == 0) {
            System.out.println(t1 + " equals " + t3);
        }
    }
}

// Demonstrate ordinal() and compareTo()
enum TransportType {

    CAR, TRUCK, AIRPLANE, TRAIN, BOAT;

}