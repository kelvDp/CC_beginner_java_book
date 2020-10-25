// Use a method reference to an instance method

interface IntPredicate2 {
    boolean test(int n);
}

// this class stores an int value and defines the instance method
// isFactor(), which returns true if arg is factor of stored val
class MyIntNum {

    private int v;

    MyIntNum(int x) {
        this.v = x;
    }

    int getNum() {
        return v;
    }

    // return true if n is factor of v.
    boolean isFactor(int n) {
        return (v % n) == 0;
    }
}

public class MethodRefDemo2 {
    public static void main(String[] args) {

        // here will be using method references to instance methods

        boolean result;

        MyIntNum myNum = new MyIntNum(12);
        MyIntNum myNum2 = new MyIntNum(16);

        // Here, a method ref to isFactor on myNum is created
        IntPredicate2 ip = myNum::isFactor;

        // Now, it is used to call isFactor() via test()
        result = ip.test(3);
        if (result)
            System.out.println("3 is a factor of " + myNum.getNum());

        // This time, a method ref to isFactor on myNum2 is created.
        ip = myNum2::isFactor;
        result = ip.test(3);
        if (!result)
            System.out.println("3 is not a factor of " + myNum2.getNum());
    }
}
