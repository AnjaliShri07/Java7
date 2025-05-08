package com.demoPrograms;

import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int flag=0;
		   String s= sc.nextLine();
		   char c = sc.next().charAt(0);
		   for(int i=0;i<s.length();i++){
		      if(s.charAt(i)==c) {
		    	  flag=1;
		    	  break;
		      }else {
		    	  flag=0;
		      }
		   }
      if(flag ==1){
         System.out.print("Yes");
      }else{
         System.out.print("No");
      }
	}

}
