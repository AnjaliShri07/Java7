package com.java7.programs.array;

public class RightRotateWithLongInput {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Normalize k

        reverse(nums, 0, n - 1); // Reverse the whole array
        reverse(nums, 0, k - 1); // Reverse the first k elements
        reverse(nums, k, n - 1); // Reverse the remaining elements
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        long startTime = System.nanoTime(); // Capture start time

        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate(nums, k);

        long endTime = System.nanoTime(); // Capture end time
        long duration = endTime - startTime; // Calculate duration

        // Print result and duration
        System.out.println("Rotated Array: " + java.util.Arrays.toString(nums));
        System.out.println("Duration: " + duration + " nanoseconds");
    }
}
