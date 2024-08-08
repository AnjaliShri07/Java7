package com.java7.programs.number;

import java.util.Scanner;

public class StaticInilializeBlock {
	static Scanner sc = new Scanner(System.in);
    static boolean flag = true;
    static int B = sc.nextInt();
    static int H = sc.nextInt();

    static{
        try{
            if(B <= 0 || H <= 0){
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }
        }catch(Exception e){
            System.out.println(e);
        }

    }
}
/*
Sample input 1

1
3
Sample output 1

3
Sample input 2

-1
2
Sample output 2

java.lang.Exception: Breadth and height must be positive
*/