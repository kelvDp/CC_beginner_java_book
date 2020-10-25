public class Bubble2 {
    public static void main(String[] args) {

        String[] myArr = { "Hello", "world", "this", "is", "an", "array", "of", "strings", "that", "has", "to", "be",
                "sorted" };

        String t;
        int value = myArr.length;

        System.out.println("Original array: ");
        for (int i = 0; i < value; i++) {
            System.out.print(" " + myArr[i]);
        }

        System.out.println();

        for (int i = 1; i < value; i++) {
            for (int j = value - 1; j >= i; j--) {
                if (myArr[j - 1].length() > myArr[j].length()) {
                    t = myArr[j - 1];
                    myArr[j - 1] = myArr[j];
                    myArr[j] = t;
                }
            }
        }

        System.out.println("Sorted array: ");
        for (int i = 0; i < value; i++) {
            System.out.print(" " + myArr[i]);
        }
    }
}
