package qExceptions;

public class QfullException extends Exception {

    private static final long serialVersionUID = 1L;
    int size;

    QfullException(int s) {
        this.size = s;
    }

    public String toString() {
        return ("\nQueue is full. Maximum size is " + size);
    }
}
