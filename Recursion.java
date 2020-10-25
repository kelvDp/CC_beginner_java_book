public class Recursion {
    public static void main(String[] args) {
        Factorial f = new Factorial();

        // int num = f.factI(5);
        // int num2 = f.factR(5);
        System.out.println("Factorials using recursion method.");
        System.out.println("Factorial of 3 is " + f.factR(3));
        System.out.println("Factorial of 4 is " + f.factR(4));
        System.out.println("Factorial of 5 is " + f.factR(5));
        System.out.println();

        System.out.println("Factorials using iterative method");
        System.out.println("Factorial of 3 is " + f.factI(3));
        System.out.println("Factorial of 4 is " + f.factI(4));
        System.out.println("Factorial of 5 is " + f.factI(5));
        System.out.println();
    }
}

class Factorial {

    // here is a recursive function
    public int factR(int n) {
        int result;

        if (n == 1) return 1;
        result = factR(n - 1) * n;
        
        return result;
    }

    // here is an iterative equivalent
    public int factI(int n) {
        int result = 1;

        for (int t = 1; t <= n; t++) {
            result = result * t;
        }

        return result;
    }
}