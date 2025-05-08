package com.programs.hackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PermutingTwoArrays {
	public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
        Collections.sort(A);
        Collections.sort(B, Collections.reverseOrder());

     boolean isPossible = true;

     for (int j = 0; j < A.size(); j++) {
       if (A.get(j) + B.get(j) < k) {
         isPossible = false;
         break;
       }
     }

     if (isPossible) {
       return "YES";
     } else {
       return "NO";
     }
   }

	public static void main(String[] args) {
		int k =5;
		List<Integer> A = new ArrayList<Integer>(); 
		A.add(1);
		A.add(2);
		A.add(3);
		List<Integer> B = new ArrayList<Integer>(); 
		B.add(9);
		B.add(8);
		B.add(7);
		System.out.println(twoArrays(k, A, B));
	}

}
