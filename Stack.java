public class Stack {
    public static void main(String[] args) {

        StackConstructor obj = new StackConstructor(26);
        char ch;

        // put chars into stack
        for (int i = 0; i < 26; i++) {
            obj.push((char) ('a' + i));
        }

        System.out.println("Contents of stack: ");
        for (int i = 0; i < 26; i++) {
            ch = obj.pop();
            System.out.print(ch);
        }
    }
}

class StackConstructor {

    private char[] stack;
    private int top;

    StackConstructor(int n) {
        stack = new char[n];
        top = 0;
    }

    public void push(char ch) {
        if (top == stack.length) {
            System.out.println("-- Stack is full");
            return;
        }
        stack[top++] = ch;
        // top++;
    }

    public char pop() {
        if (top == 0) {
            System.out.println("-- Stack is empty");
            return (char) 0;
        }
        // top--;
        return stack[--top];
    }
}