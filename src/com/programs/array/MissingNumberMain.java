package com.programs.array;

public class MissingNumberMain {
	public static void main(String[] args) {
		 
        int[] arr1={7,5,6,1,4,2};
        System.out.println("Missing number from array arr1: "+missingNumber(arr1));
        int[] arr2={5,3,1,2};
        System.out.println("Missing number from array arr2: "+missingNumber(arr2));
 
    }
 
	public static int missingNumber(int[] nums)
	{
		int n = nums.length + 1;  // Since one number is missing, the length should be n
		int expectedSum = n * (n + 1) / 2;  // Sum of numbers from 1 to n
		int actualSum = 0;

		// Calculate the actual sum of the array elements
		for (int num : nums) {
			actualSum += num;
		}

		// The missing number is the difference between the expected and actual sum
		return expectedSum - actualSum;
	}
}
