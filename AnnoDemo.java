public class AnnoDemo {
    public static void main(String[] args) {
        
        MyClass myObj = new MyClass("test");

        System.out.println(myObj.getMsg());
    }
}


// An example that uses the @Deprecated annotation to mark something as deprecated

// deprecate a class
@Deprecated
class MyClass {
    private String msg;

    MyClass(String m) {
        msg = m;
    }

    // deprecate a method within a class
    @Deprecated
    String getMsg() {
        return msg;
    }
}