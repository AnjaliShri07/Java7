package com.programs.array;

/*You are climbing a staircase. It takes n steps to reach the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Example 1:
Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps

Example 2:
Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step*/

/*To solve the staircase problem where you can climb either 1 or 2 steps at a time, you can use a dynamic programming
approach. The idea is that the number of ways to reach the nth step is the sum of the ways to reach the (n-1)th step
and the (n-2)th step, as from the (n-1)th step, you can climb 1 step, and from the (n-2)th step, you can climb 2 steps.*/
public class ClimbStair {
    public static int climbStairs(int n) {
        if (n <= 1) {
            return 1;
        }

        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n = 3;  // You can change this value to test with other inputs
        System.out.println("Number of ways to climb to the top: " + climbStairs(n));
    }
}

/*Explanation:
Base Case:
If n == 0 or n == 1, there is only one way to reach the top (either do nothing or take one step).
Dynamic Programming Array (dp):
The array dp[i] stores the number of ways to reach step i.
We initialize dp[0] = 1 and dp[1] = 1 because there is only one way to stay on step 0 or step 1.
Transition Relation:
For each step i, the number of ways to reach it is the sum of the ways to reach the previous step (dp[i-1]) and the
step before that (dp[i-2]).
Time Complexity: O(n) since we are iterating through the steps once.
Space Complexity: O(n) due to the use of the dp array.*/
