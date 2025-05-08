package com.programs.String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LongestEvenWord {

	public static void main(String[] args) {
		String input= "I am good";
		String[] input_word= input.split(" ");
		String longestWord="";
		for (String word : input_word) {
			Pattern p = Pattern.compile("^[a-zA-Z]+");
			Matcher m = p.matcher(word);
			m.find();
			if(m.group().length()%2 == 0 && m.group().length() > longestWord.length())
				longestWord = m.group();
		}
		System.out.println(longestWord);
	}

}
 