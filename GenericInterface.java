// Generic interface example

/*
    A generic containment interface.
    This interface implies that an implementing
    class contains one or more values
*/
interface Containment<T> {

    // the contains() method tests if a specific item is contained
    // within an object that implements Containment

    boolean contains(T ob);
}

// Implement Containment using an array to hold values
// note : any class that implements a generic interface must also be generic
// unless the class implements a specific type of interface : class GenClass
// implements Containment<Integer>
class GenClass<T> implements Containment<T> {

    T[] arrayRef;

    GenClass(T[] o) {
        this.arrayRef = o;
    }

    // Implemet contains()
    public boolean contains(T ob) {
        for (T x : arrayRef) {
            if (x.equals(ob))
                return true;
        }
        return false;
    }
}

public class GenericInterface {
    public static void main(String[] args) {

        Integer[] x = { 1, 2, 3 };

        GenClass<Integer> ob = new GenClass<>(x);

        if (ob.contains(2))
            System.out.println("2 is in ob.");
        else
            System.out.println("2 is NOT in ob.");

        if (ob.contains(5))
            System.out.println("5 is in ob.");
        else
            System.out.println("5 is NOT in ob.");

        // The following is illegal cause ob is an Integer Containment
        // and 9.25 is a Double value
        // if (ob.contains(9.25))
        // System.out.println("9.25 is in ob.");
    }
}

// if you wanted to limit Containment to numeric types,
// then you could declare it like this:

// interface Containment<T extends Number> {}

// Now, any implementing class must pass to Containment a type argument also having
// the same bound. For example, now MyClass must be declared as shown here:

// class GenClass<T extends Number> implements Containment<T>