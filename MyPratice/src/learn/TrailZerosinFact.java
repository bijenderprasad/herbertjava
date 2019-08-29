package Patterns;

public class TrailZerosinFact {

	public static void main(String[] args) {

		trailZeroCount(10000);

	}

	public static void trailZeroCount(int num) {
		int loop = num;
		int count = 0;
		if (num < 5)
			System.out.println("Trail Spaces = 0");

		else {
			while (loop > 0) {
				int last = loop;
				while (last % 5 ==0) {
						count++;
						last = last / 5;
					}
				loop--;	
			}
				
			}
		System.out.println("Trail Spaces = " + count);

		
	}
		
	}
	

