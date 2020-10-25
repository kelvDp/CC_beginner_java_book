// Demonstrate a simple generic method
// Can declare generic methods outside of a generic class

class GenericMethodDemo {

    // determine wether contents of two arrays are the same
    // in this generic method, type params are declared before return type
    // note : Comparable is an interface, but have to use extends in gen method
    // cant implement 
    static <T extends Comparable<T>, V extends T> boolean arraysEqual(T[] x, V[] y) {

        // if arrays length differs, then arrays differ
        if (x.length != y.length)
            return false;

        for (int i = 0; i < x.length; i++) {
            if (!x[i].equals(y[i]))
                return false; // arrays differ
        }

        return true; // contents of array are equal
    }

    public static void main(String[] args) {

        Integer[] nums = { 1, 2, 3, 4, 5 };
        Integer[] nums2 = { 1, 2, 3, 4, 5 };
        Integer[] nums3 = { 1, 2, 7, 4, 5 };
        Integer[] nums4 = { 1, 2, 7, 4, 5, 6 };

        // the type arguments for T and V are implicitly determined when the method is
        // called
        if (arraysEqual(nums, nums))
            System.out.println("nums == nums");

        if (arraysEqual(nums, nums2))
            System.out.println("nums == nums2");

        if (arraysEqual(nums, nums3))
            System.out.println("nums == nums3");

        if (arraysEqual(nums, nums4))
            System.out.println("nums == nums4");

        // Create an array of doubles
        // Double[] dVals = { 1.1, 2.2, 3.3, 4.4, 5.5 };

        // This won't compile cause nums and dVals are not of the same type
        // if (arraysEqual(nums, dVals))
        //     System.out.println("nums == dVals");
    }
}