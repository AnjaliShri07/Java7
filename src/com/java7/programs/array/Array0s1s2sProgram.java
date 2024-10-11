package com.java7.programs.array;

import java.util.Arrays;
//three pointer technique
public class Array0s1s2sProgram {
    private static void sortBinaryArray(int[] arr){
        int n= arr.length;
        int low = 0;
        int mid = 0;
        int high = n-1;

        if(arr.length-1<=0)
            System.out.println("Array is empty");

        while(mid <= high){
            if(arr[mid] == 0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }else if(arr[mid] == 2){
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }else
                mid++;
        }
        System.out.println("Input Array After Sorting Left sIde : "+ Arrays.toString(arr));
    }
    public static void main(String[] args) {
        sortBinaryArray(new int[] {1, 2, 0, 1, 2, 1, 0, 1, 2});
    }
}
