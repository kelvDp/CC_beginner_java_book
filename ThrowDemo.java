public class ThrowDemo {
    public static void main(String[] args) {

        // manually throw an exception
        try {
            System.out.println("Before throw");
            throw new ArithmeticException();
        } catch (ArithmeticException e) {
            // catch the exception
            System.out.println("Exception has been caught.");
        }
        System.out.println("After try/catch block.");
    }
}
