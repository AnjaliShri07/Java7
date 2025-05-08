package com.programs.array;

public class EqualArray
{
	public static void main(String[] args)
	{
		int arr1[] = {2, 3, 5};
		int arr2[] = {2, 3, 7};
		if(arr1.length == arr2.length)
		{
			for(int i=0; i<arr1.length; i++)
			{
				if(arr1[i] != arr2[i])
				{
					System.out.println(arr1[i] + " and "+  arr2[i]  +" Both two arrays are not equal");
				}
				else
				{
					System.out.println(arr1[i] + " and "+  arr2[i]  +" Both two arrays are  equal");
				}
			}		
		}else{
			System.out.println("Both two array lengths are not equal");
		}
	}
}

/*public static void main(String[] args)
{
	int arr1[] = {2, 3, 5};
	int arr2[] = {2, 3, 7};
	boolean equalOrNot = true;
	if(arr1.length == arr2.length)
	{
		for(int i=0; i<arr1.length; i++)
		{
			if(arr1[i] != arr2[i])
			{
				equalOrNot = false;
			}
			else
			{
				equalOrNot = true;
			}
		}		
	}
	if(equalOrNot)
	{
		System.out.println("Both two array are equal");
	}
	else
	{
		System.out.println("Both two arrays are not equal");
	}
}*/