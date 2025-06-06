package com.programs.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagramTogether {
	public static List<List<String>> groupAnagrams(String[] strs){
		 
	       List<List<String>> result = new ArrayList<>();
	  
	       //Initialize hashmap
	       HashMap<String, List<String>> map = new HashMap<>();
	 
	       //Traverse a list of string
	       for(String str: strs){
	 
	         //Convert to character array
	          char[] chArr = str.toCharArray();
	          //Sort character array
	          Arrays.sort(chArr);
	          //Create a string
	          String key = new String(chArr);
	 
	          //Create a key from a sorted string
	          //if this key is found add new string element
	          if(map.containsKey(key)){
	             map.get(key).add(str);
	          } else {
	             List<String> strList = new ArrayList<String>();
	             strList.add(str);
	             map.put(key, strList);
	          }
	        }
	 
	         result.addAll(map.values());
	         return result;
	   }
	public static void main(String[] args) {
		String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result  = groupAnagrams(strs);
        result.forEach(t -> System.out.print(t + " "));

	}

}
