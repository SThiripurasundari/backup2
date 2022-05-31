package com.sample.Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapsSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<String>();
		list.add("ABC");
		list.add("EFG");
		list.add("HIJ");
		
		
		Map map = new HashMap<String, ArrayList>();
		map.put("A", list);
		System.out.println("Map having list :" + map);

		// Map having another map
		Map ma1 = new HashMap();
		ma1.put("1", "O");
		ma1.put("2", "O");

		// Multimaps - Having list as value inside map
		Map map2 = new HashMap<String, Map<String, String>>();
		map2.put("A", ma1);

		System.out.println("map having map :" + map2);

		for (String s : args) {
			System.out.println(s);
		}

	}

}
