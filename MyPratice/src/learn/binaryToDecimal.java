package Patterns;

public class binaryToDecimal {

	public static void main(String[] args) {
	
		String num = "110011";
		int sum = 0;
		
		int k = 1;
		
		char [] ch = num.toCharArray();
		System.out.println(ch);
		int len = ch.length;
		
		//System.out.println(digit);
		for (int i = 0 ; i < ch.length; i++) {
			int digit =Integer.parseInt(Character.toString(ch[len-k]));
			sum = (int) (sum + (digit * Math.pow(2, i)));
			k++;
		}
		System.out.println(sum);

		
	}

}
