package com.programs.String;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordChecker
{
	public static boolean check_for_word(String word) {
        // System.out.println(word);
        try {
            BufferedReader in = new BufferedReader(new FileReader("/usr/share/dict/american-english"));
            System.out.println("Enter a word");
            String str= in.readLine();
            while (str  != null) {
                if (str.contains(word)) {
                    return true;
                }
            }
            in.close();
        } catch (IOException e) {
        }

        return false;
    }
	public static void main(String[] args)
	{
		System.out.println(check_for_word("hello"));

	}

}
