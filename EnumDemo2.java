public class EnumDemo2 {
    public static void main(String[] args) {

        Transport2 tp;

        System.out.println("Here are all Transport constants");

        // use values()
        Transport2[] allFormsTransport = Transport2.values(); // obtain array of transport consts
        for (Transport2 t : allFormsTransport) {
            System.out.print(t + " ");
        } // can also write this in following way:

        // for (Transport2 t: Transport2.values()) {
        // System.out.println(t);
        // }

        System.out.println();

        // use valueOf()
        tp = Transport2.valueOf("AIRPLANE"); // obtain const with name AIRPLANE
        System.out.println("tp contains: " + tp);
    }
}

// Use the built in enumeration methods
// An enum of transport varieties

enum Transport2 {

    CAR, TRUCK, AIRPLANE, TRAIN, BOAT;

}