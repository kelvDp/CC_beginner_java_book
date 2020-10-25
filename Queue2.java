public class Queue2 {
    public static void main(String[] args) {
        Constructor bigQ = new Constructor(100);
        Constructor smallQ = new Constructor(4);

        char ch;
        int i;

        System.out.println("Using bigQ to store the alphabet.");

        // put some nrs into bigQ
        for (i = 0; i < 26; i++) {
            bigQ.put((char) ('A' + i));
        }

        // retrieve and display elements from bigQ
        System.out.println("Contents of bigQ: ");
        for (i = 0; i < 26; i++) {
            ch = bigQ.get();
            if (ch != (char) 0)
                System.out.print(ch);
        }
        System.out.println("\n");

        System.out.println("Using smallQ to generate errors.");

        for (i = 0; i < 5; i++) {
            System.out.print("Attempting to store " + (char) ('Z' - i));
            smallQ.put((char) ('Z' - i));
            System.out.println();
        }

        System.out.println();

        // more errors on smallQ
        System.out.print("Contents of smallQ: ");
        for (i = 0; i < 5; i++) {
            ch = smallQ.get();
            if (ch != (char) 0)
                System.out.print(ch);
        }
    }
}

class Constructor {

    private char[] q; // this array will hold the queue
    private int putLocation, getLocation; // the put and get indices

    // constructor
    Constructor(int size) {
        q = new char[size]; // allocates memory for the queue
        this.putLocation = this.getLocation = 0;
    }

    // void method to put characters into the queue
    void put(char ch) {
        if (putLocation == q.length) {
            System.out.println(" - Queue is full");
            return; // -- same as break;
        }
        q[putLocation++] = ch;
    }

    // void method to get character from queue
    char get() {
        if (getLocation == putLocation) {
            System.out.println("- Queue is empty");
            return (char) 0;
        }
        return q[getLocation++];
    }

}