package com.programs.hackerRank;

public class StairCase {

	public static void main(String[] args) {
		int i, j, n=6;
        for (i = 0; i < n; i++) {
            for (j = (n-i-2); j >= 0; j--) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
	}
}
