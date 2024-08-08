package com.java7.programs.String;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class NonRepeatedWord {
	
	/*
     * Using LinkedHashMap to find first non repeated character of String
     * Algorithm :
     *            Step 1: get character array and loop through it to build a 
     *                    hash table with char and their count.
     *            Step 2: loop through LinkedHashMap to find an entry with 
     *                    value 1, that's your first non-repeated character,
     *                    as LinkedHashMap maintains insertion order.
     */

	public static void main(String[] args) {
		System.out.println(NonRepeatedWord.getFirstNonRepeatedChar("aavaj"));

	}

	public static char getFirstNonRepeatedChar(String str) {
		char nonRepeatedChar = 0;
		
		Map<Character, Integer> counts = new LinkedHashMap<>(str.length());
		for (char c : str.toCharArray()) {
			counts.put(c, counts.containsKey(c) ? counts.get(c) + 1 : 1);
		}
		for (Entry<Character, Integer> entry : counts.entrySet()) {
			if (entry.getValue() == 1) {
				nonRepeatedChar =  entry.getKey();
				break;
			}
		}
		return nonRepeatedChar;
	}

}
