package com.java7.programs.array;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/*Print a single integer that denotes the number of valleys Gary walked through during his hike.*/
/*
 * Sample Input

8
UDDDUDUU

Sample Output

1
Explanation

If we represent _ as sea level, a step up as /, and a step down as \, Gary's hike can be drawn as:

_/\      _
   \    /
    \/\/
He enters and leaves one valley.*/

public class CountValley {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int countU=0;
        int countD=0;
        
            for(int i=0; i<=s.length()-1; i++){
                char ch = s.charAt(i);
                if(ch == 'U'){
                    countU++;
                }
                if(ch == 'D'){
                	if(countU == 0){
                        countD++;
                    }
                        countU--;
                }
            }
           
            return countD;
    }

    

    public static void main(String[] args) throws IOException {
       
        int result = countingValleys(8, "UDDDUDUU");

        System.out.println(result);
    }
}