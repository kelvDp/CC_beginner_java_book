public class GenericWildCard {
    public static void main(String[] args) {

        Numeric<Integer> iOb = new Numeric<>(6);
        Numeric<Double> dOb = new Numeric<>(-6.0);
        Numeric<Long> lOb = new Numeric<>(5L);

        System.out.println("Testing iOb and dOb");

        // in this call, the wildcard type <?> matches Double
        if (iOb.absEqual(dOb)) {
            System.out.println("Absolute values are equal.");
        } else {
            System.out.println("Absolute values differ.");
        }

        System.out.println();

        // in this call the wildcard matches Long
        System.out.println("Testing iOb and lOb");
        if (iOb.absEqual(lOb)) {
            System.out.println("Absolute values are equal.");
        } else {
            System.out.println("Absolute values differ.");
        }
    }
}

// Using a generic wildcard to allow the passing in of any object type as an arg
class Numeric<T extends Number> {

    T num;

    // pass the constructor a reference to a numeric object
    Numeric(T number) {
        this.num = number;
    }

    // Return the reciprocal
    double reciprocal() {
        return (1 / num.doubleValue());
    }

    // Return fractional
    double fraction() {
        return (num.doubleValue() - num.intValue());
    }

    // Determine wther the absolute value of the two objects are the same
    // here Numeric<?> matches any type of Numeric object allowing any two Numeric
    // objects
    // to have their absolute values compared
    boolean absEqual(Numeric<?> ob) {

        if (Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue())) {
            return true;
        }
        return false;
    }
}