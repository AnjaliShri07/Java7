package com.java.practice.StringPrograms;

import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        String str = "apple,orange;banana grape";
        StringTokenizer st = new StringTokenizer(str, ",; ");

        // Iterate over the tokens
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
