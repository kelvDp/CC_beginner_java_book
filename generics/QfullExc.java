package generics;

// An exception for queue-full errors
public class QfullExc extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    int size;

    QfullExc(int s) {
        this.size = s;
    }

    public String toString() {
        return ("\nQueue is full. Max size is " + size);
    }
}
