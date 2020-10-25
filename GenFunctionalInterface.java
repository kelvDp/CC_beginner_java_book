interface MyFunction<T> {
    T func(T ob);
}

public class GenFunctionalInterface {
    public static void main(String[] args) {
        
        MyFunction<Integer> mf = n -> {
            Integer result = 1;

            if (n <= 1) return n;
            for (int i = 1; i<=n; i++)
                result *= i;
            return result;
        };

        int test = mf.func(4);
        System.out.println(test);

        test = mf.func(5);
        System.out.println(test);
    }
}
