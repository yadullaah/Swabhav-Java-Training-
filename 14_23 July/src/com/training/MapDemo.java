package com.training;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		
		Map <String, Integer> map = new HashMap<String, Integer>();
		
		map.put("A", 100);
		map.put("B", 101);
		map.put("C", 111);
		map.put("D", 100);
		map.put("E", 123);
		map.put(null, 123);
		map.put("E", null);
		map.putIfAbsent("E", 50);


		
		
		System.out.println(map);

		
	}

}
