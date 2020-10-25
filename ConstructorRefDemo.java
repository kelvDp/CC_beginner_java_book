// Demonstrate a constructor reference

// MyFunc is a functional interface whose method returns a MyOtherClass reference
interface MyFunc {
    MyOtherClass func(String s);
}

class MyOtherClass {
    private String str;

    // This constructor takes an arg
    MyOtherClass(String s) {
        this.str = s;
    }

    // This is the default constructor
    MyOtherClass() {
        this.str = "";
    }

    String getString() {
        return this.str;
    }
}

public class ConstructorRefDemo {
    public static void main(String[] args) {

        // Create a ref to MyOtherClass constructor.
        // Because func() in MyFunc takes an arg, new refers to
        // the parameterized constructor in MyClass, not default one
        MyFunc myClassCons = MyOtherClass::new; // -- constructor reference

        // Create an instance of MyOther... via the constructor ref
        MyOtherClass mc = myClassCons.func("Testing");

        // Use the instance of mc just created
        System.out.println("str in mc is " + mc.getString());

    }
}
