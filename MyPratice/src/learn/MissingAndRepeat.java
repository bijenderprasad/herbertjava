package Patterns;

import java.util.ArrayList;
import java.util.Arrays;

public class MissingAndRepeat {

	public static void main(String[] args) {

		int[] a = { 1,2,2,2,5,6 };
		Arrays.sort(a);
		ArrayList<Integer> repeat = new ArrayList<Integer>();
		ArrayList<Integer> missing = new ArrayList<Integer>();

		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] == a[i + 1] + 1) {
				continue;
			} else if (a[i] == a[i + 1]) {
				if (!repeat.contains(a[i]))
					repeat.add(a[i]);
			}

			if (a[i + 1] - a[i] > 1) {
				int j = a[i];
				while (!(j == a[i + 1] - 1)) {
					missing.add(++j);

				}
			}

		}

		System.out.print("Repeat number is - ");
		printList(repeat);
		System.out.print("Missed number is - ");
		printList(missing);

	}

	public static void printList(ArrayList<Integer> al) {
		System.out.println(al);
	}

	
	
}
