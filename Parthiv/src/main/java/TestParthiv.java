import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class TestParthiv {

	public static void main(String[] args) {

		String testString = "tttrttttrtrtrtrrtr";

		HashMap<Character, Integer> testMap = new HashMap<Character, Integer>();
		char[] ch = testString.toCharArray();

		// Traverse the character array
		for (int i = 0; i < ch.length; i++) {

			if (testMap.containsKey(ch[i])) {
				int inc = testMap.get(ch[i]);
				testMap.put(ch[i], inc + 1);
				// System.out.println( Character.toString(ch[i]) + inc );
			} else {

				testMap.put(ch[i], 1);
			}

		}

		// Set<Character> keys = baseMap.keySet();
		for (Entry<Character, Integer> entry : testMap.entrySet()) {
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}
	}

}
