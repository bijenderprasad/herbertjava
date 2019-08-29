package Patterns;

import java.util.ArrayList;

public class customizedSlack {
	static ArrayList al = new ArrayList<>();

	public static void main(String[] args) {
	push("hi");
	push(3);
	push('f');
	push(45);
	display();
	System.out.println(pop());
	display();
	pop();
	pop();
	
	
	}
	
	public static void push (Object addtoken) {
		al.add(addtoken);
	}
	public  static Object pop() {
		Object removedToken=null;
		try {
			removedToken = al.remove(al.size()-1);	
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Stack is empty now, You can pop element now");
		}
		return removedToken;
	}
	
	public static void  display() {
			System.out.println(al);
	}

}
