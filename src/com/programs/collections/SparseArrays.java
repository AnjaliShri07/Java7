package com.programs.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SparseArrays {

	 public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
		 List<Integer> countList = new ArrayList<Integer>();
		 
		 Map<String, Integer> map = new HashMap<String, Integer>();
		   
		   for(String s1 : strings){
		       map.put(s1, map.containsKey(s1) ? map.get(s1)+1 : 1);
		   }
		   for(String s2 : queries){
		       if(map.containsKey(s2))
		    	   countList.add(map.get(s2));
		       else
		    	   countList.add(0);
		   }
		    return countList;
	 }
	
	public static void main(String[] args) {
		
		List<String> str = new ArrayList<String>(); 
		str.add("ab");
		str.add("ab");
		str.add("abc");
		List<String> queries = new ArrayList<String>(); 
		queries.add("ab");
		queries.add("abc");
		queries.add("bc");
		List<Integer> l= matchingStrings(str, queries);
		System.out.println(l);
	}
	
	
	/*4
	aba
	baba
	aba
	xzxb
	3
	aba
	xzxb
	ab
	
	Your Output (stdout)
	2
	1
	0
*/
}
