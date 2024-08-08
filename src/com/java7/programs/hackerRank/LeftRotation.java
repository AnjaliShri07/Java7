package com.java7.programs.hackerRank;

import java.util.ArrayList;
import java.util.List;

public class LeftRotation {
	public static List<Integer> rotLeft(List<Integer> a, int d) {
		Integer[] arr = a.toArray(new Integer[a.size()]);
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < d; i++) {
			int j, first;
			first = arr[0];
			for (j = 0; j < arr.length - 1; j++) {
				arr[j] = arr[j + 1];
			}
			arr[j] = first;
		}
		for (int i = 0; i < arr.length; i++) {

			list.add(arr[i]);
		}

		return list;
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		List<Integer> l = rotLeft(list, 4);
		for (Integer integer : l) {
			System.out.println(integer);
		}

	}

}
