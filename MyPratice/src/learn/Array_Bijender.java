package Patterns;

import java.util.Arrays;

public class Array_Bijender {
	// A = 65; Z = 90
	// a = 97 z = 122

	public static void main(String[] args) {
		//changecase("Bijender Is GOod");
		//sortArrayUsingKeyword();
		//sumOfArray();
		//gridprint();
		//arrayContainsSomething(5);
		//findArrayIndex(4);
		//maxMininArray();
		//MInMaxsortArray();
		reverseArray();
	}
	
	public static void reverseArray() {
		int temp;
		int[] mark = { 2, 3, 1, 4, 5 };
		int length = mark.length;
		for (int i = 0 ; i < length/2 ; i++) {
			for (int j = length ; j>length/2 ; j-- ) {
			temp = mark[i];
			mark[i] = mark [j];
			mark[j] = temp;
			}
		}
		System.out.println(Arrays.toString(mark));
	}
	
	
	public static void MInMaxsortArray() {
		int max=0; int min = 0;
		int[] mark = { 2, 3, 1, 4, 5 };
		Arrays.sort(mark);
		System.out.print(Arrays.toString(mark));
		int length = mark.length;
		min = mark[0];
		max = mark[length-1];
		System.out.println();
		System.out.println("Min = " + min +" and Max = " + max);
	}

	
	
	public static void maxMininArray() {
		int counter = 0;
		int[] mark = { 2, 3, 1, 4, 5 };
		int[] copyArray = new int[mark.length];
		System.out.println("Original = " + Arrays.toString(mark));
		for (int x : mark) {
			copyArray[counter] = x;
			counter++;
		}
		System.out.println("Copied = " + Arrays.toString(copyArray));
	}
	

	public static int findArrayIndex(int temp) {
		int count = -1;
		int[] mark = { 2, 3, 1, 4, 5 };
		for (int x : mark) {
			if (x == temp) {
				System.out.println(++count);
				return count; // we used return so that whevener desired int found program stop execution else
								// it will complete loop
			}
			count++;
		}
		return count;

	}
	
	
	public static void arrayContainsSomething(int temp) {
		int flag = 0;
		int[] mark = { 2, 3, 1, 4, 5 };
		for (int x : mark) {

			if (x == temp) {
				System.out.println("Arrays contains " + temp);
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println("Array does not contains " + temp);
		}

	}

	public static void gridprint() {
		for (int i = 0 ; i < 11 ; i++) {
			for (int j = 0 ; j <= 10  ; j++) {
				System.out.print("- ");
			}System.out.println();
		}
	}
	
	
	public static void sumOfArray() {
		int sum = 0;
		int[] mark = { 2, 3, 1, 4, 5 };
		for (int i : mark) {
			sum = sum + i;
		}
		System.out.println();
		System.out.println(sum);
	}
	
	public static void sortArrayUsingKeyword() {
		int[] mark = { 2, 3, 1, 4, 5 };
		Arrays.sort(mark);
		System.out.print(Arrays.toString(mark));
	}

	public static void changecase(String str) {
		for (char x : str.toCharArray()) {
			if (x >= 65 & x <= 90) {
				x = (char) (x + 32);
			} else if (x >= 97 & x <= 122) {
				x = (char) (x - 32);
			}
			System.out.print(x);
		}
		System.out.println();

	}

}
