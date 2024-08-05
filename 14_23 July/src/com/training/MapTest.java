package com.training;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {
	public static void main(String[] args) {
		
		Map<Integer, String> map =new HashMap<Integer, String>();
		
		map.put(1, "Suhas");
		map.put(2, "Saad");
		map.put(3, "Yash");
		map.put(4, "Yadullah");
		map.put(5, "Swabhav");
		
		Set<Entry<Integer,String>> entries = map.entrySet();
		
		for(Entry<Integer, String> entry : entries)
			System.out.println(entry.getKey()+" - "+entry.getValue());
		

		
		
		
	}

}
