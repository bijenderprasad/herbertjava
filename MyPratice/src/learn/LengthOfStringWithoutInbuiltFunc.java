package Patterns;

public class LengthOfStringWithoutInbuiltFunc {

	public static void main(String[] args) {
		String str = "Bijender Prasad";
		//System.out.println(str.to);
		String strNew = str+"\0";
		int count = 0;
		char ch[] = str.toCharArray();
		for (char x : ch) {
			count++;
		}
		System.out.println(count);
	}
	
	
	

}
