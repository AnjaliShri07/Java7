package com.java7.programs.hackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareTriplets {
	public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {	    
		List<Integer> list = new ArrayList<Integer>();
		   
	    if(a.size() == b.size()){
	         int count1=0, count2=0;
	       for(int i=0; i<a.size(); i++){
	                for(int j=i; j<b.size(); j++){
	                    if(i == j){
	                        if(a.get(i) > b.get(j))
	                            count1++;
	                        else if(a.get(i) < b.get(j))
	                            count2++;
	                    }
	                }
	            }
	        list.add(count1);
	        list.add(count2);       
	    }else
	        return Collections.emptyList();
	    return list;

	    }
	public static void main(String[] args) {
		List<Integer> r = new ArrayList<Integer>();
		List<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		List<Integer> b = new ArrayList<Integer>();		
		b.add(1);
		b.add(2);
		b.add(3);
		r = compareTriplets(a, b);
		for (Integer integer : r) {
			System.out.println(integer);
		}

	}

}
/* Input-
	5 6 7  (Alice points)
	3 6 10 (Bob points)
output:-[1,1]
Explanation- 5>3 then Alice count=1
			 6=6 then no count
			 7 < 10 then Bob count=1
*/