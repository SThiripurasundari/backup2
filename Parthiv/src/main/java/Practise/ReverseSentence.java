package Practise;

public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "My name is ANitha";
		String words[] = str.split("\\s");
		String reverseWord = "";
		/*
		 * for(String w:words){ System.out.println("Words :"+words[0]); StringBuilder
		 * sb=new StringBuilder(w); sb.reverse(); reverseWord+=sb.toString()+" ";
		 * System.out.println(" reverseWord :"+words.toString());
		 * 
		 * }
		 */

		System.out.println(" words :" + words.length);
		StringBuffer buffer = new StringBuffer();
		for (int t = words.length - 1; t >= 0; t--) {
			System.out.println("Words :" + words[t] + "t" + t);
			buffer.append(reverseWord).append(" ").append(words[t]);
			System.out.println(" reverseWord :" + buffer);
		}

		System.out.println(" reverseWord :" + buffer);
	}

}
