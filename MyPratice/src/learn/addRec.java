package Patterns;

public class addRec {

	static int a = -5000000;
	static int b = 60;

	public static void main(String[] args) {

		System.out.println(recsum(b));

	}

	public static int recsum(int y) {
		if ((y > 0)) {
			a++;
			recsum(--y);
		}

		else if (y < 0) {
			a--;
			recsum(++y);
		}
		return a;
	}

}
