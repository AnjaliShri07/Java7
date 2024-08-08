package com.java7.programs.String;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;


public class Frequency {

	public static void main(String[] args) {
		String str="my name is anjali shrivastava"; //there is 4 space that's why output showing { =4}
		String s = str.replaceAll("\\s", "");
	
		Map<Character, Integer> map1 = new LinkedHashMap<>();
		for (char c : s.toCharArray()) {
			map1.put(c, map1.containsKey(c) ? map1.get(c) + 1 : 1);
		}
		System.out.println(map1);
	}
}
