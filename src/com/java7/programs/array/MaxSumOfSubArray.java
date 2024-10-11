package com.java7.programs.array;


public class MaxSumOfSubArray {
    public static int maxSumOfSubArray(int[] arr, int k){

        int maxSum = 0;
        for(int i=0; i < k; i++){
            maxSum+=arr[i];
        }

        int sum = maxSum;
        for(int i=k; i<arr.length; i++){
            sum +=arr[i] -arr[i-k];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] a1 = {10,5 , -3 ,-1,20,19,15,4}; //39
        int k1 = 2;
        int[] a2 = {10,20,30,40,50,60,70,80,90,100}; //= 270
        int k2 = 3;
        int[] a3 = {10,20,30,40,50,60,70,80,90,100}; //300
        int k3 = 4;

        System.out.println(maxSumOfSubArray(a1, k1));
        System.out.println(maxSumOfSubArray(a2, k2));
        System.out.println(maxSumOfSubArray(a3, k3));

    }
}
