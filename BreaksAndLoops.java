public class BreaksAndLoops {
    public static void main(String[] args) {

        // can use a break statement to break out of nested loops
        // do this by labeling a bloc/loop and then using that label name with a break
        // when using a label break, code will continue after block of code in the label
        // specified

        // here is a label
        done: for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    System.out.println(k + " ");
                    if (k == 5)
                        break done; // jumps to done label
                }
                System.out.println("After k loop"); // won't execute
            }
            System.out.println("After j loop"); // won't execute
        }
        System.out.println("After i loop"); // is after done label so will execute
    }
}
// can do the same with continue.