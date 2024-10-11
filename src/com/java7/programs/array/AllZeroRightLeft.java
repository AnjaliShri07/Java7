package com.java7.programs.array;

import java.util.Arrays;

public class AllZeroRightLeft {

	static void moveZeroToRight(int arr[]) {
		int i=0; // Pointer for traversing the array
		int n= arr.length;
		int j=0; // Pointer for the position of the next non-zero element

		while(i < n) {
			if(arr[i] !=0) {
				arr[j] = arr[i]; // Place non-zero element at index j
				j++; // Move to the next position for non-zero
			}
			i++; // Move to the next element in the array
		}

		// Second pass: Fill remaining positions with zeros
		while(j < n) {
			arr[j] = 0;
			j++;
		}
		System.out.println("All Zeros to Right : "+Arrays.toString(arr));

	}

	static void moveZerosToLeft(int[] A) {
		if (A.length < 1) {
			return;
		}

		int j = A.length - 1;
		int i = A.length - 1;

		while(i >= 0) {
			if(A[i] != 0) {
				A[j] = A[i];
				j--;
			}
			i--;
		}

		while(j >= 0) {
			A[j] = 0;
			j--;
		}
		System.out.println("While loop: All Zeros to left : "+Arrays.toString(A));
	}

	static void sortLeft(int[] arr) {
		int n = arr.length;
		int low = 0;
		int high=n-1;
		while(low<high){
			if(arr[low] != 0) {
				int temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;
				low++;
			}else
				high--;
		}
		System.out.println("While loop with 2 pointer: All Zeros to left : "+Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int arr[] = {5,0,2,0,4,0,7,0};
		int arr1[] ={1, 0, 1, 1, 0, 1, 0, 0};

		AllZeroRightLeft.moveZeroToRight(arr);
		AllZeroRightLeft.moveZeroToRight(arr1);
		System.out.println("========================================================");
		AllZeroRightLeft.moveZerosToLeft(arr);
		AllZeroRightLeft.moveZerosToLeft(arr1);
		System.out.println("=====================================================");
		AllZeroRightLeft.sortLeft(arr);
		AllZeroRightLeft.sortLeft(arr1);

	}

}
