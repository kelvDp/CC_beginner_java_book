package generics;

// an exception for queue - empty errors
public class QemptyExc extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public String toString() {
        return ("\nQueue is empty.");
    }
}
