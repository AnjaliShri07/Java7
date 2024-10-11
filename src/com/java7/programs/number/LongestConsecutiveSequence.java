package com.java7.programs.number;

import java.util.HashSet;
import java.util.Set;

/*Longest Consecutive Sequence
You are given an unsorted array/list 'ARR' of 'N' integers. Your task is to return the length of the longest
consecutive sequence.
The consecutive sequence is in the form ['NUM', 'NUM' + 1, 'NUM' + 2, ..., 'NUM' + L] where 'NUM' is the starting
integer of the sequence and 'L' + 1 is the length of the sequence.
For the given 'ARR' [9,5,4,9,10,10,6]. Output = 3 The longest consecutive sequence is [4,5,6].
*/
public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;


        // Add all numbers to a HashSet
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longestStreak = 0;

        // Iterate through the set
        for (int num : numSet) {
            // Check if 'num' is the start of a sequence (i.e., num - 1 is not present)
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                // Increment the streak for each consecutive number
                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                // Update the longest streak
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        System.out.println("Length of Longest Consecutive Sequence: " + longestConsecutive(arr));
    }
}
/*Explanation:
HashSet Construction:
We first insert all the numbers from the array into a HashSet to enable fast lookups.

Identifying Sequence Start:
For each number, we check if it's the start of a sequence by ensuring that num - 1 is not in the set. This ensures that we are counting sequences only once from their starting point.

Counting Consecutive Numbers:
Once the starting number of a sequence is Identified, we increment currentNum and count how many consecutive numbers exist in the set.

Updating Longest Streak:
Each time a new sequence is found, we compare its length to the longest sequence found so far and update the longest streak if needed.*/

/*Time Complexity:
Time Complexity: O(n), where n is the number of elements in the array. This is because each number is inserted into the HashSet once and checked a constant number of times.
Space Complexity: O(n), as we store all the numbers in the HashSet.*/
