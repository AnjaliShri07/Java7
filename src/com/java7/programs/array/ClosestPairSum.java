package com.java7.programs.array;

public class ClosestPairSum {
    public static void main(String[] args) {
        int[] arr = {10, 22, 28, 29, 30, 40};
        int x = 54;

        findClosestPairWithTwoPointer(arr, x);

        int[] closestPair = findClosetPair(arr, x);
        System.out.println(closestPair[0] + ", "+closestPair[1]);
    }

    public static int[] findClosetPair(int[] arr, int x){
        int i = 0;
        int j = arr.length-1;

        int closestSum = Integer.MAX_VALUE;
        int closestPair1 = 0;
        int closestPair2 = 0;

        while(i < j){
            int sum = arr[i] + arr[j];

            if(Math.abs(x-sum) < Math.abs(x-closestSum)){
                closestSum = sum;
                closestPair1 = arr[i];
                closestPair2= arr[j];
            }

            if(sum > x){
                j--;
            }else{
                i++;
            }
        }
        return new int[]{closestPair1, closestPair2};
    }

    //two pointer
    public static void findClosestPairWithTwoPointer(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;

        int closestLeft = left;
        int closestRight = right;
        int closestSum = arr[left] + arr[right];
        int diff = Math.abs(x - closestSum);

        while (left < right) {
            int sum = arr[left] + arr[right];
            int currentDiff = Math.abs(x - sum);

            // Update closest pair if current sum is closer to X
            if (currentDiff < diff) {
                closestLeft = left;
                closestRight = right;
                closestSum = sum;
                diff = currentDiff;
            }

            // Move pointers
            if (sum < x) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println("The closest pair is: (" + arr[closestLeft] + ", " + arr[closestRight] + ")");
        System.out.println("Their sum is: " + closestSum);
    }
}

/*Explanation:
Two Pointers:

left starts at the beginning (arr[0]).
right starts at the end (arr[arr.length - 1]).
Calculating the Closest Sum:

The current sum is calculated as arr[left] + arr[right].
If this sum is closer to x than the previous closest sum, update the result.
Pointer Movement:

If the current sum is less than x, increment left to get a larger sum.
If the current sum is greater than x, decrement right to get a smaller sum.

This solution has a time complexity of O(n) since the array is traversed with two pointers.
*/
