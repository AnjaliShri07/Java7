package com.java7.programs.array;

import java.util.Arrays;

public class AllZeroRightLeft {

	public static void main(String[] args) {
		int arr[] = {5,0,2,0,4,0,7,0};
		int arr1[] ={1, 0, 1, 1, 0, 1, 0, 0};

		AllZeroRightLeft.moveZeroToRight(arr);
		AllZeroRightLeft.moveZeroToRight(arr1);
		System.out.println("========================================================");
		AllZeroRightLeft.moveZerosToFront(arr);
		AllZeroRightLeft.moveZerosToFront(arr1);
		System.out.println("========================================================");
		AllZeroRightLeft.moveZerosToLeft(arr);
		AllZeroRightLeft.moveZerosToLeft(arr1);
		System.out.println("=====================================================");
		AllZeroRightLeft.sort(arr1);

	}
	// all zero to right
	static void moveZeroToRight(int arr[]) {
		int count=0;
		int i=0;
		//for(int i=0; i< arr.length; i++) {
		while(i < arr.length) {
			if(arr[i] !=0) {
				arr[count++] = arr[i];
			}
			i++;
		}
		//}
		while(count < arr.length) {
			arr[count++] = 0;
		}
		System.out.println("All Zeros to Right : "+Arrays.toString(arr));

	}

	// all zero to left
	static void moveZerosToFront(int inputArray[])
	{
		//Initializing counter to position of last element
		int counter = inputArray.length-1;
		//Traversing the inputArray from right to left
		for (int i = inputArray.length-1; i >= 0; i--)
		{
			//If inputArray[i] is non-zero
			if(inputArray[i] != 0)
			{
				//Assigning inputArray[i] to inputArray[counter]
				inputArray[counter] = inputArray[i];
				//Decrementing the counter by 1
				counter--;
			}
		}
		//Assigning 0 to remaining elements
		while (counter >= 0)
		{
			inputArray[counter] = 0;
			counter--;
		}
		System.out.println("For loop: All Zeros to left : "+Arrays.toString(inputArray));
	}

	//Method-3
	/*
	 * Solution Explanation 
	 * Runtime complexity The runtime complexity if this solution is linear, O(n).
	 * 
	 * Memory complexity 
	 * The memory complexity of this solution is constant, O(1).
	 * 
	 * 
	 * Breakdown of solution 
	 * Keep two markers: read_index and write_index and point
	 * them to the end of the array. Let�s take a look at an overview of the
	 * algorithm:
	 * 
	 * While moving read_index towards the start of the array:
	 * 
	 * If read_index points to 0, skip.
	 * 
	 * If read_index points to a non-zero value, write the value at read_index to
	 * write_index and decrement write_index.
	 * 
	 * Assign zeros to all the values before the write_index and to the current
	 * position of write_index as well.
	 */
	static void moveZerosToLeft(int[] A) {
		if (A.length < 1) {
			return;
		}

		int writeIndex = A.length - 1;
		int readIndex = A.length - 1;

		while(readIndex >= 0) {
			if(A[readIndex] != 0) {
				A[writeIndex] = A[readIndex];
				writeIndex--;
			}
			readIndex--;
		}

		while(writeIndex >= 0) {
			A[writeIndex] = 0;
			writeIndex--;
		}
		System.out.println("While loop: All Zeros to left : "+Arrays.toString(A));
	}

	static void sort(int[] arr) {
		int n = arr.length;
		int low = 0;
		int high=n-1;
		while(low<high){
			if(arr[low] == 1) {
				int temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;
				low++;
			}else
				high--;
		}
		System.out.println("While loop with 2 pointer: All Zeros to left : "+Arrays.toString(arr));
	}

}
