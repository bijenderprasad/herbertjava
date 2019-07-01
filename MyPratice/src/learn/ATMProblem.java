package Patterns;

import java.util.Scanner;

public class ATMProblem {

	public static void main(String[] args) {
		{
			char c = '\u0061';
			System.out.println(c);
			
	 		Scanner sc = new Scanner(System.in);
			int withDrow=sc.nextInt();
	    	double accBalance=sc.nextDouble();
	    	//System.out.printf(String.format("%.2f", balance(withDrow,accBalance)));
	    	//System.out.printf("%.2f",balance(withDrow,accBalance));
		}
	}
		
		public static double balance(int withDrow,double accBalance){
		    if(withDrow%5!=0 || withDrow+0.5>accBalance) return accBalance;
		    else
		        return accBalance - withDrow - 0.5;

	}

}
