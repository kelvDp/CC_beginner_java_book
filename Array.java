public class Array {
    public static void main(String[] args) {
        
        // example of an array and how to find the min and max out of it

        int min, max;
        int[] nums = new int[10];

        nums[0] = 99;
        nums[1] = -10;
        nums[2] = 100123;
        nums[3] = 18;
        nums[4] = -978;
        nums[5] = 5623;
        nums[6] = 463;
        nums[7] = -9;
        nums[8] = 287;
        nums[9] = 49;

        min = max = nums[0]; // so is = 99;

        // loop to find min and max
        for (int i = 1; i < 10; i++) {
            if (nums[i] < min) min = nums[i];
            if (nums[i] > max) max = nums[i];
        }

        System.out.println("min = " + min + "; and max = " + max);
    }
}
