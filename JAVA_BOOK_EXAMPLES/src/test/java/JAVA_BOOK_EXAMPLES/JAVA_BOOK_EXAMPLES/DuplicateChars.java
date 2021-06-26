package JAVA_BOOK_EXAMPLES.JAVA_BOOK_EXAMPLES;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class DuplicateChars {

	// use Hashmap and Set

	public static void main(String[] args) {

		String str = "Better Butter";
		// char[] chararray=s.toCharArray();

		HashMap<Character, Integer> map = new HashMap<>();

		// if(hm.containsKey(s.charAt(index)))

		for (int i = str.length() - 1; i >= 0; i--) {

			if (map.containsKey(str.charAt(i))) {

				if (str.charAt(i) == '\0') {
					++i;
				}
				int count = map.get(str.charAt(i));
				map.put(str.charAt(i), ++count);
				System.out.println(map);
			} else {
				map.put(str.charAt(i), 1);
			}
		}
		System.out.println(map);
	}

}
