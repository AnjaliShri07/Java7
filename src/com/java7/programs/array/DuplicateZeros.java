package com.java7.programs.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateZeros {
    public static List<Integer> duplicateZeros(int[] arr) {
        List<Integer> list = new ArrayList<>();

        // Add elements to the list, duplicating zeros
        for (int num : arr) {
            list.add(num);
            if (num == 0) {
                list.add(0);  // Duplicate the zero
            }
        }

        // Copy the first 'arr.length' elements of the list back to the array
        /*for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }*/
        return list;
    }
    public static void main(String[] args) {
        int[] arr = {2, 0, 1, 4, 0, 3, 5, 0};
        System.out.println(duplicateZeros(arr));
        //System.out.println(Arrays.toString(arr)); // Output: [2, 0, 0, 1, 4, 0, 0, 3]
    }
}
