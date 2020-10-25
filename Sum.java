public class Sum {

    static int sum(int... v) {
        int total = 0;
        for (int i = 0; i < v.length; i++) {
            total += v[i];
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println("The sum of 2 and 5 is: " + sum(2, 5));
        System.out.println("The sum of 123, 47 and 254 is: " + sum(123, 47, 254));
        System.out.println("The sum of 11, 5, 14, 58 and 100 is: " + sum(11, 5, 14, 58, 100));

    }
}
