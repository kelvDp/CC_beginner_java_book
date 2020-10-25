interface NumericFunc {
    int test(int n);
}

public class BlockLambda2 {
    public static void main(String[] args) {

        NumericFunc nf = n -> {
            int result = 1;

            if (n <= 1)
                return n;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        };

        int test = nf.test(4);
        System.out.println(test);

        test = nf.test(5);
        System.out.println(test);
    }
}
