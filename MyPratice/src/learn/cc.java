package Patterns;

import java.util.Stack;

public class cc {
	static int flag = 1;
	public static Boolean isMatchPair(char a, char pop) {
		if (a=='(' && pop==')')
			return true;
		if (a=='{' && pop=='}')
			return true;
		if (a=='[' && pop==']')
			return true;
		
		else
			return false;
	}
	public static void main(String[] args) {
		String[] ch = { "(", "[", "{" };
		String eq = "[[]";
		Stack<Character> s = new Stack<>();
		for (int i = 0 ; i < eq.length();i++) {
		if (eq.charAt(i)=='{' || eq.charAt(i)=='(' || eq.charAt(i)=='[') {
			s.push(eq.charAt(i));
	}
		else if(eq.charAt(i)=='}' || eq.charAt(i)==')' || eq.charAt(i)==']') {
			if (s.isEmpty()) {
				break;
				
			}
			
			else if(!isMatchPair(s.pop(),eq.charAt(i))){
				break;
				}
			
			else if(isMatchPair(s.pop(),eq.charAt(i))){
			continue;
			}
			
		}	
	}
	if (s.isEmpty()) {
		System.out.println("Balanced");
		}
	else
		System.out.println("unbalanced");
	}
}