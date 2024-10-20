package com.java7.programs.array.count;

import java.util.Arrays;
import java.util.LinkedList;

/*There is a long road with markers on it after each unit of distance. 
 * There are some ubers standing on the road. You are given the starting and ending coordinate of each uber 
 * (both inclusive).
Note: At any given marker there may be multiple ubers or there may be none at all.

Your task is to find the number of markers on which at least one uber is present. 
An uber with coordinates (l, r) is consIdered to be present on a marker m if and only if l ≤ m ≤ r.

Example

For coordinates=[[4, 7], [-1, 5], [3, 6]], the output should be easyCountUber(coordinates) = 9.
*/

public class CountMarkers {
	public static int solution(int[][] coordinates) {
	    coordinates = merge(coordinates);
	    int sum = 0;
	    for(int[] coordinate: coordinates) {
	        sum += (coordinate[1] - coordinate[0] + 1);
	    }
	    
	    return sum;
	}
	
	public static int[][] merge(int[][] intervals) {
	    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
	    LinkedList<int[]> merged = new LinkedList<>();
	    for (int[] interval : intervals) {
	        if (merged.isEmpty() || merged.getLast()[1] < interval[0]) {
	            merged.add(interval);
	        } else {
	            merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
	        }
	    }
	    return merged.toArray(new int[merged.size()][]);
	}
	public static void main(String[] args) {
		int[][] doubleArray = {{4, 7}, {-1, 5}, {3, 6}};
		System.out.println(CountMarkers.solution(doubleArray));

	}

}
