package Patterns;

public class mysteriousNumber {

	public static void main(String[] args) {
		int num = 110;
		int flag = 0;
		for (int i = (num/2)+1; i > 0; i--) {

			String actual = String.valueOf(i);
			String expected = reverse(actual);
			if (num == (Integer.parseInt(expected) + i)) {
				flag = 1;
				System.out.println("Number is myterious i.e, : "+ i + " and " + expected);
			}
		}
		if (flag == 0) {
			System.out.println("Number is not myterious");
		}
	}

	public static String reverse(String str) {
		String reverse = "";
		for (int i = 0; i <str.length(); i++) {
			reverse = str.charAt(i)+ reverse;
		}
		return reverse;
		
	}

}