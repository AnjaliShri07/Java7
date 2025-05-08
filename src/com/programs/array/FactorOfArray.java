package com.programs.array;

public class FactorOfArray {

	private static void loop1(int temp, int factor) {
		while(temp % factor == 0) {
			temp = temp/factor;
			System.out.print(temp +",");
		}
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {1,24,63,57};

        for (int j : arr) {
            if (j == 1)
                System.out.println("Print j: "+j);
            else {
                int temp = 0, factor = 2;
                temp = j;
                if (temp % factor == 0)
                    loop1(temp, factor);
                else {
                    factor++;
                    loop1(temp, factor);
                }
            }

        }

	}

}
