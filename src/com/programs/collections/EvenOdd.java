package com.programs.collections;

import java.util.ArrayList;
import java.util.List;

public class EvenOdd {
	public static void EvenOddInIndex(List<Integer> list) {
		
		int oddInd = 1;
	    int evenInd = 0;
	    while (true)
	    {
	    	while (evenInd < list.size() && list.get(evenInd) % 2 == 0)
	            evenInd += 2;
	              
	        while (oddInd < list.size() && list.get(oddInd) % 2 == 1)
	            oddInd += 2;
	              
	        if (evenInd < list.size() && oddInd< list.size())
	            {
	                int temp = list.get(evenInd);
	                list.set(evenInd, list.get(oddInd));
	                list.set(oddInd, temp);
	            }
	              
	        else
	            break;
	    }
	}
	public static void main(String[] args) {
		List<Integer> list =new ArrayList<Integer>();
		list.add(3);
		list.add(1);
		list.add(6);
		list.add(2);
		list.add(4);
		
		EvenOddInIndex(list);
		for (Integer integer : list) {
			System.out.println(list.indexOf(integer) +" : "+integer);
		}
	}

}