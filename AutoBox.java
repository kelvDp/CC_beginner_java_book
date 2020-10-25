public class AutoBox {
    public static void main(String[] args) {
        
        // With newer versions of java, boxing and unboxing happens automatically
        Integer iOb = 100; // autobox an int

        int i = iOb; // auto unbox

        System.out.println(i + " " + iOb);
    }
}
