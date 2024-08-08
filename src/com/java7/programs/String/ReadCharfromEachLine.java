package com.java7.programs.String;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ReadCharfromEachLine {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		   int i = 0;
		   int duplicateCount=0;

		   while(scan.hasNext()){
			   i++;
		       String[] words = scan.nextLine().split(" ");
		       Map<String, Integer> map1 = new LinkedHashMap<>(words.length);
		      
		    	   for (String c : words) {
						map1.put(c, map1.containsKey(c) ? map1.get(c) + 1 : 1);
						System.out.println(c+" = "+ map1.get(c));
					}
			
		      System.out.println("Line "+ i +" = "+ words.length+" words");
		      
		   }
		  
		   
	}

}
