public class LoopControl {
    public static void main(String[] args) {

        for (int i = 1; i <= 100;) {
            if (i < 2) System.out.println(i);
            i = i + i;
            System.out.println(i);
        }
    }
}
