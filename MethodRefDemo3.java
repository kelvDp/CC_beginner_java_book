// Use an instance method reference to refer to any instance

// A functional interface for numeric predicates that operate
// on an object of type MyIntNum and an integer value
interface NumberPredicate {
    boolean test(IntNum mv, int n);
}

// This class stores an int val and defines the instance method isFactor()
// which returns true if its arg is a factor of the stored value
class IntNum {

    private int v;

    IntNum(int x) {
        this.v = x;
    }

    int getNum() {
        return this.v;
    }

    boolean isFactor(int n) {
        return (v % n) == 0;
    }
}

public class MethodRefDemo3 {
    public static void main(String[] args) {

        boolean result;

        IntNum myNum = new IntNum(12);
        IntNum myNum2 = new IntNum(16);

        // This makes inp refer to the instance method isFactor().
        NumberPredicate inp = IntNum::isFactor;

        // the following calls isFactor() on myNum
        result = inp.test(myNum, 3);
        if (result)
            System.out.println("3 is a factor of " + myNum.getNum());

        // The following calls isFactor() on myNum2
        result = inp.test(myNum2, 3);
        if (!result)
            System.out.println("3 is not a factor of " + myNum2.getNum());
    }
}
