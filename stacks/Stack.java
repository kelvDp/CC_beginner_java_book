package stacks;

public class Stack {

    private char[] stack;
    private int top;

    Stack(int size) {
        stack = new char[size];
        top = 0;
    }

    public void put(char ch) throws StackFullExc {

        if (top == stack.length) {
            throw new StackFullExc();
        }

        stack[top++] = ch;
    }

    public char get() throws StackEmptyExc {

        if (top == 0) {
            throw new StackEmptyExc();
        }

        return stack[--top];
    }
}
