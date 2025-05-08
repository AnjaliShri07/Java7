package com.programs.String;

import java.util.LinkedHashMap;
import java.util.Map;


public class Frequency {

	public static void main(String[] args) {
		String str="my Name is anjali shrivastava"; //there is 4 space that's why output showing { =4}
		String s = str.replaceAll("\\s", "");
	
		Map<Character, Integer> map1 = new LinkedHashMap<>();
		for (char c : s.toCharArray()) {
			map1.put(c, map1.containsKey(c) ? map1.get(c) + 1 : 1);
		}
		System.out.println(map1);
	}
}
