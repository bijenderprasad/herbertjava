package arrays;

import java.util.Scanner;

public class loopsbasic {

	public static void main(String[] args) {
	 /*int i,j;
	 i=100; j=300;
	 while (++i<--j);
	 System.out.println("MidPoint is " + i);
	 */
		primefinder(15+2);
	
	}
	
	
		/*Scanner scn = new Scanner (System.in);
	System.out.println("Enter number = ");
	int num	= scn.nextInt();
	*/
	public static  void primefinder(int num) {
		
		boolean isprime;
		if (num<2) isprime =false;
		else isprime=true;
		
		for (int i=2;i<num/i;i++) {
			if ((num%i)==0) {
				isprime = false;
				break;
							}
									}
		
		if(isprime) System.out.println("prime");
		else System.out.println("Not prime");
	}

	
	
}
