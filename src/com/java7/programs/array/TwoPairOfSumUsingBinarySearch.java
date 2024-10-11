package com.java7.programs.array;

import java.util.Arrays;

public class TwoPairOfSumUsingBinarySearch {
	public static boolean binarySearch(int[] arr, int l, int r, int key){
        while(l<=r){
            int mId = l+(r-l)/2;
            if(arr[mId] == key)
                return true;
            if(arr[mId] < key)
                l = mId+1;
            else
                r = mId-1;
        }
        return false;
    }
    
    public static boolean pairOfSum(int arr[], int sum){
 
        Arrays.sort(arr);
        for(int i=0; i< arr.length-1;i++){
            int key = sum - arr[i];
            if(binarySearch(arr, i+1, arr.length-1, key))
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int target = 100;
        
      System.out.println(TwoPairOfSumUsingBinarySearch.pairOfSum(arr, target));
       
    }
}
