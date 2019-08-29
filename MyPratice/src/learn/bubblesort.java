package Patterns;

public class bubblesort {

	public static void main(String[] args) {
		int[] a = { 2, 1, 4, 3, 6, 5, 8, 3, 6 };

		int leng = a.length;
		//bubble(leng, a);
		selectionSort(leng,a);

	}
	/*
	 * for (int x : a ) { System.out.print(x + " "); }System.out.println();
	 */

	public static void bubble(int len, int a[]) {
		int temp = 0;
		System.out.print("Original array : ");
		for (int x : a) {
			System.out.print(x + " ");
		}
		System.out.println();
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len - 1; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;

				}

			}
		}
		System.out.print("After Bubble Sorting : ");
		for (int x : a) {
			System.out.print(x + " ");
		}
		System.out.println();
	}

	
	public static void selectionSort(int len, int a[]) {
		System.out.print("Original array : ");
		for (int x : a) {
			System.out.print(x + " ");
		}System.out.println();
		
		for (int i = 0; i < len; i++) {
			int small = i; 
			int temp;
			for (int j = i+1; j < len; j++) {
				if (a[j]<a[small]) {
					small = j;
				}
			}
			temp = a[i];
			a[i] = a[small];
			a[small] = temp;
			
		}
		System.out.print("After Selection Sorting : ");
		for (int x : a) {
			System.out.print(x + " ");
		}
		System.out.println();

	}
	
	

	
	
}
