package Patterns;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class MaxOutOfGivenInt {

	public static void main (String [] args) {
		
		ArrayList<Integer>list=new ArrayList<Integer>();
		int data=123;
		
		while(data!=0) {
		int temp=data%10;
		data=data/10;
		list.add(temp);
		}
		
		Collections.sort(list);
		System.out.println(list);
		System.out.println();
		
		for (int x : list) {
			System.out.print(x);
		}
			
		int [] a = {1,2,3,4,5};
		int b=a.length;
	   }
	
	
	  
	
}
