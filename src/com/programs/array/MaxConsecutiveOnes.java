package com.programs.array;

public class MaxConsecutiveOnes {
	public static int maxCons(int arr[]) {
		int maximum=0;
		int i=0;
		while(i < arr.length) {
			int consOns=0;
			while(i< arr.length && arr[i] == 1) {
				consOns++;
				i++;
			}
			
			maximum=Math.max(maximum, consOns);
			i++;
		}
		return maximum;
		
	}

	public static int findMaxConsecutiveOnes(int[] nums) {
		int maxCount = 0;       // To store the maximum number of consecutive ones
		int currentCount = 0;   // To count the current streak of consecutive ones
		int i = 0;              // Index pointer for the while loop

		// Traverse through the array using a while loop
		while (i < nums.length) {
			if (nums[i] == 1) {
				currentCount++;  // Increment the current count if a 1 is found
			} else {
				// If a 0 is found, update the maxCount and reset currentCount
				maxCount = Math.max(maxCount, currentCount);
				currentCount = 0;
			}
			i++;  // Move to the next element
		}

		// In case the array ends with a streak of ones
		maxCount = Math.max(maxCount, currentCount);

		return maxCount;
	}

	public static void main(String[] args) {
		int[] arr = {1, 1, 0, 1, 1, 1};
		System.out.println("Using While Loop : "+ maxCons(arr));
		System.out.println("Using While Loop2 : "+ findMaxConsecutiveOnes(arr));
	}

}
