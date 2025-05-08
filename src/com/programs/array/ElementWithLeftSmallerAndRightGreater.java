package com.programs.array;

public class ElementWithLeftSmallerAndRightGreater {
	public static boolean check(int[] arr, int n, int index) {
			int i = index - 1;
	        int j = index + 1;

	        while (i >= 0){
	        	if(arr[i] > arr[index]) 
	        		return false;
	            i--;
	        }

	        while (j < n) {
	        	if(arr[j] < arr[index])
	        		return false;
	            j++;
	       }
	        return true;
	}
	
	static int findElement(int arr[])
    {
 
        // Traverse array from 1st to n-1 th index because
        // Extrem elements can't be aur answer
		int n = arr.length;
        for (int i = 1; i < n - 1; i++) {
            if (check(arr, n, i)) {
                return i;
            }
        }
 
        // If there was no element matching criteria
        return -1;
    }
	public static void main(String[] args) {
		int arr[] = new int[] { 5, 1, 4, 3, 6, 8, 10, 7, 9 };
		int index = findElement(arr);
		System.out.println("index : "+ findElement(arr));
		System.out.println("index : "+ arr[index]);
	}

}
