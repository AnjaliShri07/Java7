package com.programs.String;

import java.util.HashMap;
import java.util.Map;

/* Two string will be anagram to each other if and only if they contain the same number of characters 
 
 (order of the characters doesn't matter).*/

import java.util.Scanner;

public class Anagram
{
	    static boolean isAnagram(String a, String b) {
	        // Complete the function
	        if( a == null || b == null || a.equals("") || b.equals("") )
	    throw new IllegalArgumentException();

	// initial quick test for non-anagrams
	if ( a.length() != b.length() )
	    return false;

	a = a.toLowerCase();
	b = b.toLowerCase();

	// populate a map with letters and frequencies of String b
	Map<Character, Integer> map = new HashMap<>();

	for (int k = 0; k < b.length(); k++){
	     char letter = b.charAt(k);    

	    if( ! map.containsKey(letter)){
	        map.put( letter, 1 );
	    } else {
	        Integer frequency = map.get( letter );
	        map.put( letter, ++frequency );
	    }
	}

	// test each letter in String a against data in the map
	// return if letter is absent in the map or its  frequency is 0
	// otherwise decrease the frequency by 1

	for (int k = 0; k < a.length(); k++){
	    char letter = a.charAt(k);

	    if( ! map.containsKey( letter ) )
	        return false;

	    Integer frequency = map.get( letter );

	     if( frequency == 0 )
	        return false;
	    else    
	        map.put( letter, --frequency);
	}
	// if the code got that far it is an anagram
	return true;
	    }

	    public static void main(String[] args) {
	    
	        Scanner scan = new Scanner(System.in);
	        String a = scan.next();
	        String b = scan.next();
	        scan.close();
	        boolean ret = isAnagram(a, b);
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	    }
	
}

/*
Sample Input 2
Hello
hello

Sample Output 2
Anagrams
*/