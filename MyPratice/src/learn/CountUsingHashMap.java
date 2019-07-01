package Patterns;

import java.util.HashMap;

public class CountUsingHashMap {
	
	public static void main (String [] bijender) {
		
		String str = "This done this is is Bby Saket Saket Saket";
		String [] word = str.split("\\s+");
		HashMap<String, Integer> map = new HashMap<String,Integer>();
		for (int i = 0 ; i < word.length;i++) {
			if (map.containsKey(word[i])) {
				int count = map.get(word[i]);
				map.put(word[i], count+1);
				}
			else
				map.put(word[i], 1);
		}
		
System.out.println(map);
		
	}
	
	public static void displayArray(Object a[]) {
		for (Object o : a) {
			System.out.println(o);
		}
	}

}
