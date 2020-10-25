// Demonstrate a method reference for a static method

interface Intpredicate {
    boolean test(int n);
}

// This class defines three static methods that check an integer against a
// condition
class MyIntPredicates {

    // static method that returns true if prime
    static boolean isPrime(int n) {
        if (n < 2)
            return false;

        for (int i = 2; i <= (n / i); i++) {
            if ((n % i) == 0)
                return false;
        }
        return true;
    }

    // static method that returns true if num is even
    static boolean isEven(int n) {
        return (n % 2) == 0;
    }

    // static method that returns true if num is positive
    static boolean isPositive(int n) {
        return (n > 0);
    }
}

public class MethodRefDemo {

    // This method has a functional interface as the type of its first param.
    // so can be passed a ref to any instance of that interface, including one
    // created by a method ref
    static boolean numTest(Intpredicate p, int v) {
        return p.test(v);
    }

    public static void main(String[] args) {

        boolean result;
        // Using method references to a static method

        // Here, a method ref to isPrime is passed to numTest()
        result = numTest(MyIntPredicates::isPrime, 17);
        if (result)
            System.out.println("17 is prime.");

        // method ref to isEven used
        result = numTest(MyIntPredicates::isEven, 12);
        if (result)
            System.out.println("12 is even.");

        // method ref to isPositive passed
        result = numTest(MyIntPredicates::isPositive, 11);
        if (result)
            System.out.println("11 is positive.");

    }
}
