package com.Data;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class JavaSetCollections {

	public static void main(String[] args) {

		// JavaSetCollections.getHashSet();
		JavaSetCollections.getHashMap();

	}

	public static void getHashSet() {
		Set<String> tools = new HashSet<String>();

		tools.add("Java");
		tools.add("Python");
		tools.add("Maven");
		tools.add("Cucumber");
		tools.add("Test-NG");
		tools.add("Java");
		tools.add("Maven");
		tools.add("Java");
		tools.add(null);

		System.out.println(tools);

		for (String newtools : tools) {
			System.out.println(newtools);
		}
	}

	public static void getHashMap() {

		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(100, "Tanu");
		map.put(100, "Tanu");
		map.put(101, "Mohammad");
		map.put(102, "Ali");
		map.put(103, "Patwary");
		map.put(104, "Robert");
		map.put(106, "Robert");
		map.put(105, null);
		map.put(107, null);
		map.put(null, "Tanu");
		map.put(null, null);

		for (Entry<Integer, String> info : map.entrySet()) {

			System.out.println(info.getKey() + "->" + info.getValue());

		}
	}
}
