package Practise;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharFinder {
	public void findIt(String str) {

		Map<Character, Integer> baseMap = new HashMap<Character, Integer>();
		
		
		char[] charArray = str.toUpperCase().toCharArray();
		
		
		for (Character ch : charArray) {
			if (baseMap.containsKey(ch)) {
				baseMap.put(ch, baseMap.get(ch) + 1);
			} else {
				baseMap.put(ch, 1);
			}
		}

		Set<Character> keys = baseMap.keySet();
		System.out.println("ch" + keys);
		for (Character ch : keys) {
			// if (baseMap.get(ch) > 1) {
			System.out.println(ch + "  is " + baseMap.get(ch) + " times");

			// }
		}
	}

	public static void main(String a[]) {
		DuplicateCharFinder dcf = new DuplicateCharFinder();
		dcf.findIt("TTTYYYEEW");
	}

	public static List<Entry<String, Integer>> sortByValueInDecreasingOrder(Map<String, Integer> wordMap) { 
		Set<Entry<String, Integer>> entries = wordMap.entrySet(); 
	  List<Entry<String, Integer>> list = new ArrayList<>(entries);
	  Collections.sort(list, new Comparator<Map.Entry<String,
	  Integer>>() {
	  
	  @Override 
	  public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) 
	  { 
		  return (o2.getValue()).compareTo(o1.getValue()); } }); 
	  }
	  return  list;
	  
	 
	 

	// Read more:
	// https://www.java67.com/2015/10/java-program-to-find-repeated-words-and-count.html#ixzz7ENIOetzc
}