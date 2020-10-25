package stacks;

public class StackExcDemo {
    public static void main(String[] args) {
        
        Stack stack = new Stack(4);
        char ch;
        int i;

        // insert chars into stack
        try {
            for (i = 0; i < 6; i++) {
                System.out.print("Attempting to add: " + (char) ('A' + i));
                stack.put((char) ('A' + i));
                System.out.println(" - OK");
            }
        } catch (StackFullExc exc) {
            System.out.println(exc);
        }

        // retrieve chars from stack
        try {
            for (i = 0; i < 6; i++) {
                System.out.print("Retrieving : ");
                ch = stack.get();
                System.out.println(ch);
            }
        } catch (StackEmptyExc exc) {
            System.out.println(exc);
        }
    }
}
