package Patterns;

public class qqqqqqqqq {

	public static void main(String[] args) {
		int a[] = {1,1,1,3,3,4,5,5,5,3,3};

		int count = 0;
		int flag = 0;
		for (int i = 0; i < a.length - 1; i++) {

			if (a[i] == a[i + 1]) {
				if (flag == 0) {
					flag = 1;
					count++;
				} else
					continue;
			} else {
				flag = 0;
			}
		}

		System.out.println(count);
	}
}
