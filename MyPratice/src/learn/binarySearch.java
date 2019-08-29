package Patterns;

public class binarySearch {

	public static void main(String[] args) {

		int [] a = {1,2,3,4,5,6,7,8,9,10};
		int first = 0;
		int last = a.length-1;
		
		int num = 10;
		
		while (first <=last) {
			
			int mid = (first + last)/2;
			if (num > a[mid]) {
				first = mid + 1;
			}
			if (a[mid]==num) {
				System.out.println("Element found at " + mid + " index");
				break;
			}
			if (num<a[mid]) {
				last = mid-1;
			}
		}
		
		if (first>last) {
			System.out.println("Element not found");
		}

	}

}
