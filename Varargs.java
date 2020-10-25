public class Varargs {
    public static void main(String[] args) {
        
        // vaTest() can be called with a variable number of args.
        Test.vaTest(10); // 1 arg
        Test.vaTest(1, 2, 3); // 3 args
        Test.vaTest(); // no args

        Test.vaTest2("One vararg: ", 10);
        Test.vaTest2("Three varargs: ", 1, 2, 3);
        Test.vaTest2("No varargs: ");
    }
}

class Test {
    // here is how to write a method  that takes a variable number of args
    // vaTest() uses varargs

    // declare a vararg with '...'
    static void vaTest(int ...v) {
        System.out.println("Number of args: " + v.length);
        System.out.println("Contents: ");

        for (int i = 0; i < v.length; i++) {
            System.out.println(" arg " + i + ": " + v[i]);
        }
        System.out.println();
    }

    static void vaTest2(String msg, int ...v) {
        System.out.println(msg + v.length);
        System.out.println("Contents: ");

        for (int i = 0; i < v.length; i++) {
            System.out.println(" args " + i + ": " + v[i]);
        }
        System.out.println();

    }
}