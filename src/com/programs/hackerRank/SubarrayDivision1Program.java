package com.programs.hackerRank;


/*Example
s=[2,2,1,3,2]
d=4
m=2
*/
/*Lily wants to find segments summing to Ron's birth day,d=4  with a length equalling his birth month, m=2. 
In this case, there are two segments meeting her criteria:[2,2] and [3,2].
*/
import java.util.Arrays;
import java.util.List;

public class SubarrayDivision1Program {
	public static int birthday(List<Integer> s, int d, int m) {
	    int count = 0;

	    for (int i = 0; i <= s.size() - m; i++) {
	      int sum = 0;
	      for (int j = i; j < i + m; j++) {
	        sum += s.get(j);
	      }
	      if (sum == d) {
	        count++;
	      }
	    }

	    return count;
	  }
	public static void main(String[] args) {
		int d=4;
		int m=2;
		List<Integer> s = Arrays.asList(2,2,1,3,2);
		System.out.println(birthday(s,d,m));

	}

}
