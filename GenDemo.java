public class GenDemo {
    public static void main(String[] args) {
        // create a Gen reference for Integers.
        Gen<Integer> iOb;

        // create a Gen<Integer> object and assign its ref to iOb.
        iOb = new Gen<Integer>(88);

        // show the type of data used by iOb
        iOb.showType();

        // Get value in iOb
        int value = iOb.getObj();
        System.out.println("Value: " + value);

        System.out.println();

        // create a Gen object for type String
        Gen<String> strObj = new Gen<String>("Generics Test");

        // show the type of data used by strObj
        strObj.showType();

        // Get value in iOb
        String str = strObj.getObj();
        System.out.println("Value: " + str);
    }
}

// Here is a simple generic class .
// The 'T' is a type parameter that will be replaced by a real type
// when an object of type Gen is created

class Gen<T> {  // T is just a placeholder/ param for the object that still has to be passed in

    // declare an object of type T
    T obj;

    // pass the constructor ref to an object of type T
    Gen(T object) {
        this.obj = object;
    }

    // return obj
    T getObj() {
        return obj;
    }

    // show type of T
    void showType() {
        System.out.println("Type of 'T' is " + obj.getClass().getName());
    }

}