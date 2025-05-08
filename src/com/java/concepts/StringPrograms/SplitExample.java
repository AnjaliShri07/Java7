package com.java.concepts.StringPrograms;

public class SplitExample {
    public static void main(String[] args) {
        String str = "apple,orange;banana grape";
        String[] tokens = str.split("[,; ]");

        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
