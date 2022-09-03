package com.Data;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class List_Hash_Collections {

	public static void main(String[] args) {

		List_Hash_Collections.getSet();

	}

	public static void getSet() {

		Set<String> Country = new HashSet<String>();

		Country.add("Bangladesh");
		Country.add("Bangladesh");
		Country.add("India");

		Country.add("Pakistan");
		Country.add("USA");
		Country.add("Canada");
		Country.add("England");

		for (String newCountry : Country) {
			System.out.println(newCountry);
		}
	}

	public static void getMap() {
		
		
		Map<Integer,String> value1= new HashMap<Integer,String>();{
		
			value1.put(1, null);
			value1.put(2, "Java");
			value1.put(3, "");
			value1.put(4, null);
			value1.put(5, null);
			value1.put(6, null);
			value1.put(7, null);
			
			
	
			//for (Entry<Integer, String> info : map.entrySet()) {

			//	System.out.println(info.getKey() + "->" + info.getValue());

}
	}}
