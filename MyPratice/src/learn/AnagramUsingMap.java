package Patterns;

import java.util.HashMap;
import java.util.Map;

public class AnagramUsingMap {
	static String str1 = "cata";	
	static String str2 = "act";

	public static void main(String[] args) {

		IsAnagram();
		
	}
	public static void storeMap(String str1) {
		
		char str1arr[] = str1.toCharArray();
		
		HashMap<Character, Integer> myhashmap1 = new HashMap<>();
	for (int i = 0; i < str1arr.length; i++) {

		if (myhashmap1.get(str1arr[i]) == null) {
			myhashmap1.put(str1arr[i], 1);
		}

		else {
			int count = myhashmap1.get(str1arr[i]);
			myhashmap1.put(str1arr[i], ++count);
		}

	}

	System.out.println(myhashmap1);

}
	
	public static void IsAnagram() {
		HashMap<Character, Integer> m1 = new HashMap<>();
		storeMap(str1);
		HashMap<Character, Integer> m2 = new HashMap<>();
		storeMap(str2);
		
		if (m1==m2) {
			System.out.println("Strings are Anagram");
		}
		else
			System.out.println("String is not anagram");
	}
	
	
}