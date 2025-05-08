package com.programs.hackerRank;

import java.util.Scanner;

public class StringToken {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter string");
        String s = scan.nextLine();
        s = s.trim();
        String[] items = s.trim().split("[ !,?.\\_'@]+");
        
    if(s.equalsIgnoreCase("")){
       System.out.println("0");
    }
    else if(s.length() >= 400000){
    	return;
    }
    else{
       System.out.println(items.length);
    }

    for(String item: items){
        System.out.println(item);
    }
        scan.close();
    }
}
