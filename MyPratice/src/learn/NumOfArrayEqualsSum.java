package Patterns;

import java.util.ArrayList;
import java.util.Arrays;

public class NumOfArrayEqualsSum {

	public static void main(String[] args) {
		int c = 0;
		int [] ar = {1,2,3,4,5};
		
		String s = Arrays.toString(ar);
		char [] ch = s.toCharArray();
	for (int i = 0 ; i < ch.length ; i++) {
			if (ch[i]=='[' || ch[i]== ']' || ch[i]==' ' || ch[i]==',') {
			s=	s.replace(Character.toString(ch[i]), "");
			}
		}
		
	System.out.println(ch.length);
	
		int sum = 6;
		
		for(int i=0;i<s.length();i++) {
			System.out.print(s.charAt(i));
		}
		
		ArrayList<String> op = new ArrayList<String>();
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				op.add(s.substring(i, j));
			}
		}
		for (String b : op) {
			System.out.println(op);
		}
		
		
		
		

	}
	
	
	public static void ArrSum (int [] a, int num) {
		int sum = 0;
		
		for ( int i = 0 ; i < a.length ; i++) {
			sum = sum + a[i];
			
		}
		if (sum == num) {
			for (int x : a) {
				System.out.print(x + " ");
			}
		}
	}

}
