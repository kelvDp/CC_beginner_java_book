package stacks;

public class StackFullExc extends Exception {

    private static final long serialVersionUID = 1L;

    public String toString() {
        return ("\nStack is full.");
    }
}
