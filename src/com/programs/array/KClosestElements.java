package com.programs.array;

import java.util.ArrayList;
import java.util.List;

/*Given a sorted integer array arr, two integers k and x, return the k closest integers to x in the array.
The result should also be sorted in ascending order. An integer a is closer to x than an integer b if:

|a - x| < |b - x|, or
|a - x| == |b - x| and a < b

Example 1:
Input: arr = [1,2,3,4,5], k = 4, x = 3
Output: [1,2,3,4]

Example 2:
Input: arr = [1,1,2,3,4,5], k = 4, x = -1
Output: [1,1,2,3]*/

public class KClosestElements {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        // Initialize two pointers
        int left = 0, right = arr.length - 1;

        // Shrink the window until the size of the window is k
        while (right - left >= k) {
            if (Math.abs(arr[left] - x) > Math.abs(arr[right] - x)) {
                left++;
            } else {
                right--;
            }
        }

        // Collect the k closest elements
        List<Integer> result = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            result.add(arr[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        KClosestElements solution = new KClosestElements();

        // Test case 1
        int[] arr1 = {1, 2, 3, 4, 5};
        int k1 = 4;
        int x1 = 3;
        System.out.println(solution.findClosestElements(arr1, k1, x1)); // Output: [1, 2, 3, 4]

        // Test case 2
        int[] arr2 = {1, 1, 2, 3, 4, 5};
        int k2 = 4;
        int x2 = -1;
        System.out.println(solution.findClosestElements(arr2, k2, x2)); // Output: [1, 1, 2, 3]
    }
}

/*
Explanation:
Two Pointers (left, right): Start with the full array (left = 0, right = arr.length - 1). If the element at left is
farther from x than the element at right, increment left, otherwise decrement right. This narrows the range until you
have exactly k elements.

Collect Results: Once the window is narrowed down to k elements, collect and return them in the original order since
the array is already sorted.

Time Complexity:
The time complexity is O(n), where n is the length of the array. The sliding window reduces the range by one element
in each step.*/
