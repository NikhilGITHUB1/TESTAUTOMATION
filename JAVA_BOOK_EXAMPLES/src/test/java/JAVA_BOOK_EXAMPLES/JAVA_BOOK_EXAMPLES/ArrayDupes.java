package JAVA_BOOK_EXAMPLES.JAVA_BOOK_EXAMPLES;

import java.util.HashMap;

//we have an array
//we need to find dupes
//we will use hashmap to find dupes
//hashmap has a containskey func
// we can say that : if hashmap.containsKey(arrayelement), using hashmap.get, we are fetching the count
//we can use hashmap.put to put the key as the array element and value as count increment
//else part we can mention , hashmap.put(arrayelement,1)

public class ArrayDupes {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 4, 1 };

		HashMap<Integer, Integer> hm = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {

			if (hm.containsKey(arr[i])) {

				int count = hm.get(arr[i]);
				hm.put(arr[i], ++count);
			}
			else {
				hm.put(arr[i],1);
			}

		}
		System.out.println(hm);

	}

}
