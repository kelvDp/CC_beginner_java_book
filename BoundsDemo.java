// Using bounded types, to make sure that the type being passed in 
// is what it is supposed to be in order for the class to work

public class BoundsDemo {
    public static void main(String[] args) {

        NumericFns<Integer> iOb = new NumericFns<>(5); // an Integer is ok cause subclass of Number

        System.out.println("Reciprocal of iOb is " + iOb.reciprocal());

        System.out.println("Fractional component of iOb is " + iOb.fraction());

        System.out.println();

        NumericFns<Double> dOb = new NumericFns<>(5.25); // Double also ok

        System.out.println("Reciprocal of dOb is " + dOb.reciprocal());

        System.out.println("Fractional component of dOb is " + dOb.fraction());

        // This won't compile because String is not subclass of Number
        // NumericFns<String> strOb = new NumericFns<>("Error");

    }
}

// In this version , the type argument for T
// must be either Number or a class derived from number
class NumericFns<T extends Number> { // type T is now bounded by Number

    T num;

    // pass constructor a reference to a numeric object
    NumericFns(T number) {
        this.num = number;
    }

    // return the reciprocal
    double reciprocal() {
        return (1 / num.doubleValue()); // because extending Number, can use all methods relation to it.
    }

    // return fractional component
    double fraction() {
        return (num.doubleValue() - num.intValue());
    }
}

// this functionality can aslo be used to make sure that type params are compatible
// with each other
// in this example : 'V' must either be the same type as 'T', or a subclass of 'T'

class Pair<T, V extends T> {

    T first;
    V second;

    Pair(T a, V b) {
        first = a;
        second = b;
    }
    // .....
}
// the following constructors can be used and are valid for Pair<>

// This is ok because both T and V are Integer
// Pair<Integer, Integer> x = new Pair<>(1, 2);

// This is also ok cause Integer is a subclass of Number.
// Pair<Number, Integer> y = new Pair<>(10.4, 12);