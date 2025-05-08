package com.programs.collections;

import java.util.*;
import java.util.Map.Entry;

public class LonelyInteger {
	public static int lonelyinteger(List<Integer> a) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>(a.size());
		for(int i : a){
			map.put(i, map.containsKey(i) ? map.get(i)+1 : 1);
		}
		int lonelyInt = 0;
		
		if(map.size() > 0) {
			Set<Entry<Integer, Integer>> entrySet = map.entrySet();
			for (Entry<Integer, Integer> entry : entrySet) 
			{
				if(entry.getValue() == 1)				
					lonelyInt = entry.getKey();				
			}
		}     
		
		return lonelyInt;
	}
	public static void main(String[] args) {
		List<Integer> a = new ArrayList<>();
		a.add(0);
		a.add(0);
		a.add(1);
		a.add(2);
		a.add(1);
		System.out.println(LonelyInteger.lonelyinteger(a));
	}

}
