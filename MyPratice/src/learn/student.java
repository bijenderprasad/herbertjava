package Patterns;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class student {

	
	public static void main(String[] args) {
	
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=10;i>0;i--) {
			al.add(i);
		}

		
		System.out.println(al);
		
		for (int i=0;i<al.size();i++) {
			for (int j=0;j<=i;j++) {
			int temp;
			if (al.get(i)>al.get(i+1)) {
				temp = al.get(i);
				al.remove(i);
				al.add(i, i+1);
				al.add(i+1, temp);
				}
			}	
			}
		System.out.println(al+"sss");
		}
	

}
