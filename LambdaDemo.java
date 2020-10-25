// Demonstrate two simple lambda expressions

// here is a functional interface
// a func interface only contains one abstract method
interface MyValue {
    double getValue();
}

interface MyParamValue {
    double getValue(double v);
}

public class LambdaDemo {
    public static void main(String[] args) {

        // declare an interface reference
        MyValue myVal;

        // Here, the lambda expression is simply a constant expression.
        // When it is assigned to myVal, a class instance is constructed
        // in which the lambda expression implements the getValue() method in myValue.
        myVal = () -> 98.6;

        // call getValue()
        System.out.println("A constant value: " + myVal.getValue()); // 98.6

        // Here is a parameterized lambda expression assigned to the MyParamValue
        // reference
        // This expression returns a reciprocal of its args
        MyParamValue myPval = n -> 1.0 / n;

        // call getValue(v) through myPval ref
        System.out.println("Reciprocal of 4 is " + myPval.getValue(4));
        System.out.println("Reciprocal of 8 is " + myPval.getValue(8));

        // A lambda expression must be compatible with a method
        // defined by the functional interface. So this won't work:
        // myVal = () -> "three"; // Error : String not compatible with double return
        // type
        // myPval = () -> Math.random(); // Error: Pramater required
    }
}
