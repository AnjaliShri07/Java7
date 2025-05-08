package com.programs.array;

import java.util.*;

public class IntersectionTwoArray {
    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0, j = 0;
        int k = 0;

        int[] result = new int[Math.min(nums1.length, nums2.length)];

        while (i < nums1.length && j < nums2.length) {
            if(nums1[i] == nums2[j]){
                result[k++] = nums1[i];
                i++;
                j++;
            }else if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            }
        }
        return Arrays.copyOf(result, k);

    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,2,1};
        int[] arr2 = {2,2};

        int[] num1 = {4,9,5};
        int[] num2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersect(arr1, arr2)));
        System.out.println(Arrays.toString(intersect(num1, num2)));
    }
}
