interface Activity {
    boolean test(int n);
}

public class Inclusive {
    public static void main(String[] args) {
        Activity a = n -> n >= 10 && n <= 20;

        if (a.test(15))
            System.out.println("15 is between 10 and 20");

        if (!a.test(21))
            System.out.println("21 is over 20");
    }
}
