package qExceptions;

public class QemptyException extends Exception {

    private static final long serialVersionUID = 1L;

    public String toString() {
        return ("\nQueue is empty.");
    }
}
