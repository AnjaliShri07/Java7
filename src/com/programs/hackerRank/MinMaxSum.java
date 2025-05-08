package com.programs.hackerRank;

import java.io.*;
import java.util.*;

class Result1 {

    /* Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
	/*
	 * 256741038 623958417 467905213 714532089 938071625
	 * 396285104 573261094 759641832 819230764 364801279
	 */

    public static void miniMaxSum(List<Long> arr) { //1 2 3 4 5, 7 69 2 221 8974,
    	
    	if(!arr.isEmpty() && arr.size() >0 && arr.size()== 5){
            long size =0;
            List<Long> totalArr = new ArrayList<Long>();
            while(size <= arr.size()-1) {
                long total=0;
                for (Long i : arr) {
                    total+=i;
                }    
                long arrSize= arr.get((int)size);
                total= total-arrSize;
                size++;
                totalArr.add(total);
                
            }
                Collections.sort(totalArr);
                System.out.print(totalArr.get(0)+ " ");
                System.out.println(totalArr.get(totalArr.size()-1));
            }
        }

}

public class MinMaxSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Long> arr = new ArrayList<Long>();

        for (int i = 0; i < 5; i++) {
            long arrItem = Long.parseLong(arrTemp[i]);
            arr.add(arrItem);
        }

        Result1.miniMaxSum(arr);

        bufferedReader.close();
    }
}


/*
 * Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.

Example

The minimum sum is  and the maximum sum is . The function prints

16 24
Function Description

Complete the miniMaxSum function in the editor below.

miniMaxSum has the following parameter(s):

arr: an array of  integers
Print

Print two space-separated integers on one line: the minimum sum and the maximum sum of  of  elements.

Input Format

A single line of five space-separated integers.

Constraints


Output Format

Print two space-separated long integers denoting the respective minimum and maximum values that can be calculated by summing exactly four of the five integers. (The output can be greater than a 32 bit integer.)

Sample Input

1 2 3 4 5
Sample Output

10 14
Explanation

The numbers are 1,2 ,3, 4, and 5. Calculate the following sums using four of the five integers:

Sum everything except 1, the sum is .
Sum everything except 2, the sum is .
Sum everything except 3, the sum is .
Sum everything except 4, the sum is .
Sum everything except 5, the sum is .
Hints: Beware of integer overflow! Use 64-bit Integer.*/
