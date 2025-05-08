package com.programs.array.ArraysSum;

/*The problem you're asking about involves finding the maximum sum of any subarray of size k1 (which is 2 in your case) from the array a1. This can be solved efficiently using the sliding window technique to maintain a window of size k1 as you slide through the array.

Approach:
Sliding Window:
The goal is to calculate the sum of every subarray of size k1.
Start by calculating the sum of the first k1 elements.
Then, "slide" the window by subtracting the element that is leaving the window and adding the next element in the array.
Keep Track of the Maximum Sum:
As you slide the window, update the maximum sum found so far.*/
public class MaxSumOfSubArray {
    public static int maxSumOfSubArray(int[] arr, int k){
        if (arr.length < k) {
            return -1;
        }

        int maxSum = 0;
        for(int i=0; i < k; i++){
            maxSum+=arr[i];
        }

        int sum = maxSum;
        for(int i=k; i<arr.length; i++){
            //System.out.print(i-k + " "+ arr[i-k]+ " , ");
            sum +=arr[i] -arr[i-k];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] a1 = {10,5 , -3 ,-1,20,19,15,4}; //39
        int k1 = 2;
        int[] a2 = {10,20,30,40,50,60,70,80,90,100}; //= 270
        int k2 = 3;
        int[] a3 = {10,20,30,40,50,60,70,80,90,100}; //300
        int k3 = 4;

        System.out.println(maxSumOfSubArray(a1, k1));
        System.out.println(maxSumOfSubArray(a2, k2));
        System.out.println(maxSumOfSubArray(a3, k3));

    }
}

/*
Explanation:
Input:

a1 = {10, 5, -3, -1, 20, 19, 15, 4}.
k1 = 2 (subarray size is 2).
Initial Window:

First, calculate the sum of the first k1 elements (10 + 5 = 15).
Sliding the Window:

Slide the window across the array:
Subtract the element that is no longer part of the window.
Add the next element in the array to the window.
Track Maximum:

As you slide the window, keep track of the maximum sum encountered.
Edge Case:

If the array has fewer elements than the given subarray size k1, return -1 or handle the error.
Example Execution:
For the input array a1 = {10, 5, -3, -1, 20, 19, 15, 4} and k1 = 2:

Initial Window:

Sum of first 2 elements: 10 + 5 = 15
Slide the Window:

Slide to the next subarray: 5 + (-3) = 2
Slide to the next subarray: -3 + (-1) = -4
Slide to the next subarray: -1 + 20 = 19
Slide to the next subarray: 20 + 19 = 39 (this is the maximum sum)
Slide to the next subarray: 19 + 15 = 34
Slide to the next subarray: 15 + 4 = 19
Maximum Sum:

The maximum sum of any subarray of size k1 = 2 is 39 (subarray [20, 19]).
Output:
arduino
Copy code
Maximum sum of subarray of size 2: 39
Time Complexity:
Time Complexity: O(n), where n is the length of the input array. We only traverse the array once using the sliding window technique.
Space Complexity:
Space Complexity: O(1), since we are using a constant amount of extra space regardless of the size of the input array.*/
