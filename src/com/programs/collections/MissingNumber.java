package com.programs.collections;

import java.util.ArrayList;
import java.util.List;

public class MissingNumber {
	public static List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]);
            if (nums[index - 1] > 0) {
                nums[index - 1] *= -1;
            }
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                res.add(i + 1);
            }
        }
        return res;
    }
      public static void main(String[] args) {
       int [] a ={1,2,2,3,1};
       System.out.println(findDisappearedNumbers(a));
      }
}
