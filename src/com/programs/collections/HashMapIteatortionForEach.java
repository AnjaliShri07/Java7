package com.programs.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapIteatortionForEach {

	public static void main(String[] args) {
		Map<Integer, String> hash_map = new HashMap<Integer, String>();
		// inserting sets in the hash_map.
		hash_map.put(1, "Thor");
		hash_map.put(2, "Iron man");
		// iterating it using forEach.
		hash_map.forEach((key,value) -> System.out.println(key + " = " + value));

	}

}
