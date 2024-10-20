package com.java7.programs.array.ArraysSum;

public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        // Step 1: Initialize the max_sum and current_sum with the first element
        int max_sum = nums[0];
        int current_sum = nums[0];

        // Step 2: Traverse the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // Decide whether to add the current element to the existing subarray or start a new one
            current_sum = Math.max(nums[i], current_sum + nums[i]);

            // Update the max_sum if current_sum is greater
            max_sum = Math.max(max_sum, current_sum);
        }

        // Step 3: Return the maximum subarray sum
        return max_sum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum Subarray Sum: " + maxSubArray(nums));  // Output: 6
    }
}

/*The optimal approach to solve this problem is Kadane’s Algorithm, which works in O(n) time and only requires a single traversal of the array.

Kadane’s Algorithm:
The idea is to keep track of the current maximum subarray sum (current_sum) and the global maximum subarray sum (max_sum). We iterate through the array and for each element, decide if we should:

Continue adding the current element to the existing subarray.
Start a new subarray with just the current element.
At each step, we update the global maximum if the current_sum exceeds the max_sum.

        Steps:
Initialize two variables:

max_sum: the global maximum subarray sum (initially set to nums[0]).
current_sum: the sum of the current subarray (also initially set to nums[0]).
Iterate through the array starting from the second element:

For each element nums[i], decide whether to add it to the current subarray (current_sum += nums[i]) or start a new subarray (current_sum = nums[i]).
Update the max_sum if current_sum is greater than max_sum.
Return max_sum at the end.*/
