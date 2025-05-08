package com.programs.String;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FrequencyAndprintString {

	public static void main(String[] args) {
		String s="aacccbbbb";
		Map<Character, Integer> map = new LinkedHashMap<>(s.length());
		for (char c : s.toCharArray()) {
			map.put(c, map.containsKey(c) ? map.get(c) + 1 : 1);
		}
		 int maxValueInMap = Collections.max(map.values());
		 System.out.println("Max value in map : "+ maxValueInMap);
		 int count=0;
		 for (Entry<Character, Integer> entry : map.entrySet()) {  // Iterate through hashmap
	            if (entry.getValue()== maxValueInMap) {
	            	System.out.println("Maximum repeated letter : "+ entry.getKey());
	            	while(count < maxValueInMap) {
	            		System.out.print(entry.getKey());  // Print the key with max value
	            		count++;
	            	}
	            }
	        }

	}

}
   