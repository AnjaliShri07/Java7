package com.java7.programs.array;

import java.util.Arrays;
import java.util.HashSet;

public class ArrayDoubleSum {
	static boolean hasArrayTwoCandidates(int A[], int sum)
	    {
	        int l, r;
	 
	        /* Sort the elements */
	        Arrays.sort(A);

	        /* Now look for the two candidates
	        in the sorted array*/
	        l = 0;
	        r = A.length - 1;
	        while (l < r) {
	            if (A[l] + A[r] == sum)
	                return true;
	            else if (A[l] + A[r] < sum)
	                l++;
	            else // A[i] + A[j] > sum
	                r--;
	        }
	        return false;
	    }
	
	/*
	 * Complexity Analysis:
	 * 
	 * Time Complexity: Depends on what sorting algorithm we use. If Merge Sort or
	 * Heap Sort is used then (-)(nlogn) in the worst case. If Quick Sort is used
	 * then O(n^2) in the worst case. Auxiliary Space: This too depends on sorting
	 * algorithm. The auxiliary space is O(n) for merge sort and O(1) for Heap Sort.
	 */
	
	static void printPairs(int arr[], int sum)
    {
        HashSet<Integer> s = new HashSet<>();
        for (int i = 0; i < arr.length; ++i)
        {
            int temp = sum - arr[i];
 
            // checking for condition
            if (s.contains(temp)) {
                System.out.println(
                    "Pair with given sum "
                    + sum + " is (" + arr[i]
                    + ", " + temp + ")");
            }
            s.add(arr[i]);
        }
    }
	
	/*
	 * Time Complexity: O(n). As the whole array is needed to be traversed only once. 
	 * Auxiliary Space: O(n). A hash map has been used to store array elements.
	 */
	public static void main(String[] args) {
		boolean a = ArrayDoubleSum.hasArrayTwoCandidates(new int[] {1, 4, 45, 6, 10, -8}, 16);
		System.out.println(a);
		System.out.println("===========================================");
		ArrayDoubleSum.printPairs(new int[] {1, 4, 45, 6, 10, 8}, 16);

	}

}
