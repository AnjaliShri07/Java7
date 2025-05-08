package com.programs.array.binarySearch;

//Java Program to Illustrate Iterative Binary Search
public class BinarySearchIterative {
	 // Method 1
    // Returns index of x if it is present in arr[], else
    // return -1
    int binarySearch(int arr[], int x)
    {
 
        int l = 0; int r = arr.length - 1;
 
        // Checking element in whole array
        while (l <= r) {
            int m = l + (r - l) / 2;
 
            // Check if x is present at mId
            if (arr[m] == x)
                return m;
 
            // If x greater, ignore left half
            if (arr[m] < x)
                l = m + 1;
 
            // If x is smaller, element is on left sIde
            // so ignore right half
            else
                r = m - 1;
        }
 
        // If we reach here, element is not present
        return -1;
    }
 
    // Method 2
    // Main driver method
    public static void main(String args[])
    {
 
    	BinarySearchIterative ob = new BinarySearchIterative();
 
        // Input array
        int arr[] = { 10, 20,30,40, 50, 60 };
        // Length of array
        int n = arr.length;
        // Element to be checked if present or not
        int x = 60;
 
        // Calling the method 1 and
        // storing result
        int result = ob.binarySearch(arr, x);
 
        // Element present
        if (result == -1)
             // Print statement
            System.out.println("Element not present");
 
        // Element not present
        else
             // Print statement
            System.out.println("Element found at index "
                               + result);
    }
}
