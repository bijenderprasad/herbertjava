package Patterns;

import java.util.Stack;

public class bpbalanced {

	public static Boolean isMatchPair(char a, char pop) {
		if (a == '(' && pop == ')')
			return true;
		if (a == '{' && pop == '}')
			return true;
		if (a == '[' && pop == ']')
			return true;

		else
			return false;
	}

	public static void main(String[] args) {
		Stack<Character> s = new Stack<Character>();
		String str = "[{({((((()))))}})]";
		int flag = 1;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '{' || str.charAt(i) == '(' || str.charAt(i) == '[') {
				s.push(str.charAt(i));
			}
			if (str.charAt(i) == '}' || str.charAt(i) == ')' || str.charAt(i) == ']') {
				if (s.isEmpty()) {
					flag = 0;
					break;
				}

				else {

					if (isMatchPair(s.pop(), str.charAt(i))) {
						continue;
					} else {
						flag =0;
						break;
					}

				}

			}

		}

		if (s.isEmpty() && flag == 1) {
			System.out.println("balanced");
		} else
			System.out.println("unbalanced");

	}

}
