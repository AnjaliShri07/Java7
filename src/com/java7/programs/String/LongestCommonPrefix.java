package com.java7.programs.String;

public class LongestCommonPrefix {
	public static String longestCommonPrefix(String[] words) {
		if (words == null || words.length == 0) {
			return "";
		}

		// Use the first string as the initial prefix
		String prefix = words[0];
		// Iterate over the array of strings
		for (String str : words) {
			// Reduce the prefix until it matches the start of the current string
			while (str.indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);
				if (prefix.isEmpty()) {
					return "";
				}
			}
		}

		return prefix;
	}

	public static void main(String[] args) {
		String[] words1 = {"flower", "flow", "flight"};
		String[] words2 = {"dog", "racecar", "car"};
		String[] words3 = {"flower","float","fly"};
		String[] words4 = {"cat","cable","camera"};
		String[] words5 = {"hello","world","java"};


		System.out.println("Longest Common Prefix: " + longestCommonPrefix(words1)); // Output: "fl"

		System.out.println("Longest Common Prefix: " + longestCommonPrefix(words2)); // Output: ""

		System.out.println("Longest Common Prefix: " + longestCommonPrefix(words3));
		System.out.println("Longest Common Prefix: " + longestCommonPrefix(words4));
		System.out.println("Longest Common Prefix: "+ longestCommonPrefix(words5));
	}
}
