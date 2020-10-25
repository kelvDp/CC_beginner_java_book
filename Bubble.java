public class Bubble {
    public static void main(String[] args) {
        
        // bubble sort algo
        // it is the easiest to understand
        // although is not very efficient
        // only really works for sorting small arrays

        // The number of passes required to ensure that the array is sorted
        // is equal to one less than the number of elements in the array.

        // Notice that sort relies on two for loops. The inner loop checks adjacent elements in the
        // array, looking for out-of-order elements. When an out-of-order element pair is found,
        // the two elements are exchanged. With each pass, the smallest of the remaining
        // elements moves into its proper location. The outer loop causes this process to repeat
        // until the entire array has been sorted.

        int[] nums = { 99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
        int a, b, t;
        int size = 10; // nr of elements to sort

        // display original array
        System.out.print("Original array is: ");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + nums[i]);
        }
        System.out.println();

        // this is a bubble sort:
        for (a = 1; a < size; a++) {
            for (b = size - 1; b >= a; b--) {
                // check if nums is out of order
                if (nums[b - 1] > nums[b]) {
                    // exchange elements
                    t = nums[b - 1];
                    nums[b - 1] = nums[b];
                    nums[b] = t;
                }
            }
        }

        // display sorted array
        System.out.print("Sorted array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + nums[i]);
        }
        System.out.println();
    }
}
