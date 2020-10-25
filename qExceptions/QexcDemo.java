package qExceptions;

public class QexcDemo {
    public static void main(String[] args) {
        
        FixedQ queue = new FixedQ(10);
        char ch;
        int i;

        try {
            // overrun the queue
            for (i = 0; i < 11; i++) {
                System.out.print("Attempting to store: " + (char) ('A' + i));
                queue.put((char) ('A' + i));
                System.out.println(" - OK");
            }

            System.out.println();

        } catch (QfullException exc) {
            System.out.println(exc);
        }

        System.out.println();

        try {
            // over-empty the queue
            for (i = 0; i < 11; i++) {
                System.out.print("Getting next char: ");
                ch = queue.get();
                System.out.println(ch);
            }

        } catch (QemptyException exc) {
            System.out.println(exc);
        }
    }
}
