package com.programs.array;

public class MissingNumber
{
	private static void findMissingNumber(int[] number)
	{
		// take max length as last number in array
		int k[] = new int[number[number.length-  1]];
		int m = 0;
		if (number[0] != 1)
		{
			for (int x = 1; x < number[0]; x++)
			{
				k[m] = x;
				m++;
			}
		}

		for (int i = 0; i < number.length - 1; i++)
		{
			/*int j = i + 1;
			int difference = number[j]  number[i];*/
			int difference = number[i+1] - number[i];

			if (difference != 1)
			{
				for (int x = 1; x < difference; x++)
				{
					k[m] = number[i] + x;
					m++;
				}
			}
		}

		System.out.print("missing numbers in array : ");

		for (int l = 0; l < m; l++)
		{
			System.out.print(k[l] + ", ");
		}
		System.out.println();
	}

	private static void MissingNumber(int[] number) {
		int n= number.length-1;
		int numArrayIndex=0;
		System.out.print("Missing Num : ");
		for(int i=1; i< number[n]; i++) {
			if(i == number[numArrayIndex] ) {
				numArrayIndex++;
			}else
				System.out.print(i +", ");
			}
	
	}
	public static void main(String[] args)
	{

		int a[] = {1, 2, 4, 6, 9, 10, 20, 21, 22, 23, 25, 26, 27, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 42, 43, 44, 45, 47, 48, 49, 50};
		// if Array is not sorted :To sort array use Arrays.sort(a);
		
	    findMissingNumber(a);
		MissingNumber(a);

	}

}