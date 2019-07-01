package Patterns;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class sortInteger {

	public static void main(String[] args) {
		int a = 1045;
		TreeSet<Integer> rems = new TreeSet<>();
		while (a>0) {
			int rem = a%10;
			a=a/10;
			rems.add(rem);
		}
		Iterator<Integer> itr = rems.descendingIterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next());
		}
		
		
		
//		for (int x : rems) {
//			System.out.println(x);
//		}
		
	}

}
