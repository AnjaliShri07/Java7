package com.java7.programs.array;

public class SlidingWindowSecondHighest {
    public static int findSecondHighestInWindow(int[] window) {
        int firstHighest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int num : window) {
            if (num > firstHighest) {
                secondHighest = firstHighest;
                firstHighest = num;
            } else if (num > secondHighest && num != firstHighest) {
                secondHighest = num;
            }
        }

        return secondHighest;
    }

    public static void findSecondHighestInSlIdingWindow(int[] arr, int k) {
        if (arr == null || arr.length < k) {
            throw new IllegalArgumentException("Array length must be greater than or equal to window size");
        }

        for (int i = 0; i <= arr.length - k; i++) {
            int[] window = new int[k];
            System.arraycopy(arr, i, window, 0, k); // Extract the current window
            int secondHighest = findSecondHighestInWindow(window);
            System.out.println("Window: " + java.util.Arrays.toString(window) +
                    " -> 2nd highest: " + secondHighest);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 100, 3, 7, -1};
        int j = 3; // Window size

        findSecondHighestInSlIdingWindow(arr, j);
    }
}
