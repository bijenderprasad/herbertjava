package Patterns;

//		153 is an Armstrong number.
//		1*1*1 + 5*5*5 + 3*3*3 = 153

public class findarmstrong {

	public static void main(String[] args) {
		isArmstrong(154);


	}

	public static void isArmstrong(int num) {
		int onum = num;
		int rem;
		int sum = 0;
		int len = length(num);
		while (num > 0) {
			rem = num % 10;
			num = num/10;
			sum = (int) (sum + (Math.pow(rem,len)));
			
		}
		if (onum==sum) {
			System.out.println("Number is Armstrong");
		}
		else
			System.out.println("Number is not armstrong");
	}

	public static int length(int len) {
		int count = 0;

		while (len > 0) {
			len = len / 10;
			count++;
		}
		return count;
	}

}
