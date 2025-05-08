package com.programs.array.rotate;

public class MoveZeroToRight {
    public static void moveZeroes(int[] nums) {
        int lastNonZeroIndex = 0;
        int i = 0;

        while (i < nums.length) {
            if (nums[i] != 0) {
                // Swap non-zero element with the element at lastNonZeroIndex
                int temp = nums[lastNonZeroIndex];
                nums[lastNonZeroIndex] = nums[i];
                nums[i] = temp;
                // Move to the next position
                lastNonZeroIndex++;
            }
            i++;
        }
    }
    public static void main(String[] args) {
        int[] nums1 = {0, 1, 0, 3, 12};
        int[] nums2 = {0};

        moveZeroes(nums1);
        moveZeroes(nums2);

        System.out.println("Result 1: " + java.util.Arrays.toString(nums1));
        System.out.println("Result 2: " + java.util.Arrays.toString(nums2));
    }
}
/*time complexity of
𝑂(𝑛)
and a space complexity of
𝑂(1)*/
