package com.java7.programs.array.ArraysSum;

//find an index where the sum of elements before that index is equal to the sum of elements after it.
public class SumEqualIndex {
    public static int findIndex(int[] arr) {
    int n = arr.length;

    // Loop through the array, considering each index as a possible partition
        for (int i = 0; i < n; i++) {
        int sumLeft = 0;
        int sumRight = 0;

        // Sum of elements before the current index
        for (int left = 0; left < i; left++) {
            sumLeft += arr[left];
        }

        // Sum of elements after the current index
        for (int right = i + 1; right < n; right++) {
            sumRight += arr[right];
        }

        // If the two sums are equal, return the current index
        if (sumLeft == sumRight) {
            return i+1;
        }
    }

    // If no such index is found, return -1
        return -1;
}

public static void main(String[] args) {
    int[] arr = {2, 2, 5, 6, -2};
    int index = findIndex(arr);

    if (index != -1) {
        System.out.println("The index where the sum of elements before and after are equal is: " + index);
    } else {
        System.out.println("No such index found.");
    }
}
}
