package com.TrickyPrograms.collection;

import java.util.ArrayList;
import java.util.List;

public class SizePro {
	 public static void main(String[] args) {

	        List<String> li = new ArrayList<>();

	        li.add("hi");

	        calculateSize(li);

	        System.out.println("li:" + li.size());
	    }

	    private static void calculateSize(List<String> li) {
	        List<String> newList = li;
	        newList.add("hello");
	        System.out.println("newList:" + newList.size());
	    }
}
