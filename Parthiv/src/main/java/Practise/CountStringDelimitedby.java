package Practise;

import java.util.ArrayList;
import java.util.HashMap;

public class CountStringDelimitedby {
	public static void main(String args[]) {
		ArrayList list = new ArrayList();

		String str = "This & this is is done & by Saket Saket & this is is done &";
		String[] split = str.split("&");

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < split.length; i++) {
			if (map.containsKey(split[i])) {
				int count = map.get(split[i]);
				map.put(split[i], count + 1);
				System.out.println("split 1:" + split[i]);
			} else {
				map.put(split[i], 1);
				System.out.println("split 2:" + split[i]);
			}
		}
		System.out.println(map);
	}

}
