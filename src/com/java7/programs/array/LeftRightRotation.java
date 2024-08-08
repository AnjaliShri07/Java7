package com.java7.programs.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class LeftRightRotation {
	public static List<Integer> rotateLeft(List<Integer> l, int d) {
		List<Integer> list = new ArrayList<>();
		Integer[] arr = l.toArray(new Integer[l.size()]);

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
	
	public static List<Integer> rotateRight(List<Integer> a, int d) {
		List<Integer> rightlist = new ArrayList<>();
		Integer[] arr = a.toArray(new Integer[a.size()]);

		for (int i = 0; i < d; i++) {
			int j, last;
			last = arr[arr.length-1];
			for (j = arr.length - 1; j >0 ; j--) {
				arr[j] = arr[j - 1];
			}
			arr[0] = last;
		}
		for (int i = 0; i < arr.length; i++) {
			rightlist.add(arr[i]);
		}

		return rightlist;
	}

	public static void main(String[] args) {
		List<Integer> my_list = new ArrayList<>();
		my_list.add(1);
		my_list.add(2);
		my_list.add(3);
		my_list.add(4);
		my_list.add(5);
		my_list.add(6);
		my_list.add(8);
		List<Integer> rotateList = LeftRightRotation.rotateLeft(my_list, 4);
		List<Integer> rotateRight = LeftRightRotation.rotateRight(my_list, 4);
		System.out.println("Left Rotation :  " + Arrays.toString(rotateList.toArray()));
		System.out.println("Right Rotation :  " + Arrays.toString(rotateRight.toArray()));
	}

}
