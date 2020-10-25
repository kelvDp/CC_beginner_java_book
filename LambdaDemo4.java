// Use a generic functional interface

interface SomeTest<T> {
    boolean test(T n, T m); // takes two params and returns boolean
}

public class LambdaDemo4 {
    public static void main(String[] args) {

        // this expression determines wether one Integer is a factor of another
        SomeTest<Integer> isFactor = (n, d) -> (n % d) == 0;

        if (isFactor.test(10, 2))
            System.out.println("2 is a factor of 10");

        System.out.println();

        // this expression determines if one Double is a factor of another
        SomeTest<Double> isFactorD = (n, m) -> (n % m) == 0;

        if (isFactorD.test(212.0, 4.0))
            System.out.println("4.0 is a factor of 212.0");

        System.out.println();

        // this expression determines if one string is part of another
        SomeTest<String> isIn = (a, b) -> a.indexOf(b) != -1;

        String str = "Generic functional interface";

        System.out.println("testing string: " + str);

        if (isIn.test(str, "face"))
            System.out.println("'face' is found.");
        else
            System.out.println("'face' not found");
    }
}
