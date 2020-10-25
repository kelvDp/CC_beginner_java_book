// A constructor can also be generic even if it's class is not

class Summation {

    private int sum;

    // A generic constructor
    <T extends Number> Summation(T arg) {

        this.sum = 0;
        for (int i = 0; i < arg.intValue(); i++) {
            sum += i;
        }
    }

    int getSum() {
        return this.sum;
    }
}

public class GenConsDemo {
    public static void main(String[] args) {

        Summation ob = new Summation(4.0);

        System.out.println("Summation of 4.0 is " + ob.getSum());
    }
}
